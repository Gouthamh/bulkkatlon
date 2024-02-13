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

response = WS.sendRequest(findTestObject('bulk_master_api/oracle/oracel_Api_int', [('ServiceName') : GlobalVariable.oracal_api_int_rest[
            0], ('BulkID') : GlobalVariable.oracal_api_int_rest[1], ('StopLimit') : 0, ('OffsetEnable') : true]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB', FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.oracal_api_int_rest[1], FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response123 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response123, GlobalVariable.oracal_index[0], GlobalVariable.oracal_api_int_rest[0], FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response123, GlobalVariable.oracal_index[1], GlobalVariable.oracal_api_int_rest[1], FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response123, GlobalVariable.oracal_index[2], 1001, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response123, GlobalVariable.oracal_index[4], true, FailureHandling.STOP_ON_FAILURE)

////////////////////////////////////////
InitialEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.TimeStamp')

InitalcountEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

println('InitialEntries ' + InitialEntries)

Woroflowresponse = WS.sendRequest(findTestObject('Workflow/createZeebeWorkflow'))

WS.verifyElementPropertyValue(Woroflowresponse, 'processes[0].bpmnProcessId', 'bNotification1221')

responseAPI = WS.sendRequest(findTestObject('Oracel_Api_intmention_withoffset', [('id') : 0]))

WS.verifyElementPropertyValue(responseAPI, 'response', 'oracledb-test triggered Successfully')

FinalEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.TimeStamp')



WS.verifyEqual(InitialEntries , FinalEntries)

//WS.verifyEqual(InitalcountEntries + 1, FinalcountEntries)

////////////////////////////
/*
 * WS.sendRequest(findTestObject('Oracel_Api_intmention_withoutoffset', [('id')
 * : 100]))
 * 
 * WS.verifyElementPropertyValue(responseAPI, 'response', 'oracledb-test
 * triggered Successfully')
 * 
 * FinalEntries123 =
 * CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.
 * MySqlURI, GlobalVariable.MySqlUserName, GlobalVariable.MySqlPassword,
 * 'smdb.TimeStamp')
 * 
 * 
 * 
 * WS.verifyEqual(FinalEntries +1, FinalEntries123)
 * 
 * //WS.verifyEqual(FinalcountEntries + 1, FinalcountEntries123)
 * 
 * ///////////////////////////////
 * WS.sendRequest(findTestObject('Oracel_Api_intmention_withoutoffset', [('id')
 * : 100]))
 * 
 * WS.verifyElementPropertyValue(responseAPI, 'response', 'oracledb-test
 * triggered Successfully')
 * 
 * FinalEntries1234 =
 * CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.
 * MySqlURI, GlobalVariable.MySqlUserName, GlobalVariable.MySqlPassword,
 * 'smdb.TimeStamp')
 * 
 * 
 * WS.verifyEqual(FinalEntries123, FinalEntries1234)
 * 
 * //WS.verifyEqual(FinalcountEntries123, FinalcountEntries1234)
 */