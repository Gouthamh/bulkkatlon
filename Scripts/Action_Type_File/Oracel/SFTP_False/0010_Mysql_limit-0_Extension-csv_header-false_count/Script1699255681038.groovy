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

//CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')
//
//InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')
//
//println(InitalCountProceesed)
//
//WS.verifyEqual(InitalCountProceesed, InitalCountProceesed + 0)
//
//response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/MYSQL_Actiontyep_file', [('ServiceName') : GlobalVariable.POST_bulkProcess
//            , ('BulkID') : GlobalVariable.POST_bulkID, ('RetryEnable') : false, ('FileHeaders') : 'notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount'
//            , ('IsHeaderEnable') : false, ('SftpEnable') : false, ('CompressEnable') : false, ('Limit') : '0', ('FileExtension') : '.csv'
//            , ('FieldSeparator') : '|']))
//
//WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
//WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.POST_bulkID)
//
//WS.verifyElementPropertyValue(response, 'status', 'Successful')
//
//WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.POST_bulkProcess, ('URL') : GlobalVariable.URL
//            , ('stoplimitunderlimit') : 0]))
//
//finalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')
//
//println(finalCountProceesed)
//
//filecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(10, 0)
//
//WS.verifyEqual(InitalCountProceesed, finalCountProceesed - filecount)
//
//fileext = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/', 
//    '.csv')
//
//println(fileext)
//
//WS.verifyEqual(true, fileext)
//
//header = CustomKeywords.'sftp_keyword.refactor_sftp.Header_is_present'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/', 
//    'notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount')
//
//println(header)
//
//WS.verifyEqual(header, false)
//
//FileCount = CustomKeywords.'sftp_keyword.refactor_sftp.SftpFileCount'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')
//
//println(FileCount)
//
//WS.verifyEqual(FileCount, filecount)

WebUI.callTestCase(findTestCase('Action_Type_File/Oracel/SFTP_False/0007_Mysql_limit-0_Extension-csv_header-false'), [:], FailureHandling.STOP_ON_FAILURE)


sftprecordcount = CustomKeywords.'sftp_keyword.refactor_sftp.SftpAllFileCount'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(sftprecordcount)

countmysql = 10;

println(countmysql)

WS.verifyEqual(sftprecordcount, countmysql)

