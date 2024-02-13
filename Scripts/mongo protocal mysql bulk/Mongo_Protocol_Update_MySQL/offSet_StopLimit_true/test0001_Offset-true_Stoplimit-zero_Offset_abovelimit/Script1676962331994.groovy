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

response = WS.sendRequest(findTestObject('bulk_master_api/mongomysql/update', [('ServiceName') : GlobalVariable.updatemysql
            , ('BulkID') : GlobalVariable.updatemysqlid, ('StopLimit') : GlobalVariable.offsetiszero, ('OffsetEnable') : GlobalVariable.Offset_true]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.updatemysqlid)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexServicesName, 'db-mongo-update-mysql')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexServiceId, 106)

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexBulktype, 'DB-MYSQL')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexProtocal, 'MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexOperation, 'Update')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexCollection, 'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexCondition, '{:0}')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexUpdate, '{:1}')

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexOffset, GlobalVariable.Offset_true)

WS.verifyElementPropertyValue(response1, GlobalVariable.UpdateMysqlIndexStopLimit, GlobalVariable.offsetiszero)

////////////////////////////////
WebUI.callTestCase(findTestCase('mongo protocal mysql bulk/Mongo_Protocol_Create_MySQL/offSet_StopLimit_false/test0001_Offset-true_Stoplimit-zero_Offset_zero'), 
    [:], FailureHandling.STOP_ON_FAILURE)

initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '1')

initial12 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 1')

////////////////////////
initial2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '2')

initial21 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 2')

////////////////////////
initial3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAPBULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '3')

initial32 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 3')

////////////////////////
initial4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '4')

initial42 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 4')

////////////////////////
initial5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '5')

initial52 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 5')

////////////////////////
initial6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '6')

initial62 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 6')

////////////////////////
initial7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '7')

initial72 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 7')

////////////////////////
WS.sendRequest(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.updatemysql
            , ('Offset') : GlobalVariable.offsetisabovelimit]))

////////////////////////////////
final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '1')

WS.verifyEqual(initial1, final1)

final12 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 1')

WS.verifyEqual(initial12, final12)

////////////////////////
final2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '2')

WS.verifyEqual(initial2, final2)

final21 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 2')

WS.verifyEqual(initial21, final21)

////////////////////////
final3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAPBULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '3')

WS.verifyEqual(initial3, final3)

final32 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 3')

WS.verifyEqual(initial32, final32)

////////////////////////
final4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '4')

WS.verifyEqual(initial4, final4)

final42 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 4')

WS.verifyEqual(initial42, final42)

////////////////////////
final5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '5')

WS.verifyEqual(initial5, final5)

final52 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 5')

WS.verifyEqual(initial52, final52)

////////////////////////
final6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '6')

WS.verifyEqual(initial6, final6)

final62 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 6')

WS.verifyEqual(initial62, final62)

////////////////////////
final7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '7')

WS.verifyEqual(initial7, final7)

final72 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 7')

WS.verifyEqual(initial72, final72)