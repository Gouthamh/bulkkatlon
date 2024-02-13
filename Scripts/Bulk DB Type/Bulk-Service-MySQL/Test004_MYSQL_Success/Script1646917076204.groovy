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


response = WS.sendRequestAndVerify(findTestObject('bulk_master_api/Mysql/mysql_update_bulk_services',[('URL'):GlobalVariable.URL,('UpdateBulkMasterConfig'):GlobalVariable.UpdateBulkMasterConfig,('Offset_true'):GlobalVariable.Offset_false,('dummiservicename'):GlobalVariable.MySql_BulkProcess,('dummiid'):GlobalVariable.MySql_BulkID,('StopLimit'):0]))

//WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.MySql_BulkProcess, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.MySql_BulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1=WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, '[46].serviceName', 'mysql')

WS.verifyElementPropertyValue(response1,'[41].bulkID',GlobalVariable.MySql_BulkID)

WS.verifyElementPropertyValue(response1,'[41].mysqlParameters.OffsetEnable',GlobalVariable.Offset_false)

WS.verifyElementPropertyValue(response1,'[41].mysqlParameters.StopLimit',0)





///////////////


InitialEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, GlobalVariable.MySqlPassword, 'smdb.BulkNotificationServices')

System.out.println("InitialEntries__"+InitialEntries)

/*countProcessed = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_RETRY_STORE')
*/
countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

System.out.println("countEntries__"+countEntries)

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.MySql_BulkProcess, ('URL') : GlobalVariable.URL]))

/*countProcessed2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_RETRY_STORE')*/

WS.delay(40)

countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

//WS.delay(60)

System.out.println("countEntries2__"+countEntries2)

WS.verifyEqual(countEntries, countEntries2 - InitialEntries)

