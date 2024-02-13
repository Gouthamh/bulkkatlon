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

response = WS.sendRequestAndVerify(findTestObject('bulk_master_api/file/createfile', [('ServiceName') : GlobalVariable.mongofilecreate[
            0], ('BulkType') : GlobalVariable.mongofilecreate[1], ('BulkID') : GlobalVariable.mongofilecreate[2], ('NoOfFields') : GlobalVariable.mongofilecreate[
            3], ('FieldSeparator') : GlobalVariable.mongofilecreate[4], ('IsHeaderPresent') : GlobalVariable.mongofilecreate[
            5], ('Protocol') : GlobalVariable.mongofilecreate[6], ('collectionName') : GlobalVariable.mongofilecreate[7]
            , ('Document') : GlobalVariable.mongofilecreate[8]]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.mongofilecreate[2])

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[0], GlobalVariable.mongofilecreate[0])

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[0], GlobalVariable.mongofilecreate[0])

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[1], GlobalVariable.mongofilecreate[2])

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[2], GlobalVariable.mongofilecreate[1])

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[3], GlobalVariable.mongofilecreate[3])

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[4], GlobalVariable.mongofilecreate[4])

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[5], true)

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[6], GlobalVariable.mongofilecreate[6])

WS.verifyElementPropertyValue(response1, GlobalVariable.mongofilecreateindexing[8], GlobalVariable.mongofilecreate[7])

//////////////////////////////////////
CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE', 'Team', 'DAP1')

count = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE')

WS.verifyEqual(count, 0)

fileName = WS.concatenate((([GlobalVariable.FullQualifiedFilePath, 'new_160.csv']) as String[]))

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBDocs'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO', fileName)

countFiles = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    GlobalVariable.Mongo_File_BulkService_Collection)

fileSend = WS.concatenate((([GlobalVariable.Data_Files, 'new_160.csv']) as String[]))

output = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : fileSend, ('bulkProcessName') : GlobalVariable.Mongo_Create_File_BulkProcess
            , ('bulkId') : GlobalVariable.mongofilecreate[2], ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(output, 'uploadDetails[0].status', 'Successful')

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Mongo_Create_File_BulkProcess
            , ('URL') : GlobalVariable.URL]))

countFiles2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE')

System.out.println('countEntries2' + countEntries2)

System.out.println('count' + count)

WS.verifyEqual(countFiles, countFiles2 - 1)

WS.verifyEqual(count, countEntries2 - countEntries2)

first=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','id','1')

System.out.println('first' + first)

WS.verifyEqual(first, 1)

second=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','id','2')

System.out.println('second' + second)

WS.verifyEqual(second, 2)

third=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','id','3')

System.out.println('third' + third)

WS.verifyEqual(third, 3)

fourth=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','id','4')

System.out.println('fourth' + fourth)

WS.verifyEqual(fourth, 4)

fivith=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','id','5')

System.out.println('fivith' + fivith)

WS.verifyEqual(fivith, 5)

/////////////

first=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','information.id','1')

System.out.println('first' + first)

WS.verifyEqual(first, 1)

second=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','information.id','2')

System.out.println('second' + second)

WS.verifyEqual(second, 2)

third=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','information.id','3')

System.out.println('third' + third)

WS.verifyEqual(third, 3)

fourth=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','information.id','4')

System.out.println('fourth' + fourth)

WS.verifyEqual(fourth, 4)

fivith=CustomKeywords.'mongoDatabaseOperations.MongoConnect.fetchFile1234'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE','information.id','5')

System.out.println('fivith' + fivith)

WS.verifyEqual(fivith, 5)
