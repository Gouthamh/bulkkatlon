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

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;


class sftp_connection {

	@Keyword
	def sftpcount(String sftpUserName,String sftpPassword,String sftpHost,String sftpPort,String sshkey,String sftpPath) {
		/*String localPath = "";
		 String sftpPath = "";
		 String sftpHost = "172.20.21.57";
		 String sftpPort = "31703";
		 String sftpUserName = "admin";
		 String sftpPassword = "admin";
		 String sshkey = "172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==";*/

		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(sftpUserName, sftpHost, Integer.valueOf(sftpPort));
			System.out.println("------------");
			// jsch.setKnownHosts("knownhost");
			jsch.setKnownHosts(new ByteArrayInputStream(sshkey.getBytes()));
			// jsch.setKnownHosts(new ByteArrayInputStream(sshkey.getBytes()));
			// session.getConfig(sshkey.getBytes);
			session.setPassword(sftpPassword);
			session.connect();
			Channel channel = session.openChannel("sftp");
			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.connect();
			System.out.println("------------connect-----------" + channelSftp.isConnected());
			ChannelSftp channelsftpconnection = (ChannelSftp) channelSftp;
			System.out.println("channelsftpconnection----------" + channelsftpconnection);
			channelsftpconnection.cd(sftpPath);
			System.out.println("remove----------");
			// channelsftpconnection.rm("notification-5425819.tar.gz");
			System.out.println("remove----------");
			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);
			System.out.println("------------ls.size()-----------" + (ls.size() - 2));
			return ls.size() - 2;
			channelSftp.exit();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Keyword
	def sftpdeleteAllrecords(String sftpUserName,String sftpPassword,String sftpHost,String sftpPort,String sshkey,String sftpPath) {
		System.out.println(false);
		// String files = null;
		/*String localPath = "";
		 String sftpHost = "172.20.21.57";
		 String sftpPort = "31703";
		 String sftpUserName = "admin";
		 String sftpPassword = "admin";
		 String sshkey = "172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==";
		 */
		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(sftpUserName, sftpHost, Integer.valueOf(sftpPort));
			System.out.println("------------");
			// jsch.setKnownHosts("knownhost");
			jsch.setKnownHosts(new ByteArrayInputStream(sshkey.getBytes()));
			// jsch.setKnownHosts(new ByteArrayInputStream(sshkey.getBytes()));
			// session.getConfig(sshkey.getBytes);
			session.setPassword(sftpPassword);
			session.connect();
			Channel channel = session.openChannel("sftp");
			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.connect();
			System.out.println("------------connect-----------" + channelSftp.isConnected());
			ChannelSftp channelsftpconnection = (ChannelSftp) channelSftp;
			System.out.println("channelsftpconnection----------" + channelsftpconnection);
			channelsftpconnection.cd(sftpPath);
			System.out.println("remove----------");
			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls(sftpPath);
			for (ChannelSftp.LsEntry entry : ls) {
				SftpATTRS attrs = channelSftp.lstat("/bulk-store/" + entry.getFilename());
				String sftppermission = attrs.getPermissionsString();
				System.out.println("sftppermission-----" + sftppermission);
				InputStream inputStream = channelSftp.get(sftpPath + entry.getFilename());
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				ArrayList<String> array = new ArrayList<String>();
				array.add(attrs.getPermissionsString());
				for(String e : array) {
					if(e.equals("-rw-r--r--")&&e.equals("drwxrwxrwx")) {
						System.out.println("<----fullpath insdie----->");
						channelsftpconnection.rm(sftpPath + entry.getFilename());
						System.out.println("------" + entry.getFilename());
					}
				}
			}

			channelSftp.exit();
		} catch (Exception e) {
			e.printStackTrace();

		}

		// TODO Auto-generated method stub
	}


	@Keyword
	def readfilefromsftp() {
		System.out.println(false);
		String sftpHost = "172.20.21.57";
		String sftpPort = "31703";
		String sftpUserName = "admin";
		String sftpPassword = "admin";
		String sshkey = "172.20.21.57 ssh-rsa AAAAB3NzaC";

		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(sftpUserName, sftpHost, Integer.valueOf(sftpPort));
			System.out.println("------------");
			// jsch.setKnownHosts("knownhost");
			jsch.setKnownHosts(new ByteArrayInputStream(sshkey.getBytes()));
			// jsch.setKnownHosts(new ByteArrayInputStream(sshkey.getBytes()));
			// session.getConfig(sshkey.getBytes);
			session.setPassword(sftpPassword);
			session.connect();
			Channel channel = session.openChannel("sftp");
			ChannelSftp channelSftp = (ChannelSftp) channel;
			channelSftp.connect();
			// channelSftp.exit();
			System.out.println("------------connect-----------" + channelSftp.isConnected());
			ChannelSftp channelsftpconnection = (ChannelSftp) channelSftp;
			System.out.println("channelsftpconnection----------" + channelsftpconnection);
			channelsftpconnection.cd("/bulk-store/");
			System.out.println("remove----------");
			// channelsftpconnection.rm("/bulk-store/mysql3817660005.csv");
			// channelsftpconnection.rmdir("/bulk-store/mysql3817660005.csv");
			System.out.println("remove----------");
			Vector<ChannelSftp.LsEntry> ls = channelSftp.ls("/bulk-store/");
			System.out.println("------------ls.size()-----------" + (ls.size() - 2));
			System.out.println("------------files-----------");

			for (ChannelSftp.LsEntry entry : ls) {
				// System.out.println("<--------->"+"/bulk-store/"+entry.getFilename());
				SftpATTRS attrs = channelSftp.lstat("/bulk-store/" + entry.getFilename());
				String sftppermission = attrs.getPermissionsString();
				// System.out.println("sftppermission-----" + sftppermission);
				ArrayList<String> array = new ArrayList<String>();
				array.add(attrs.getPermissionsString());
				long lines = 0;
				for (String e : array) {
					if (e.equals("-rw-r--r--")) {
						InputStream inputStream = channelSftp.get("/bulk-store/" + entry.getFilename());
						BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
						String files;
						System.out.println("getFilename----->"+entry.getFilename());
						while (((files = reader.readLine()) != null)) {
							return files;
							//lines++;
						}

					}

				}

			}

			System.out.println();

			channelSftp.exit();

		} catch (Exception e) {
			e.printStackTrace();

		}

		// TODO Auto-generated method stub


	}




}

