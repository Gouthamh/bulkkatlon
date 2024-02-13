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

fileName = WS.concatenate((([GlobalVariable.FullQualifiedFilePath, 'Test3_Post_Successentries_Count.csv']) as String[]))

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBDocs'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'BULK_DATA_FILE_INFO', fileName)

Count1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchEntry'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'BULK_DATA_FILE_INFO', 'fileStatus', 'PROCESSED')

filePath = WS.concatenate((([GlobalVariable.Data_Files, 'Test3_Post_Successentries_Count.csv']) as String[]))

WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : filePath, ('bulkProcessName') : GlobalVariable.Sync_BulkProcess
			, ('bulkId') : GlobalVariable.Sync_BulkID, ('URL') : GlobalVariable.URL]))

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Sync_BulkProcess, ('URL') : GlobalVariable.URL]))

Count2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchEntry'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'BULK_DATA_FILE_INFO', 'fileStatus', 'PROCESSED')


WS.verifyEqual(Count1, Count2 - 1)