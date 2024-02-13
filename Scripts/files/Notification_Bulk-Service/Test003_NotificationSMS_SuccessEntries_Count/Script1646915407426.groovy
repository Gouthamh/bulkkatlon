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

fileName = WS.concatenate((([GlobalVariable.FullQualifiedFilePath, 'Test3_Notification_SuccessEntries_Count.csv']) as String[]))

System.out.println(fileName)

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBDocs'(GlobalVariable.Mongo_URL, 
    GlobalVariable.MongoDBName, 'BULK_DATA_FILE_INFO', fileName)

countFiles = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, 
    GlobalVariable.MongoDBName, 'BULK_DATA_FILE_INFO')

WS.delay(10);

System.out.println("countFiles--->"+countFiles)

countEntries = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, 
    GlobalVariable.MongoDBName, 'NOTIFICATION_EMAIL_HISTORY')

WS.delay(10)

System.out.println("countEntries"+countEntries)

filePath = WS.concatenate((([GlobalVariable.Data_Files, 'Test3_Notification_SuccessEntries_Count.csv']) as String[]))

System.out.println("fileName--"+fileName)

WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : filePath, ('bulkProcessName') : GlobalVariable.Notification_BulkProcess
            , ('bulkId') : GlobalVariable.Notification_BulkID, ('URL') : GlobalVariable.URL]))

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Notification_BulkProcess, ('URL') : GlobalVariable.URL]))

countFiles2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, 
    GlobalVariable.MongoDBName, 'BULK_DATA_FILE_INFO')

WS.delay(10)

System.out.println("countFiles2--->"+countFiles2)

countEntries2 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, 
    GlobalVariable.MongoDBName, 'NOTIFICATION_EMAIL_HISTORY')

WS.delay(10)

System.out.println("countFiles--->"+countFiles)
System.out.println("countFiles2--->"+countFiles2)
System.out.println("countEntries--->"+countEntries)
System.out.println("countEntries2--->"+countEntries2)


WS.verifyEqual(countFiles, countFiles2 - 1)



WS.verifyEqual(countEntries, countEntries2 - 1)





