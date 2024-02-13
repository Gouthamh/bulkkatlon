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

response = WS.sendRequestAndVerify(findTestObject('bulk_master_api/mongoDB/update_Api_for_mongo_bulk_type', [('URL') : GlobalVariable.URL, ('UpdateBulkMasterConfig') : GlobalVariable.UpdateBulkMasterConfig
            , ('ServiceName') : GlobalVariable.Mongo_BulkProcess, ('ServiceId') : GlobalVariable.Mongo_BulkID, ('StopLimit') : GlobalVariable.offsetisabovelimit
            , ('OffSet') : GlobalVariable.Offset_false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Mongo_BulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBServicebNameIndex, GlobalVariable.Mongo_BulkProcess)

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBServicesIdIndex, GlobalVariable.Mongo_BulkID)

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBOffsetIndex, GlobalVariable.Offset_false)

WS.verifyElementPropertyValue(response1, GlobalVariable.MongoDBStopLimitIndex, GlobalVariable.offsetisabovelimit)

//////////////////////////////////////////////////////////////////////////////////////////////
Requests = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection)

System.out.println('Requests-->' + Requests)

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

WS.delay(10)

System.out.println('countEntries-->' + countEntries)

response2 = WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI_DB_Bulk', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.Mongo_BulkProcess
            , ('stoplimitunderlimit') : GlobalVariable.stoplimitunderlimit])) //1st

WS.verifyElementPropertyValue(response2, 'response', 'mongodb-bulk-service triggered Successfully')

WS.delay(20)

countEntries1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries1-->' + countEntries1)

WS.verifyEqual(countEntries, countEntries1-Requests)

/*WS.sendRequestAndVerify(findTestObject('TriggerBulkAPIWithJsonEmpty',[('URL'):GlobalVariable.URL,('bulkProcessName'):GlobalVariable.Mongo_BulkProcess]))//2nd

countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries2-->' + countEntries2)

WS.verifyEqual(countEntries1, countEntries2 - GlobalVariable.stoplimitunderlimit)

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPIWithJsonEmpty',[('URL'):GlobalVariable.URL,('bulkProcessName'):GlobalVariable.Mongo_BulkProcess]))//3nd

countEntries3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries3-->' + countEntries3)

WS.verifyEqual(countEntries2, countEntries3 - GlobalVariable.stoplimitunderlimit)

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPIWithJsonEmpty',[('URL'):GlobalVariable.URL,('bulkProcessName'):GlobalVariable.Mongo_BulkProcess]))//4nd

countEntries4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries4-->' + countEntries4)

WS.verifyEqual(countEntries3, countEntries4 - GlobalVariable.stoplimitunderlimit)

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPIWithJsonEmpty',[('URL'):GlobalVariable.URL,('bulkProcessName'):GlobalVariable.Mongo_BulkProcess]))//5nd

countEntries5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries5-->' + countEntries5)

WS.verifyNotEqual(countEntries4, countEntries5 - GlobalVariable.stoplimitunderlimit)*/