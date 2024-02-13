package basicOperations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class RandomStringGenerator {

	String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
	@Keyword
	def String randomString(String chars, int length) {
		// chars = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}


	@Keyword
	def int ramdon() {
		return (int) (Math.random()*10000);
	}

	@Keyword
	def int filecount(int records, int limit){

		int fileCount = 0;
		int recordCount = 0;

		if (limit > records || limit == 0) {
			int fileCount1 = 1;
			int recordCount1 = records;
			return fileCount1;
			System.out.println("filecount : " + fileCount1 + ", record_count : " + recordCount1);

		} else {
			fileCount = records / limit;
			recordCount = records % limit;

			if (recordCount != 0) {
				int fileCount1 = fileCount + 1;
				return fileCount1;
				System.out.println("filecount : " + fileCount1);
				System.out.println("number of line in file : " + limit);
				System.out.println("remaining file count : " + recordCount);
			} else {
				return fileCount;
				System.out.println("filecount : " + fileCount);
				System.out.println("number of line in files : " + limit);
			}
		}
	}

	@Keyword
	def boolean comparelist(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
		if(arrayList.equals(arrayList2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
