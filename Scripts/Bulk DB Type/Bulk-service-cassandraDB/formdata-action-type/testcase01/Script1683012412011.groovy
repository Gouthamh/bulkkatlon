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
import internal.GlobalVariable

import org.junit.After
import org.openqa.selenium.Keys as Keys

response = WS.sendRequest(findTestObject('bulk_master_api/Cassandra-db/form-data-updateAPI', [('ServiceName') : GlobalVariable.cassandravalue[
            0], ('BulkID') : GlobalVariable.cassandravalue[1], ('BulkType') : GlobalVariable.cassandravalue[2], ('EndPoint') : GlobalVariable.cassandravalue[
            3], ('Content-Type') : GlobalVariable.cassandravalue[4], ('Method') : GlobalVariable.cassandravalue[5], ('NodeId') : GlobalVariable.cassandravalue[
            6], ('CqlQuery') : GlobalVariable.cassandravalue[7], ('Notify') : GlobalVariable.cassandravalue[8], ('RestEndoint') : GlobalVariable.cassandravalue[
            9], ('variable_10') : GlobalVariable.cassandravalue[10], ('variable_11') : GlobalVariable.cassandravalue[11]]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.cassandravalue[1])

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1=WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response1, GlobalVariable.cassandraindexvalue[0], GlobalVariable.cassandravalue[0])

println (GlobalVariable.cassandraindexvalue[0])

println (GlobalVariable.cassandravalue[0])

/*
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[1], GlobalVariable.cassandravalue[1])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[2], GlobalVariable.cassandravalue[2])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[3], GlobalVariable.cassandravalue[3])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[4], GlobalVariable.cassandravalue[4])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[5], GlobalVariable.cassandravalue[5]) 5
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[6], GlobalVariable.cassandravalue[6])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[7], GlobalVariable.cassandravalue[7])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[8], GlobalVariable.cassandravalue[8])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[9], GlobalVariable.cassandravalue[9])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[10], GlobalVariable.cassandravalue[10])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[11], GlobalVariable.cassandravalue[11])
 * 
 * WS.verifyElementPropertyValue(response1,
 * GlobalVariable.cassandraindexvalue[12], GlobalVariable.cassandravalue[12])
 */