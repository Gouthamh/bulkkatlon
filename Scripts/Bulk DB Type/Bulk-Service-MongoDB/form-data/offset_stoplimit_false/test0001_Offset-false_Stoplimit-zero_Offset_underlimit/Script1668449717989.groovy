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

response = WS.sendRequest(findTestObject('bulk_master_api/mongoDB/form_data', [('URL') : GlobalVariable.URL, ('ServiceName') : GlobalVariable.Mongo_BulkProcess
            , ('BulkID') : GlobalVariable.Mongo_BulkID, ('StopLimit') : GlobalVariable.stoplimitunderlimit, ('OffsetEnable') : GlobalVariable.Offset_false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Mongo_BulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1=WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBServicebNameIndex, GlobalVariable.Mongo_BulkProcess)

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBServicesIdIndex, GlobalVariable.Mongo_BulkID)

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoFormdataEndpoint, 'http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotificationForEmailAttachment')

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoFormdataProtocal, 'FORM-DATA')

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBOffsetIndex, GlobalVariable.Offset_false)

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBStopLimitIndex, GlobalVariable.stoplimitunderlimit)
//////////////////////////////////////////////////////////////////////////////////////////////
Requests = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_Form_Data)

System.out.println('Requests-->' + Requests)

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

WS.delay(10)

System.out.println('countEntries-->' + countEntries)

response2=WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI_DB_Bulk',[('URL'):GlobalVariable.URL,('bulkProcessName'):GlobalVariable.Mongo_BulkProcess,('stoplimitunderlimit'):GlobalVariable.stoplimitunderlimit]))

WS.delay(20)

WS.verifyElementPropertyValue(response2, 'response', 'mongodb-bulk-service triggered Successfully')

countEntries1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries1-->' + countEntries1)

WS.verifyEqual(countEntries, countEntries1 - GlobalVariable.stoplimitunderlimit)