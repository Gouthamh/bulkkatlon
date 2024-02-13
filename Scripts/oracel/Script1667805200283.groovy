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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//println('path--->' + path123)
//
//path123 = 'files/file1.csv'
//
//println('path--->' + path123)
//
//WS.sendRequest(findTestObject('uploadfiletest', [('file') : path123]))
//
//finalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//    1], GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')
//
//println(finalCountProceesed)

CustomKeywords.'sftp_keyword.refactor_sftp.SftpFileList'(GlobalVariable.sftpUserName, GlobalVariable.sftpPassword, GlobalVariable.sftpHost, GlobalVariable.Post_cache_service_host, GlobalVariable.sshKey, '/bulk-store/')

	

