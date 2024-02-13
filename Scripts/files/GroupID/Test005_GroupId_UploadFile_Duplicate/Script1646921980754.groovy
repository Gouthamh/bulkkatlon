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

fileName = WS.concatenate((([GlobalVariable.FullQualifiedFilePath, GlobalVariable.GroupID_FileName]) as String[]))

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBDocs'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 'BULK_DATA_FILE_INFO', fileName)

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.GroupID_BulkProcess, ('URL') : GlobalVariable.URL]))

fileSend = WS.concatenate((([GlobalVariable.Data_Files, GlobalVariable.GroupID_FileName]) as String[]))

output = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : fileSend, ('bulkProcessName') : GlobalVariable.GroupID_BulkProcess
            , ('bulkId') : GlobalVariable.GroupID_BulkID, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(output, 'uploadDetails[0].status', 'Successful')

output2 = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : fileSend, ('bulkProcessName') : GlobalVariable.GroupID_BulkProcess
            , ('bulkId') : GlobalVariable.GroupID_BulkID, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output2, 'uploadDetails[0].status', 'Failure')

WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.GroupID_BulkProcess, ('URL') : GlobalVariable.URL]))
