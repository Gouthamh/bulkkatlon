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

/*initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '1')

initial12 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 1')*/
/*initial14 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.emailTo', 'gouthamraj.kr@tecnotree.com')

initial15 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '1')

initial16 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.Name', 'Goutham-1')

////////////////////////
initial2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '2')

initial21 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 2')

initial22 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.msisdn', '9182244')

initial23 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.emailTo', 'gouthamraj.kr@tecnotree.com')

initial24 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '1')

initial26 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.Name', 'Goutham-2')

////////////////////////
initial3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAPBULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '3')

initial32 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 3')

initial33 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.msisdn', '32342')

initial34 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.emailTo', 'gouthamraj.kr@tecnotree.com')

initial35 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '1')

initial36 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.Name', 'Goutham-3')

////////////////////////
initial4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '4')

initial42 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 4')

initial43 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.msisdn', '543')

initial44 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.emailTo', 'gouthamraj.kr@tecnotree.com')

initial45 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '4')

initial46 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.Name', 'Goutham-4')

////////////////////////
initial5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '5')

initial52 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 5')

initial53 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.msisdn', '4543')

initial54 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.emailTo', 'gouthamraj.kr@tecnotree.com')

initial55 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '1')

initial56 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.Name', 'Goutham-6')

////////////////////////
initial6 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '6')

initial62 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 6')

initial63 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.msisdn', '1')

initial64 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.emailTo', 'gouthamraj.kr@tecnotree.com')

initial65 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '6')

initial66 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.Name', 'Goutham-6')

////////////////////////
initial7 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '7')

initial72 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 7')

initial73 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.msisdn', '9182435.7')

initial74 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.emailTo', 'gouthamraj.kr@tecnotree.com')

initial75 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.DataPlan', '7')

initial76 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.Name', 'Goutham-7')

////////////////////////

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.id', '1')

WS.verifyEqual(initial1, final1)

final12 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.inputValue.NAME', 'Meera Kumar 1')

WS.verifyEqual(initial12, final12)
*/
//final13 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
//    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL', '$.msisdn', '91821123456')
//
//WS.verifyEqual(initial13, final13)
//response = WS.sendRequest(findTestObject('bulk_master_api/mongoDB/Action_type-mongo', [('ServiceName') : 'cache-sync-bulk-service'
//            , ('BulkID') : 901, ('OffsetEnable') : false, ('StopLimit') : '0', ('RetryEnable') : false, ('IsHeaderEnable') : false
//            , ('SftpEnable') : true, ('CompressEnable') : false, ('FileExtension') : false, ('FieldSeparator') : '|', ('sendNotification') : false
//            , ('pvc') : false, ('sftp') : false, ('enrichEnable') : false, ('Limit') : '0']))
//
//WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
//WS.verifyElementPropertyValue(response, 'bulkId', '901')
//
//WS.verifyElementPropertyValue(response, 'status', 'Successful')

response=WS.sendRequest(findTestObject('bulk_master_api/oracle/actiontype_file', [('ServiceName') : GlobalVariable.GroupID_BulkProcess, ('BulkID') : GlobalVariable.GroupID_BulkID
	, ('OffsetEnable') : true, ('RetryEnable') : false, ('IsHeaderEnable') : false, ('SftpEnable') : true
	, ('CompressEnable') : false, ('Limit') : 0, ('FileExtension') : '.csv', ('FieldSeparator') : '|'
	, ('sendNotification') : false, ('pvc') : false, ('sftp') : false, ('Notify') : false, ('variable_2') : false, ('variable_3') : false]))


WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.GroupID_BulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')