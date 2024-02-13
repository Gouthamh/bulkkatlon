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

response = WS.sendRequest(findTestObject('bulk_master_api/oracle/create_oracel', [('ServiceName') : GlobalVariable.oracel_create_service_name
            , ('BulkID') : GlobalVariable.oracel_create_id, ('StopLimit') : GlobalVariable.offsetiszero, ('uri') : GlobalVariable.URL
            , ('OffsetEnable') : GlobalVariable.Offset_true]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', 111)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[0], GlobalVariable.create_oracel_value[0])

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[1], GlobalVariable.create_oracel_value[1])

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[2], GlobalVariable.create_oracel_value[2])

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[3], GlobalVariable.create_oracel_value[3])

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[4], GlobalVariable.create_oracel_value[4])

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[5], GlobalVariable.create_oracel_value[5])

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[6], GlobalVariable.create_oracel_value[6])

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[7], GlobalVariable.offsetiszero)

WS.verifyElementPropertyValue(response1, GlobalVariable.create_oracel_index[8], GlobalVariable.Offset_true)

///////////////////////////////////////////////////////////////////////////
CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_KAFKA', 'notificationId', 2094)

WS.delay(10)

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_KAFKA')

WS.delay(10) 

WS.verifyEqual(count, 0)


WS.sendRequest(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.oracel_create_service_name
            , ('Offset') : GlobalVariable.offsetiszero]))

/////////////////////////////////////////////////////////////////
initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.create_oracel_value[4], 'msisdn', '1')

System.out.println(initial1)

WS.verifyEqual(initial1, 1)

initial2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.create_oracel_value[4], 'msisdn', '2')

System.out.println(initial2)

WS.verifyEqual(initial2, 2)

initial11 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '1')

System.out.println(initial11)

WS.verifyEqual(initial11, 1)

initial12 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '0')

System.out.println(initial12)

WS.verifyEqual(initial12, 0)

WS.sendRequest(findTestObject('TriggerBulkAPIWithJsonEmpty', [('bulkProcessName') : GlobalVariable.oracel_create_service_name, ('URL') : GlobalVariable.URL]))


initial3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.create_oracel_value[4], 'msisdn', '3')

System.out.println(initial3)

WS.verifyEqual(initial3, 3)

initial4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.create_oracel_value[4], 'msisdn', '4')

System.out.println(initial4)

WS.verifyEqual(initial4, 4)

initial13 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '2')

System.out.println(initial13)

WS.verifyEqual(initial13, 2)

initial14 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '3')

System.out.println(initial14)

WS.verifyEqual(initial14, 3)

WS.sendRequest(findTestObject('TriggerBulkAPIWithJsonEmpty', [('bulkProcessName') : GlobalVariable.oracel_create_service_name, ('URL') : GlobalVariable.URL]))



initial5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.create_oracel_value[4], 'msisdn', '5')

System.out.println(initial5)

WS.verifyEqual(initial5, 5)

/////////////////////////////////////////////////////////////////////////





initial15 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '4')

System.out.println(initial15)

WS.verifyEqual(initial15, 4)

initial14 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '4')

System.out.println(initial14)

WS.verifyEqual(initial14, 4)

WS.sendRequest(findTestObject('TriggerBulkAPIWithJsonEmpty', [('bulkProcessName') : GlobalVariable.oracel_create_service_name, ('URL') : GlobalVariable.URL]))

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_KAFKA')

WS.delay(10)

WS.verifyEqual(count, 5)


