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
import basicOperations.RandomStringGenerator

String value = "01234567890123456789001234567889"
String msisdnValue = RandomStringGenerator.randomString(value, 10)

 WS.sendRequestAndVerify(findTestObject('processSequential_HazelCast', [('notificationId') : GlobalVariable.Notification_Id
	, ('emailTo') : 'divya.basetti@tecnotree.com', ('msisdn') : msisdnValue, ('shortCode') : 8001, ('systemId') : 'smppclient1'
	, ('URL') : GlobalVariable.URL]))

 WS.sendRequestAndVerify(findTestObject('processSequential_HazelCast', [('notificationId') : GlobalVariable.Notification_Id
	, ('emailTo') : 'divya.basetti@tecnotree.com', ('msisdn') : msisdnValue, ('shortCode') : 8001, ('systemId') : 'smppclient1'
	, ('URL') : GlobalVariable.URL]))

output3 = WS.sendRequestAndVerify(findTestObject('processSequential_HazelCast', [('notificationId') : GlobalVariable.Notification_Id
	, ('emailTo') : 'divya.basetti@tecnotree.com', ('msisdn') : msisdnValue, ('shortCode') : 8001, ('systemId') : 'smppclient1'
	, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output3, 'msg', 'MqsequentialData processed successfully for received mqsequentialKey')

WS.verifyElementPropertyValue(output3, 'status', 'Success')

output5 = WS.sendRequestAndVerify(findTestObject('statusUpdate_HazelCast', [('mqsequentialId') : msisdnValue, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output5, 'msg', 'MqsequentialData processed successfully for received mqsequentialKey')

WS.verifyElementPropertyValue(output5, 'status', 'Success')

output6 = WS.sendRequestAndVerify(findTestObject('statusUpdate_HazelCast', [('mqsequentialId') : msisdnValue, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output6, 'msg', 'MqsequentialData processed successfully for received mqsequentialKey')

WS.verifyElementPropertyValue(output6, 'status', 'Success')

output4 = WS.sendRequestAndVerify(findTestObject('statusUpdate_HazelCast', [('mqsequentialId') : msisdnValue, ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(output4, 'msg', 'no MqsequentialData to process for received mqsequentialKey')

WS.verifyElementPropertyValue(output4, 'status', 'Success')

