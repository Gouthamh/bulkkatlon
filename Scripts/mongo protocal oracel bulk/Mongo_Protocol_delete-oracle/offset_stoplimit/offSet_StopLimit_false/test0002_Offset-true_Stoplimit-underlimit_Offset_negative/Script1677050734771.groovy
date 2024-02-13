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

response = WS.sendRequest(findTestObject('bulk_master_api/oracle/delete_oracel', [('ServiceName') : GlobalVariable.delete_oracel_value[
            0], ('BulkID') : GlobalVariable.delete_oracel_value[1], ('StopLimit') : GlobalVariable.stoplimitunderlimit, ('OffsetEnable') : GlobalVariable.Offset_false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.delete_oracel_value[1])

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[0], GlobalVariable.delete_oracel_value[0])

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[1], GlobalVariable.delete_oracel_value[1])

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[2], GlobalVariable.delete_oracel_value[2])

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[3], GlobalVariable.delete_oracel_value[3])

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[4], GlobalVariable.delete_oracel_value[4])

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[5], GlobalVariable.delete_oracel_value[5])

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[6], GlobalVariable.delete_oracel_value[6])

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[7], GlobalVariable.stoplimitunderlimit)

WS.verifyElementPropertyValue(response1, GlobalVariable.delete_oracel_index[8], GlobalVariable.Offset_false)

WebUI.callTestCase(findTestCase('mongo protocal oracel bulk/Mongo_Protocol_Create_oracle/offSet_StopLimit_false/test0003_Offset-false_Stoplimit-zerolimit_Offset_zero'), 
    [:], FailureHandling.STOP_ON_FAILURE)

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_KAFKA')

WS.delay(10)

WS.verifyEqual(count, 5)

//////////////////////////////////////////////////////////////////////////////////////////

WS.sendRequest(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.delete_oracel_value[0]
	, ('Offset') : GlobalVariable.offsetisnegative]))

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_KAFKA')

WS.delay(10)

WS.verifyEqual(count, 5)