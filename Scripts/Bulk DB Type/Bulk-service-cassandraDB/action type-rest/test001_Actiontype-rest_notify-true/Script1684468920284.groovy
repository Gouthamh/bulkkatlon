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

response = WS.sendRequest(findTestObject('bulk_master_api/Cassandra-db/rest_updataApi', [('ServiceName') : GlobalVariable.cassandravalue[
            0], ('BulkID') : GlobalVariable.cassandravalue[1], ('CqlQuery') : GlobalVariable.cassandravalue[7], ('Notify') : true]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', 859)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

///////////////////////////////////////////////////////////

InitialEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName,
	GlobalVariable.MySqlPassword, 'smdb.TimeStamp')


countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

WS.delay(10)

System.out.println('countEntries-->' + countEntries)

response2 = WS.sendRequest(findTestObject('Cassandra_triggerapi', [('bulkProcessName') : GlobalVariable.cassandravalue[0], ('URL') : GlobalVariable.URL
            , ('valeid1') : 3, ('valeid') : 0]))


WS.delay(10)

WS.verifyElementPropertyValue(response2, 'response', 'cassandra-bulk-service triggered Successfully')

countEntries1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

System.out.println('countEntries1-->' + countEntries1)

FinalEntries = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName,
	GlobalVariable.MySqlPassword, 'smdb.TimeStamp')

WS.verifyEqual(countEntries+3, countEntries1)

WS.verifyEqual(InitialEntries+1, FinalEntries)
