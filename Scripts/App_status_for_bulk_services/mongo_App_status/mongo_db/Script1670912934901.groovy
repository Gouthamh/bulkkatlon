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

response = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response, 'status', 'Waiting for trigger')

response1 = WS.sendRequest(findTestObject('bulk_master_api/mongoDB/Update_App_status', [('URL') : GlobalVariable.URL, ('ServiceName') : GlobalVariable.Mongo_BulkProcess
            , ('ServiceId') : GlobalVariable.Mongo_BulkID, ('collectionName') : GlobalVariable.App_Status_Collection]))

WS.verifyElementPropertyValue(response1, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response1, 'bulkId', GlobalVariable.Mongo_BulkID)

WS.verifyElementPropertyValue(response1, 'status', 'Successful')

response2 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response2, GlobalVariable.MongoDBServicebNameIndex, 'mongodb-bulk-service')

WS.verifyElementPropertyValue(response2, GlobalVariable.MongoDBServicesIdIndex, 11)

WS.verifyElementPropertyValue(response2, GlobalVariable.MongoDBCollection, 'APP_STATUS')

//////////////////////////////////////////////////////////////////////////////////////////
response3 = WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.Mongo_BulkProcess
            , ('URL') : GlobalVariable.URL, ('stoplimitunderlimit') : 0]))

WS.verifyElementPropertyValue(response3, 'response', 'mongodb-bulk-service triggered Successfully')




response4 = WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.Mongo_BulkProcess
            , ('URL') : GlobalVariable.URL, ('stoplimitunderlimit') : 0]))

//WS.delay(5)
WS.verifyElementPropertyValue(response4, 'response', 'BULK REQUEST PROCESSING IS ALREADY TRIGGERED AND IN RUNNING STATE')

response5 = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response5, 'status', 'triggered and running')

/*response6 = WS.sendRequest(findTestObject('pauseBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response6, 'response', 'mongodb-bulk-service paused Successfully')

response7 = WS.sendRequest(findTestObject('pauseBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response7, 'response', 'notification-bulk-service Cannot be paused as the service is not running ')

response8 = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response8, 'status', 'triggered and paused')
*/
