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

response = WS.sendRequestAndVerify(findTestObject('TriggerNotificationSMS', [('notificationId') : GlobalVariable.Notification_Id, ('msisdn') : '9000000001'
            , ('shortCode') : 8001, ('amount') : 11.11,('emailTo'):'gouthamraj.kr@tecnotree.com', ('systemId') : 'smppclient1', ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(response, 'responseNotificationPayload.EMAILDESC.RESPONSECODE', 'SUCCESS')

WS.verifyElementPropertyValue(response, 'responseNotificationPayload.EMAILDESC.RESPONSEDESC', 'EMAIL_NOTIFICATION SUCCESSFULLY TRIGGERED')

