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

response = WS.sendRequest(findTestObject('bulk_master_api/oracle/Update_oeacel', [('ServiceName') : GlobalVariable.oracel_update_value[
			0], ('BulkType') : GlobalVariable.oracel_update_value[1], ('BulkID') : GlobalVariable.oracel_update_value[2]
			, ('StopLimit') : GlobalVariable.stoplimitunderlimit, ('OracleQuery') : GlobalVariable.oracel_update_value[4]
			, ('Protocol') : GlobalVariable.oracel_update_value, ('collectionName') : GlobalVariable.oracel_update_value[
			5], ('condition') : GlobalVariable.oracel_update_value[6], ('OffsetEnable') : GlobalVariable.Offset_false, ('updateFields') : GlobalVariable.oracel_update_value[7]]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.oracel_update_value[2])

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.oracelupdateindex[0], GlobalVariable.oracel_update_value[0])

WS.verifyElementPropertyValue(response1, GlobalVariable.oracelupdateindex[1], GlobalVariable.oracel_update_value[2])

WS.verifyElementPropertyValue(response1, GlobalVariable.oracelupdateindex[2], GlobalVariable.oracel_update_value[1])

WS.verifyElementPropertyValue(response1, GlobalVariable.oracelupdateindex[3], GlobalVariable.oracel_update_value[5])

WS.verifyElementPropertyValue(response1, GlobalVariable.oracelupdateindex[4], GlobalVariable.Offset_false)

WS.verifyElementPropertyValue(response1, GlobalVariable.oracelupdateindex[5], GlobalVariable.stoplimitunderlimit)

WebUI.callTestCase(findTestCase('mongo protocal oracel bulk/Mongo_Protocol_Create_oracle/offSet_StopLimit_false/test0003_Offset-false_Stoplimit-zerolimit_Offset_zero'),
	[:], FailureHandling.STOP_ON_FAILURE)

println(GlobalVariable.oracel_update_value[0])

response123 = WS.sendRequestAndVerify(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.oracel_update_value[
			0], ('Offset') : GlobalVariable.offsetisabovelimit]))

initial1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'msisdn', '1')

System.out.println(initial1)

WS.verifyEqual(initial1, 1)

initial11 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '-9')

System.out.println(initial11)

WS.verifyEqual(initial11, -9)

///////////////////////////////////////////////////////////


initial2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'msisdn', '2')

System.out.println(initial2)

WS.verifyEqual(initial2, 2)

initial14 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '-8')

System.out.println(initial14)

WS.verifyEqual(initial14, -8)

/////////////////////////////////////////////////////////////////



initial3 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'msisdn', '3')

System.out.println(initial3)

WS.verifyEqual(initial3, 3)

initial12 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '2')

System.out.println(initial12)

WS.verifyEqual(initial12, 2)

//////////////////////////////////////////////////////////////


initial4 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'msisdn', '4')

System.out.println(initial4)

WS.verifyEqual(initial4, 4)

initial12 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '3')

System.out.println(initial12)

WS.verifyEqual(initial12, 3)

//////////////////////////////////////////////////////////

initial5 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'msisdn', '5')

System.out.println(initial5)

WS.verifyEqual(initial5, 5);



initial13 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '4')

System.out.println(initial13)

WS.verifyEqual(initial13, 4)
	
/////////////////////////////////)


/*
 * initial15 =
 * CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(
 * GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
 * GlobalVariable.create_oracel_value[4], 'inputValue.Phone', '-6')
 * 
 * System.out.println(initial15)
 * 
 * WS.verifyEqual(initial15, -6)
 */