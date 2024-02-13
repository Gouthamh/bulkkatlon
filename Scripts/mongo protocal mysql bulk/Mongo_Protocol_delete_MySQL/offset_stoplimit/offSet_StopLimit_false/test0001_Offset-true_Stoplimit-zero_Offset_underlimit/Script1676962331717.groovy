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

response = WS.sendRequest(findTestObject('bulk_master_api/mongomysql/delete', [('ServiceName') : GlobalVariable.deleteMysql
            , ('BulkID') : GlobalVariable.deletemysqlid, ('StopLimit') : GlobalVariable.offsetiszero, ('OffsetEnable') : GlobalVariable.Offset_false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.deletemysqlid)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexServiceName, 'db-mongo-delete-mysql')

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndqxBulkId, 107)

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexBulkType, 'DB-MYSQL')

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexProtocal, 'MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexOperation, 'Delete')

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexCollection, 'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL')

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexCondition, '{:0}')

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexOddSet, GlobalVariable.Offset_false)

WS.verifyElementPropertyValue(response1, GlobalVariable.DeleteMysqlIndexStopLimit, 0)

WebUI.callTestCase(findTestCase('mongo protocal mysql bulk/Mongo_Protocol_Create_MySQL/offSet_StopLimit_false/test0001_Offset-true_Stoplimit-zero_Offset_zero'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WS.sendRequest(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.deleteMysql
            , ('Offset') : GlobalVariable.stoplimitunderlimit]))

initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '1')

WS.verifyNotEqual(initial1, '1')

/////
initial2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '2')

WS.verifyNotEqual(initial2, '2')

/////
initial3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '3')

WS.verifyNotEqual(initial3, '3')

/////
initial4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '4')

WS.verifyNotEqual(initial4, '4')

/////
initial5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '5')

WS.verifyNotEqual(initial5, '5')

/////
initial6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '6')

WS.verifyNotEqual(initial6, '6')

/////
initial7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '7')

WS.verifyNotEqual(initial7, '7')
//WS.verifyNotEqual(response, response1)

WS.delay(30)

count1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL')

InitialEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName,
	GlobalVariable.MySqlPassword, 'smdb.test_delete_update')

WS.verifyEqual(count1+InitialEntries, InitialEntries)