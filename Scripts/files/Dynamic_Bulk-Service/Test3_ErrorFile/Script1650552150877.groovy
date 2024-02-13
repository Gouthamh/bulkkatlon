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



fileName = WS.concatenate((([GlobalVariable.FullQualifiedFilePath, GlobalVariable.Dynamic_FileName]) as String[]))

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBDocs'(GlobalVariable.Mongo_URL,
	GlobalVariable.MongoDBName, 'BULK_DATA_FILE_INFO', fileName)

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'BULK_DATA_FILE_INFO')

output = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : GlobalVariable.Dynamic_LocalPath, ('bulkProcessName') : GlobalVariable.Dynamic_BulkProcess
			, ('bulkId') : GlobalVariable.Dynamic_bulkID, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(output, 'uploadDetails[0].status', 'Successful')

WS.sendRequestAndVerify(findTestObject('Dynamic_Bulk_Service/Dynamic_Count_Failure_Test3', [('bulkProcessName') : GlobalVariable.Dynamic_BulkProcess, ('URL') : GlobalVariable.URL]))

count1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'BULK_DATA_FILE_INFO')

WS.verifyEqual(count, count1)