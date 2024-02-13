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
import basicOperations.RandomStringGenerator as RandomStringGenerator

String chars = 'abcdefghijklmnopqrstuvwxyz0123456789'

String BoltonCode = RandomStringGenerator.randomString(chars, 4)

output = WS.sendRequestAndVerify(findTestObject('Cache_POST', [('URL') : GlobalVariable.URL, ('boltonCode') : BoltonCode]))

WS.verifyElementPropertyValue(output, 'resultCode', 200)

WS.comment(BoltonCode)

WS.verifyElementPropertyValue(output, 'resultMessage', 'Succes')

output2 = WS.sendRequestAndVerify(findTestObject('Cache_POST', [('URL') : GlobalVariable.URL, ('boltonCode') : BoltonCode]))

WS.verifyElementPropertyValue(output2, 'resultCode', 400)

WS.verifyElementPropertyValue(output2, 'resultMessage', 'Code already exist')

