package sftp_keyword
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.ByteArrayInputStream;
import java.util.Vector;

import com.jcraft.jsch.*;

import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;





import com.jcraft.jsch.SftpATTRS;



class refactor_sftp {

	@Keyword
	def int countFiles(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath) {
		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));
			session.setPassword(sftpPassword);
			session.connect();
			Channel channel = session.openChannel("sftp");
			channel.connect();
			ChannelSftp sftpChannel = (ChannelSftp) channel;
			sftpChannel.cd(sftpPath);
			Vector<ChannelSftp.LsEntry> ls = sftpChannel.ls(".");
			return ls.size() - 2;  // Exclude . and .. directories
		} catch (Exception e) {
			e.printStackTrace();
			return -1;  // Return -1 to indicate an error
		}
	}

	@Keyword

	def deleteAllRecords(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath) {
		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));            //jsch.setKnownHosts(sshKey.getBytes());

			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			session.setPassword(sftpPassword);
			session.connect();

			Channel channel = session.openChannel("sftp");
			channel.connect();

			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.cd(sftpPath);

			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);

			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = entry.getAttrs();
				String permissions = attrs.getPermissionsString();

				if (permissions.equals("-rw-r--r--")) {
					String filename = entry.getFilename();
					channelSftp.rm("/bulk-store/" + filename);
					System.out.println("Removed file: " + filename);
				}
			}

			channelSftp.exit();
			session.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword
	def static String readline(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath) {
		String line;
		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));
			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			session.setPassword(sftpPassword);
			session.connect();

			Channel channel = session.openChannel("sftp");
			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.connect();

			channelSftp.cd(sftpPath);

			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);
			List<Integer> lineCounts = new ArrayList<>();

			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = channelSftp.lstat(sftpPath + entry.getFilename());
				String permissions = attrs.getPermissionsString();

				if (permissions.equals("-rw-r--r--")) {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(channelSftp.get(sftpPath + entry.getFilename())));

					int lineCount = 0;

					while ((line = reader.readLine()) != null) {
						lineCount++;
						return line;
					}
					//return line;
					lineCounts.add(lineCount);
				}
			}

			channelSftp.exit();
			session.disconnect();

			// System.out.println("Line counts: " + lineCounts);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Keyword

	def int frequencyOfOccurrenceForEachLineCount(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath) {
		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));
			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			session.setPassword(sftpPassword);
			session.connect();

			Channel channel = session.openChannel("sftp");
			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.connect();

			channelSftp.cd(sftpPath);
			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);

			List<Integer> lineCounts = new ArrayList<>();
			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = channelSftp.lstat(sftpPath + entry.getFilename());
				String sftpPermission = attrs.getPermissionsString();
				if (sftpPermission.equals("-rw-r--r--")) {
					InputStream inputStream = channelSftp.get(sftpPath + entry.getFilename());
					BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
					int lines = 0;
					while (reader.readLine() != null) {
						lines++;
					}
					lineCounts.add(lines);
				}
			}

			Collections.sort(lineCounts);
			System.out.println("Sorted line counts: " + lineCounts);

			Map<Integer, Integer> lineCountFrequency = new HashMap<>();
			for (int key : lineCounts) {
				lineCountFrequency.put(key, lineCountFrequency.getOrDefault(key, 0) + 1);
			}

			int maxFrequency = 0;
			for (int frequency : lineCountFrequency.values()) {
				if (frequency > maxFrequency) {
					maxFrequency = frequency;
				}
			}

			channelSftp.exit();
			session.disconnect();

			return maxFrequency;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Keyword

	def String readAllLines(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath) {
		List<String> lines = new ArrayList<>();

		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));

			Session session = jsch.getSession(sftpUserName, sftpHost, Integer.valueOf(sftpPort));
			session.setPassword(sftpPassword);
			session.connect();

			ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
			channelSftp.connect();
			channelSftp.cd("/bulk-store/");

			Vector<ChannelSftp.LsEntry> files = channelSftp.ls("*");
			for (ChannelSftp.LsEntry entry : files) {
				if (entry.getAttrs().isDir()) {
					continue; // Skip directories
				}

				if (!entry.getAttrs().getPermissionsString().equals("-rw-r--r--")) {
					continue; // Skip files with different permissions
				}

				InputStream inputStream = null;
				BufferedReader reader = null;
				try {
					inputStream = channelSftp.get(entry.getFilename());
					reader = new BufferedReader(new InputStreamReader(inputStream));

					String line;

					while ((line = reader.readLine()) != null) {
						lines.add(line);
					}
				} finally {
					if (reader != null) {
						reader.close();
					}
					if (inputStream != null) {
						inputStream.close();
					}
				}
			}

			channelSftp.disconnect();
			session.disconnect();

			// Convert the lines list to a single string
			StringBuilder sb = new StringBuilder();
			for (String line : lines) {
				sb.append(line).append("\n");
			}
			String result = sb.toString();

			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword
	def String Converting_String_to_HeaderString(String inputString,String endofline,String Delimiter) {

		String[] elements = inputString.split(",");

		StringBuilder stringBuilder = new StringBuilder();

		for (String element : elements) {
			stringBuilder.append(element).append(Delimiter);

			//System.out.println("element--> "+element);
		}

		// Remove the extra "-" at the end of the string
		if (stringBuilder.length() > 0) {
			stringBuilder.setLength(stringBuilder.length()-Delimiter.length());
		}

		String convertedString = stringBuilder.toString();
		if(inputString=="") {
			return "";
		}
		else {
			return convertedString+endofline;
		}
	}
	@Keyword
	def Header_is_present(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath,String headers) {



		List<String> lines = new ArrayList<>();

		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));

			Session session = jsch.getSession(sftpUserName, sftpHost, Integer.valueOf(sftpPort));
			session.setPassword(sftpPassword);
			session.connect();

			ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
			channelSftp.connect();
			channelSftp.cd(sftpPath);

			Vector<ChannelSftp.LsEntry> files = channelSftp.ls("*");
			for (ChannelSftp.LsEntry entry : files) {
				if (entry.getAttrs().isDir()) {
					continue; // Skip directories
				}

				if (!entry.getAttrs().getPermissionsString().equals("-rw-r--r--")) {
					continue; // Skip files with different permissions
				}

				InputStream inputStream = null;
				BufferedReader reader = null;
				try {
					inputStream = channelSftp.get(entry.getFilename());
					reader = new BufferedReader(new InputStreamReader(inputStream));

					String line;

					while ((line = reader.readLine()) != null) {
						lines.add(line);
					}
				} finally {
					if (reader != null) {
						reader.close();
					}
					if (inputStream != null) {
						inputStream.close();
					}
				}
			}

			channelSftp.disconnect();
			session.disconnect();


			// Convert the lines list to a single string
			StringBuilder sb = new StringBuilder();
			for (String line : lines) {
				sb.append(line).append("\n");
			}
			String result = sb.toString();
			System.out.println(result);

			if(result.contains(headers)) {
				return true;

			}
			else {
				return false;
			}



		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword
	def boolean SFTPFileExtensionValidator(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath,String file) {

		List<String> filesexc = new ArrayList<>();
		String fileExtension = null;
		boolean allEqual = false;


		try {

			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));
			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);


			session.setPassword(sftpPassword);
			session.connect();

			ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
			channelSftp.connect();
			channelSftp.cd(sftpPath);

			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);

			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = entry.getAttrs();
				if (attrs.getPermissionsString().equals("-rw-r--r--")) {
					String filename = entry.getFilename();
					fileExtension = filename.substring(filename.lastIndexOf("."));
					filesexc.add(fileExtension);
				}
			}
			System.out.println("filesexc-->" + filesexc);

			//
			//			if (filesexc.stream().distinct().count() == 1 && !filesexc.isEmpty() && file.equals(filesexc.toString())) {
			//				return true;
			//
			//			} else {
			//
			//				return false;
			//
			//			}

			if(filesexc==null || filesexc.size()==0) {
				return true;
			}

			for (int i = 0; i < filesexc.size(); i++) {

				if (!filesexc.get(i).equals(file)) {
					return false; // If any element is different, return false
				}
			}
			return true;

			channelSftp.disconnect();
			session.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword
	def void Deletingsftpwithdirectory(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath) {
		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));

			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			session.setPassword(sftpPassword);
			session.connect();

			System.out.println("Connected to SFTP server");

			Channel channel = session.openChannel("sftp");
			channel.connect();

			System.out.println("Connected to SFTP channel");

			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.cd(sftpPath);

			System.out.println("Changed directory to " + sftpPath);

			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);

			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = entry.getAttrs();
				String permissions = attrs.getPermissionsString();


				if (!permissions.equals("drwxr-xr-x") && !permissions.equals("drwxrwxrwx")) {
					String filename = entry.getFilename();
					System.out.println("Deleting file: " + filename);
					channelSftp.rm(sftpPath + filename);
				}
			}

			channelSftp.exit();
			session.disconnect();
			System.out.println("Disconnected from SFTP server");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword
	def int SftpFileCount(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath){


		//		String sftpHost = "172.20.21.57";
		//		int sftpPort = 31702;
		//		String sftpUserName = "admin";
		//		String sftpPassword = "admin";
		//		String sshKey = "172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==";

		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));

			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			session.setPassword(sftpPassword);
			session.connect();

			ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
			channelSftp.connect();

			System.out.println("-----pwd---"+channelSftp.pwd());
			//channelSftp.mkdir("/data/");

			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);

			List<Integer> lineCounts = new ArrayList<>();
			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = entry.getAttrs();
				String sftpPermission = attrs.getPermissionsString();
				if (sftpPermission.equals("-rw-r--r--")) {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(channelSftp.get(sftpPath + entry.getFilename())));
					int lines = 0;
					while (reader.readLine() != null) {
						lines++;
					}
					lineCounts.add(lines);
				}
			}

			System.out.println(lineCounts.toString());
			System.out.println("------->"+lineCounts.size());
			return lineCounts.size();

			channelSftp.exit();
			session.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword
	def int SftpAllFileCount(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath) {
		//		String sftpHost = "172.20.21.57";
		//		String sftpPort = "31702";
		//		String sftpUserName = "admin";
		//		String sftpPassword = "admin";
		//		String sshkey = "172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==";
		//		String sftpPath = "/bulk-store/"
		int i = 0;
		try {
			JSch jsch = new JSch();
			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));
			Session session = jsch.getSession(sftpUserName, sftpHost, Integer.valueOf(sftpPort));
			session.setPassword(sftpPassword);
			session.connect();

			Channel channel = session.openChannel("sftp");
			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.connect();

			channelSftp.cd(sftpPath);

			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);
			List<Integer> lineCounts = new ArrayList<>();

			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = channelSftp.lstat(sftpPath + entry.getFilename());
				String permissions = attrs.getPermissionsString();

				if (permissions.equals("-rw-r--r--")) {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(channelSftp.get(sftpPath + entry.getFilename())));
					String line;
					int lineCount = 0;

					while ((line = reader.readLine()) != null) {
						System.out.println("--->" + line);
						lineCount++;
						i++;
					}

					lineCounts.add(lineCount);
				}

			}
			return i;

			channelSftp.exit();
			session.disconnect();

			// System.out.println("Line counts: " + lineCounts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword

	def ArrayList<String> SftpFileList(String sftpUserName, String sftpPassword, String sftpHost, int sftpPort, String sshKey, String sftpPath){


		//		String sftpHost = "172.20.21.57";
		//		int sftpPort = 31702;
		//		String sftpUserName = "admin";
		//		String sftpPassword = "admin";
		//		String sshKey = "172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==";

		ArrayList<String> filelist = new ArrayList<>();
		try {
			JSch jsch = new JSch();

			jsch.setKnownHosts(new ByteArrayInputStream(sshKey.getBytes()));

			Session session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			session.setPassword(sftpPassword);
			session.connect();

			ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
			channelSftp.connect();

			System.out.println("-----pwd---"+channelSftp.pwd());
			//channelSftp.mkdir("/data/");

			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);

			List<Integer> lineCounts = new ArrayList<>();
			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = entry.getAttrs();
				String sftpPermission = attrs.getPermissionsString();
				if (!sftpPermission.equals("drwxr-xr-x") && !sftpPermission.equals("drwxrwxrwx")) {
					String filename = entry.getFilename();
					filelist.add(filename);
					Collections.sort(filelist);

				}
			}
			System.out.println(filelist);

			channelSftp.exit();
			session.disconnect();


		} catch (Exception e) {
			e.printStackTrace();
		}
		return filelist;
	}
}
