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

response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/AppStatus_offSet_Is_Disable', [('ServiceName') : GlobalVariable.MySql_BulkProcess
            , ('BulkID') : GlobalVariable.MySql_BulkID, ('SqlQuery') : GlobalVariable.MysqlQuery]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', 429)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('Object Repository/bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBIndexServiceName, 'mysql-post-bulk-service')

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBIndexId, 429)

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDb_AppStatus_Query[0], 'select notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan from smdb.bulkdata')

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBFormdataOffset, false)

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBFormdataStopLimit, GlobalVariable.offsetiszero)

///////////////////////////////////////////////
//System.out.println('Query' + (GlobalVariable.MysqlDb_AppStatus_Query[0]))
appStatuswaitingfortrigger = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(appStatuswaitingfortrigger, 'status', 'Waiting for trigger')

starting = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(starting, 'status', 'Waiting for trigger')

response3 = WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.MySql_BulkProcess
            , ('URL') : GlobalVariable.URL, ('stoplimitunderlimit') : 0]))

WS.verifyElementPropertyValue(response3, 'response', 'mysql-post-bulk-service triggered Successfully')

appStatus = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(appStatus, 'status', 'triggered and running')

response4 = WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.MySql_BulkProcess
            , ('URL') : GlobalVariable.URL, ('stoplimitunderlimit') : 0]))

WS.verifyElementPropertyValue(response4, 'response', 'BULK REQUEST PROCESSING IS ALREADY TRIGGERED AND IN RUNNING STATE')

appStatus = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(appStatus, 'status', 'triggered and running')

pause = WS.sendRequest(findTestObject('pauseBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(pause, 'response', 'mysql-post-bulk-service paused Successfully')

appStatuspause = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(appStatuspause, 'status', 'triggered and paused')

pause1 = WS.sendRequest(findTestObject('pauseBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(pause1, 'response', 'mysql-post-bulk-service paused Successfully')

restart = WS.sendRequest(findTestObject('restartBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(restart, 'response', 'mysql-post-bulk-service resumed Successfully')

appStatusrestart = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(appStatusrestart, 'status', 'triggered and running')

WS.delay(60)

appStatuswaitingfortrigger = WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.MySql_BulkProcess]))

WS.verifyElementPropertyValue(appStatuswaitingfortrigger, 'status', 'Waiting for trigger')