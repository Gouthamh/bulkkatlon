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

response=WS.sendRequest(findTestObject('bulk_master_api/file/deletefile'))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', 17)


fileName = WS.concatenate((([GlobalVariable.FullQualifiedFilePath, 'test3_delete.csv']) as String[]))

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBDocs'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO', fileName)

countFiles = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_File_BulkService_Collection)

fileSend = WS.concatenate((([GlobalVariable.Data_Files, 'test3_delete.csv']) as String[]))

output = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : fileSend, ('bulkProcessName') : GlobalVariable.Mongo_Delete_File_BulkProcess
            , ('bulkId') : GlobalVariable.Mongo_Delete_File_BulkID, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(output, 'uploadDetails[0].status', 'Successful')

  WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName')
  : GlobalVariable.Mongo_Delete_File_BulkProcess , ('URL') :
  GlobalVariable.URL]))
  
  countFiles2 =
  CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(
  GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 'BULK_DATA_FILE_INFO')
  
	/*
	 * countEntries2 =
	 * CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(
	 * GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	 * GlobalVariable.'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE')
	 * 
	 * WS.delay(30)
	 * 
	 * WS.verifyEqual(countFiles, countFiles2 - 1)
	 * 
	 * WS.verifyEqual(countEntries, countEntries2 + 1)
	 */
  
  
  
 