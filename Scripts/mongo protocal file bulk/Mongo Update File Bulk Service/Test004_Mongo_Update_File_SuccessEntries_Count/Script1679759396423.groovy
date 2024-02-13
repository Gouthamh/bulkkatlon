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

WebUI.callTestCase(findTestCase('mongo protocal file bulk/Mongo Create File Bulk Service/test0005_create'), [:], FailureHandling.STOP_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Mongo_Create_File_BulkProcess
	, ('URL') : GlobalVariable.URL]))

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Mongo_Create_File_BulkProcess
	, ('URL') : GlobalVariable.URL]))

fileName = WS.concatenate((([GlobalVariable.FullQualifiedFilePath, 'test2_update.csv']) as String[]))

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBDocs'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO', fileName)

countFiles = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_File_BulkService_Collection)

fileSend = WS.concatenate((([GlobalVariable.Data_Files, 'test2_update.csv']) as String[]))

output = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : fileSend, ('bulkProcessName') : GlobalVariable.Mongo_Update_File_BulkProcess
            , ('bulkId') : GlobalVariable.Mongo_Update_File_BulkID, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(output, 'uploadDetails[0].status', 'Successful')

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Mongo_Update_File_BulkProcess
            , ('URL') : GlobalVariable.URL]))

countFiles2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_File_BulkService_Collection)

WS.verifyEqual(countFiles, countFiles2 - 1)

WS.verifyEqual(countEntries, countEntries2)

first = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'Name', 'Goutham1')

System.out.println('first' + first)

WS.verifyEqual(first, 'Goutham1')

second = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'Name', 'Goutham12')

System.out.println('second' + second)

WS.verifyEqual(second, 'Goutham12')

third = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'Name', 'Goutham13')

System.out.println('third' + third)

WS.verifyEqual(third, 'Goutham13')

fourth = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'Name', 'Goutham14')

System.out.println('fourth' + fourth)

WS.verifyEqual(fourth, 'Goutham14')

fivith = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'Name', 'Goutham15')

System.out.println('fivith' + fivith)

WS.verifyEqual(fivith, 'Goutham15')

/////////////
first = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'information.Name', 'Goutham1')

System.out.println('first' + first)

WS.verifyEqual(first, 'Goutham1')

second = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'information.Name', 'Goutham12')

System.out.println('second' + second)

WS.verifyEqual(second, 'Goutham12')

third = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'information.Name', 'Goutham13')

System.out.println('third' + third)

WS.verifyEqual(third, 'Goutham13')

fourth = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'information.Name', 'Goutham14')

System.out.println('fourth' + fourth)

WS.verifyEqual(fourth, 'Goutham14')

fivith = CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'information.Name', 'Goutham15')

System.out.println('fivith' + fivith)

WS.verifyEqual(fivith, 'Goutham15')


