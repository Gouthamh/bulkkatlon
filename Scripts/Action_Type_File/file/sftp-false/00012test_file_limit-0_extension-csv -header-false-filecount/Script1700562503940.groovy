import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Action_Type_File/file/sftp-false/0009test_file_limit-1_extension-csv -header-false'), [:], FailureHandling.STOP_ON_FAILURE)



sftprecordcount = CustomKeywords.'sftp_keyword.refactor_sftp.SftpAllFileCount'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(sftprecordcount)

countmysql = 10

println(countmysql)

WS.verifyEqual(sftprecordcount, countmysql)



