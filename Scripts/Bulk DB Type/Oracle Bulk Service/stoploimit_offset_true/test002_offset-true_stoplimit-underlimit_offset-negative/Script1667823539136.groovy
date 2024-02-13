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

response = WS.sendRequest(findTestObject('bulk_master_api/oracle/update_api_orcale', [('OffsetEnable') : GlobalVariable.Offset_true
            , ('StopLimit') : GlobalVariable.stoplimitunderlimit, ('ServiceName') : GlobalVariable.Oracle_BulkProcess, ('BulkID') : GlobalVariable.Oracle_bulkID]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Oracle_bulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1=WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, '[11].serviceName', GlobalVariable.Oracle_BulkProcess)

WS.verifyElementPropertyValue(response1, '[11].bulkID', GlobalVariable.Oracle_bulkID)

WS.verifyElementPropertyValue(response1, '[11].oracleDbParameters.StopLimit', GlobalVariable.stoplimitunderlimit)

WS.verifyElementPropertyValue(response1, '[11].oracleDbParameters.OffsetEnable', GlobalVariable.Offset_true)

////////////////////////////////////////////////////////////////////////////////////////////////////

int count = 7

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries' + countEntries)

response2=WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.Oracle_BulkProcess
	, ('URL') : GlobalVariable.URL, ('stoplimitunderlimit') : GlobalVariable.offsetisnegative]))

WS.verifyElementPropertyValue(response2, 'response', 'OFFSET VALUE CANNOT BE NEGATIVE')

WS.delay(20)



countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries2__' + countEntries2)

WS.verifyEqual(countEntries, countEntries2)