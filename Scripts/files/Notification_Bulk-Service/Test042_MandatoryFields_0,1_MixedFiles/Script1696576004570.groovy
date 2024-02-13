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

response = WS.sendRequest(findTestObject('bulk_master_api/file/notification-bulk-service', [('ServiceName') : GlobalVariable.Notification_BulkProcess
            , ('BulkID') : GlobalVariable.Notification_BulkID, ('MandatoryFields') : '0,1',('SkipRowCount') : 0,('CompressFiles') : false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Notification_BulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

CustomKeywords.'sftp_keyword.refactor_sftp.deleteAllRecords'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[1], 
    GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store')

CustomKeywords.'sftp_keyword.refactor_sftp.deleteAllRecords'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[1], 
    GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/ProccessedFiles')

InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[1], 
    GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/ProccessedFiles')

uploadresponse = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : 'files/MandatoryFields-mixeddfiles-0,1.csv'
            , ('bulkProcessName') : GlobalVariable.Notification_BulkProcess, ('bulkId') : GlobalVariable.Notification_BulkID
            , ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(uploadresponse, 'bulkId', GlobalVariable.Notification_BulkID)

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].FileName[0]', 'MandatoryFields-mixeddfiles-0,1.csv')

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].status', 'Successful')

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO', 'fileName', 'MandatoryFields-mixeddfiles-0,1.csv')

countFiles1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

countEntries1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Notification_BulkProcess, ('URL') : GlobalVariable.URL]))

countFiles2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

WS.delay(10)

System.out.println('countFiles2--->' + countFiles2)

countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countFiles--->' + countFiles1)

System.out.println('countFiles2--->' + countFiles2)

System.out.println('countEntries--->' + countEntries1)

System.out.println('countEntries2--->' + countEntries2)

WS.verifyEqual(countFiles1 + 1, countFiles2)

WS.verifyEqual(countEntries1 + 9, countEntries2)

CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[1], 
    GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/ProccessedFiles')

FinalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[1], 
    GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/ProccessedFiles')

WS.verifyEqual(InitalCountProceesed + 1, FinalCountProceesed)
