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

/*
 * response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/api_inte'))
 * 
 * WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration
 * successfuly updated into DB')
 * 
 * WS.verifyElementPropertyValue(response, 'bulkId', 804)
 * 
 * WS.verifyElementPropertyValue(response, 'status', 'Successful')
 */
response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/apimusql', [('ServiceName') : GlobalVariable.Mysql_Api_Intemtion[
            0], ('BulkID') : GlobalVariable.Mysql_Api_Intemtion[1], ('StopLimit') : 50, ('OffsetEnable') : false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Mysql_Api_Intemtion[1])

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response123 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[0], GlobalVariable.Mysql_Api_Intemtion[
    0], FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[1], GlobalVariable.Mysql_Api_Intemtion[
    1], FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[4], 50, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[5], flase, FailureHandling.STOP_ON_FAILURE)
//////////////////////

InitialEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.TimeStamp')

InitalcountEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

println('InitialEntries ' + InitialEntries)

Woroflowresponse = WS.sendRequest(findTestObject('Workflow/createZeebeWorkflow'))

WS.verifyElementPropertyValue(Woroflowresponse, 'processes[0].bpmnProcessId', 'bNotification1221')

responseAPI = WS.sendRequest(findTestObject('MYSQL_API_int_with_Offset', [('DataPlan') : -4]))

WS.verifyElementPropertyValue(responseAPI, 'response', 'mysql-post-bulk-service triggered Successfully')



FinalEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.TimeStamp')

FinalcountEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

WS.verifyEqual(InitialEntries , FinalEntries)

WS.verifyEqual(InitalcountEntries , FinalcountEntries)

////////////////////////

/*
 * WS.sendRequest(findTestObject('MYSQL_API_int_without_Offset',
 * [('DataPlan') : 100]))
 * 
 * WS.verifyElementPropertyValue(responseAPI, 'response',
 * 'mysql-post-bulk-service triggered Successfully')
 * 
 * 
 * 
 * FinalEntries1 =
 * CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.
 * MySqlURI, GlobalVariable.MySqlUserName, GlobalVariable.MySqlPassword,
 * 'smdb.TimeStamp')
 * 
 * FinalcountEntries1 =
 * CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(
 * GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
 * 'NOTIFICATION_EMAIL_HISTORY')
 * 
 * WS.verifyEqual(FinalEntries + 1, FinalEntries1)
 * 
 * WS.verifyEqual(FinalcountEntries + 1, FinalcountEntries1)
 * 
 * //////////////////////////////////
 * 
 * WS.sendRequest(findTestObject('MYSQL_API_int_without_Offset',
 * [('DataPlan') : 100]))
 * 
 * WS.verifyElementPropertyValue(responseAPI, 'response',
 * 'mysql-post-bulk-service triggered Successfully')
 * 
 * 
 * 
 * FinalEntries2 =
 * CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.
 * MySqlURI, GlobalVariable.MySqlUserName, GlobalVariable.MySqlPassword,
 * 'smdb.TimeStamp')
 * 
 * FinalcountEntries2 =
 * CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(
 * GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
 * 'NOTIFICATION_EMAIL_HISTORY')
 * 
 * WS.verifyEqual(FinalEntries1, FinalEntries2)
 * 
 * WS.verifyEqual(FinalcountEntries1, FinalcountEntries2)
 */