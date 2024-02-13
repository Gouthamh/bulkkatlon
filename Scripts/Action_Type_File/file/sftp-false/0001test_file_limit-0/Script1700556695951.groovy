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

CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(InitalCountProceesed)

WS.verifyEqual(InitalCountProceesed, InitalCountProceesed + 0)

CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/ProccessedFiles/')

uploadresponse = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : 'files/MandatoryFields-PROCESSED-0.csv'
	, ('bulkProcessName') : GlobalVariable.Notification_BulkProcess, ('bulkId') : GlobalVariable.Notification_BulkID
	, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(uploadresponse, 'bulkId', GlobalVariable.Notification_BulkID)

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].FileName[0]', 'MandatoryFields-PROCESSED-0.csv')

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].status', 'Successful')

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
'BULK_DATA_FILE_INFO', 'fileName', 'MandatoryFields-PROCESSED-0.csv')

response=WS.sendRequest(findTestObject('bulk_master_api/file/Action_type_file', [('ServiceName') : 'notification-bulk-service', ('BulkID') : 909, ('RetryEnable') : false
	, ('IsHeaderEnable') : false, ('SftpEnable') : false, ('CompressEnable') : false, ('Limit') : '3', ('FileExtension') : '.csv'
	, ('FieldSeparator') : '|', ('sendNotification') : false, ('pvc') : false, ('sftp') : false, ('Notify') : false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
WS.verifyElementPropertyValue(response, 'bulkId', 909)
//
WS.verifyElementPropertyValue(response, 'status', 'Successful')

response = WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.Notification_BulkProcess, ('URL') : GlobalVariable.URL
	, ('stoplimitunderlimit') : 0]))

WS.verifyElementPropertyValue(response, 'response', GlobalVariable.Notification_BulkProcess+' '+'triggered Successfully', FailureHandling.STOP_ON_FAILURE)

finalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.Notification_bulks_services_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(finalCountProceesed)

WS.verifyEqual(InitalCountProceesed+3, finalCountProceesed)



