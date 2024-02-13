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

response=WS.sendRequest(findTestObject('bulk_master_api/mongomysql/create', [('ServiceName') : GlobalVariable.createmysql
	, ('BulkID') : GlobalVariable.Create_mysql_id, ('StopLimit') : GlobalVariable.offsetisabovelimit, ('OffsetEnable') : GlobalVariable.Offset_true]))


WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Create_mysql_id)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexServiceName, 'db-mongo-create-mysql')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexId, 105)

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexBulkType, 'DB-MYSQL')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexProtocal, 'MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexCollection, 'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexOperation, 'Create')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexSqlQuer, 'SELECT ID,NAME,EMAIL,MSISDN,DATAPlan,FirstName FROM smdb.TEST')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexStopLimit, GlobalVariable.offsetisabovelimit)

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMysqlIndexOffset, GlobalVariable.Offset_true)
////////////////////////////////////////////////////////////////////////////////////////////////

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', 'notificationId', '1911')

WS.delay(5)

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL')

//WS.delay(20)

WS.verifyEqual(count, 0)

WS.sendRequest(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.createmysql
            , ('Offset') : GlobalVariable.stoplimitunderlimit]))

WS.delay(5)

count1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL')

InitialEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.TEST')

WS.verifyEqual(count1+GlobalVariable.stoplimitunderlimit, InitialEntries)
/*/////
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '1')

WS.verifyEqual(initial1, '1')

/////
initial2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '2')

WS.verifyEqual(initial2, '2')
*/
/////
initial3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '3')

WS.verifyEqual(initial3, '3')

/////
initial4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '4')

WS.verifyEqual(initial4, '4')

/////
initial5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '5')

WS.verifyEqual(initial5, '5')

/////
initial6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '6')

WS.verifyEqual(initial6, '6')

/////
initial7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '7')

WS.verifyEqual(initial7, '7')

