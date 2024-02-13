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

response = WS.sendRequest(findTestObject('bulk_master_api/mongo_mongo/mongoprotocalcreate', [('ServiceName') : 'db-mongo-create-mongo'
            , ('BulkID') : 108, ('StopLimit') : GlobalVariable.stoplimitunderlimit, ('OffsetEnable') : GlobalVariable.Offset_false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', 108)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexServicename, 'db-mongo-create-mongo')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexId, 108)

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexBulkType, 'DB-MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexProtocal, 'MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexCollectionIP, 'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexOperation, 'Create')

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexCollectionOP, 'MONGO_DB_BULK_TEST')

WS.verifyElementPropertyValue(response1,GlobalVariable.CreateMongoIndexStopLimit, GlobalVariable.stoplimitunderlimit)

WS.verifyElementPropertyValue(response1, GlobalVariable.CreateMongoIndexOffset, GlobalVariable.Offset_false)
////////////////////
CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'notificationId', 2094)

WS.delay(10)

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO')

//WS.delay(30)
WS.verifyEqual(count, 0)

WS.sendRequest(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.Mongo_create
            , ('Offset') : GlobalVariable.offsetiszero]))

WS.delay(20)

FinalDB = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO')

IntialDB = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'MONGO_DB_BULK_TEST')

WS.verifyEqual(IntialDB, -((FinalDB - IntialDB) - GlobalVariable.stoplimitunderlimit))

WS.delay(20)

///////////// 1
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '1')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '1')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

initial2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '7')

System.out.println('initial2__' + initial2)

final2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '7')

System.out.println('final2__' + final2)

WS.verifyEqual(initial2, final2)

/*//WS.sendRequest(findTestObject('Mongo_protocol_create - Copy',[('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.Mongo_create
            ]))
///////////// 3
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '3')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '3')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

///////////// 4
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '4')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '4')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

WS.sendRequest(findTestObject('Mongo_protocol_create - Copy',[('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.Mongo_create
]))
///////////// 5
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '5')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '5')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

///////////// 6
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '6')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '6')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

WS.sendRequest(findTestObject('Mongo_protocol_create - Copy',[('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.Mongo_create
]))
///////////// 7
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '10')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '10')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

///////////// 8
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '7')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '7')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

WS.sendRequest(findTestObject('Mongo_protocol_create - Copy',[('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.Mongo_create
]))
///////////// 9
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '8')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '8')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

///////////// 10
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_BulkService_ReqCollection, 'msisdn', '9')

System.out.println('initial1__' + initial1)

final1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO', 'msisdn', '9')

System.out.println('final1__' + final1)

WS.verifyEqual(initial1, final1)

*/