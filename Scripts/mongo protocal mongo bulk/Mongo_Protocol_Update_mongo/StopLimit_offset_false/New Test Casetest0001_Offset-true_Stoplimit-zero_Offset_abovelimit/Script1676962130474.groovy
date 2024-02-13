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

/*response = WS.sendRequest(findTestObject('bulk_master_api/mongo_mongo/mongoprotocalupdate', [('ServiceName') : GlobalVariable.UpdateMongoServiceName[
            0], ('BulkID') : GlobalVariable.UpdateMongoServiceName[1], ('StopLimit') : GlobalVariable.offsetiszero, ('OffsetEnable') : GlobalVariable.Offset_false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', 109)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[0], 'db-mongo-update-mongo')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[1], 109)

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[2], 'DB-MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[3], 'MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[4], 'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[5], 'Update')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[6], '{:2}')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[10], '{:5}')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[9], GlobalVariable.Offset_false)

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMongoIdex[8], GlobalVariable.offsetiszero)

////////////////////////////////////////////////
WebUI.callTestCase(findTestCase('mongo protocal mongo bulk/Mongo_Protocol_Create_mongo/offSet_StopLimit_false/test0001_Offset-true_Stoplimit-zero_Offset_zero'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Condition1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '1')

Condition2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '2')

Condition3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '3')

Condition4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '4')

Condition5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '5')

Condition6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '6')

Condition7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '7')

Condition8 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '8')

Condition9 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '9')

Condition10 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '10')

////////////////////////////////
ShortCode1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '1001')

ShortCode2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '2001')

ShortCode3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '3001')

ShortCode4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '4001')

ShortCode5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '5001')

ShortCode6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '6001')

ShortCode7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '7001')

ShortCode8 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '8001')

ShortCode9 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '9001')

ShortCode10 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '10001')

//////////////////////////
ShortCode1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '1001')

ShortCode2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '2001')

ShortCode3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '3001')

ShortCode4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '4001')

ShortCode5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '5001')

ShortCode6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '6001')

ShortCode7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '7001')

ShortCode8 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '8001')

ShortCode9 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '9001')

ShortCode10 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.shortCode', '10001')

////////////////////////
ShortCode1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited1')

ShortCode2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited2')

ShortCode3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited3')

ShortCode4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited4')

ShortCode5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited5')

ShortCode6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited6')

ShortCode7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited7')

ShortCode8 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited8')

ShortCode9 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited9')

ShortCode10 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.inputValue.DataPlan', 'unlimited10')

response12 = WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.UpdateMongoServiceName[
            0], ('URL') : GlobalVariable.URL, ('stoplimitunderlimit') : GlobalVariable.offsetisabovelimit]))

WS.verifyElementPropertyValue(response12, 'response', 'db-mongo-update-mongo triggered Successfully')

WS.sendRequest(findTestObject(null))

*/

/*Condition1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', '1')*/




 for(int i=0;i<10;i++){
	 Condition =  CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
		 'MONGO_DB_BULK_TEST_UPDATE_AND-DELETE', '$.msisdn', variable[i])
	 
	
	 System.out.println("Condition1__________"+Condition[0].get(1)) 
 }
 

	 

