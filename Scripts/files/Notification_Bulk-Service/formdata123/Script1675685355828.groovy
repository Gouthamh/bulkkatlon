import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import groovy.io.FileType as FileType

def list = []

def dir = new File('C:/dap/bulk/Bulk-ServiceAutomation -IAT-orginal/Data Files/Pause&Restart')

dir.eachFileRecurse(FileType.FILES, { def file ->
        list << file
    })

//System.out.println('list_____' + list)
for (def variable : list) {
    System.out.println('variable____' + variable)

    WS.sendRequest(findTestObject('multpathformdata', [('variable') : variable]))
}

response_waitfortrigger=WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response_waitfortrigger, 'status', 'Waiting for trigger')

response = WS.sendRequest(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Notification_BulkProcess
            , ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(response, 'response', 'notification-bulk-service triggered Successfully')

response_runningandtrigger=WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response_runningandtrigger, 'status', 'triggered and running')

response1 = WS.sendRequest(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Notification_BulkProcess
            , ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(response1, 'response', 'BULK REQUEST PROCESSING IS ALREADY TRIGGERED AND IN RUNNING STATE')

pause_response = WS.sendRequest(findTestObject('pauseBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.Notification_BulkProcess]))

WS.verifyElementPropertyValue(pause_response, 'response', 'notification-bulk-service paused Successfully')

response_pauseandtrigger=WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response_pauseandtrigger, 'status', 'triggered and paused')

pause_response1 = WS.sendRequest(findTestObject('pauseBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.Notification_BulkProcess]))

WS.verifyElementPropertyValue(pause_response1, 'response', 'notification-bulk-service paused Successfully')

restart_resposne = WS.sendRequest(findTestObject('restartBulkService', [('URL') : GlobalVariable.URL, ('bulkProcessName') : GlobalVariable.Notification_BulkProcess]))

WS.verifyElementPropertyValue(restart_resposne, 'response', 'notification-bulk-service resumed Successfully')

response_runningandtrigger=WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response_runningandtrigger, 'status', 'triggered and running')

response2 = WS.sendRequest(findTestObject('TriggerBulkAPI', [('bulkProcessName') : GlobalVariable.Notification_BulkProcess
            , ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(response2, 'response', 'BULK REQUEST PROCESSING IS ALREADY TRIGGERED AND IN RUNNING STATE')

WS.delay(20)

response_waiting=WS.sendRequest(findTestObject('bulk_master_api/App_status', [('URL') : GlobalVariable.URL, ('services_name') : GlobalVariable.Mongo_BulkProcess]))

WS.verifyElementPropertyValue(response_waiting, 'status', 'Waiting for trigger')


