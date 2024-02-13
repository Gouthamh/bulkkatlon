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

response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/form_data', [('URL') : GlobalVariable.URL, ('ServiceName') : GlobalVariable.MySql_BulkProcess
            , ('BulkID') : GlobalVariable.MySql_BulkID, ('ServiceName') : GlobalVariable.MySql_BulkProcess, ('OffsetEnable') : GlobalVariable.Offset_false
            , ('StopLimit') : GlobalVariable.offsetiszero]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.MySql_BulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBIndexServiceName, GlobalVariable.MySql_BulkProcess)

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBIndexId, GlobalVariable.MySql_BulkID)

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDByFormDataEndpoint, 'http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotificationForEmailAttachment')

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBFormdataProtocal, 'FORM-DATA')

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBFormdataOffset, GlobalVariable.Offset_false)

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBFormdataQuery, 'SELECT ID,NAME,EMAIL,MSISDN,DATAPlan,to_base64(FileData),Filename FROM smdb.UploadTest')

WS.verifyElementPropertyValue(response1, GlobalVariable.MysqlDBFormdataStopLimit, GlobalVariable.offsetiszero)
///////////////////////////////////////////////////////////////////////////////////////////
InitialEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.UploadTest')

System.out.println('InitialEntries__' + InitialEntries)

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries__' + countEntries)

response2=WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.MySql_BulkProcess
            , ('URL') : GlobalVariable.URL,('stoplimitunderlimit'):GlobalVariable.offsetisnegative]))  //1st

WS.verifyElementPropertyValue(response2, 'response', 'OFFSET VALUE CANNOT BE NEGATIVE')

WS.delay(20)

countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries2__' + countEntries2)

WS.verifyEqual(countEntries, countEntries2)   //12

