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

/*
 * response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/form_data',
 * [('URL') : GlobalVariable.URL, ('UpdateBulkMasterConfig') :
 * GlobalVariable.UpdateBulkMasterConfig , ('BulkID') : 467, ('ServiceName') :
 * 'formdata', ('OffsetEnable') : true, ('StopLimit') : 2]))
 * 
 * WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration
 * successfuly updated into DB')
 * 
 * WS.verifyElementPropertyValue(response, 'bulkId', 467)
 * 
 * WS.verifyElementPropertyValue(response, 'status', 'Successful')
 * 
 * response1 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))
 * 
 * WS.verifyElementPropertyValue(response1, '[50].serviceName', 'formdata')
 * 
 * WS.verifyElementPropertyValue(response1, '[50].bulkID', '467')
 * 
 * WS.verifyElementPropertyValue(response1, '[50].action.EndPoint',
 * 'http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/
 * triggerNotificationForEmailAttachment')
 * 
 * WS.verifyElementPropertyValue(response1, '[50].action.Protocol', 'FORM-DATA')
 * 
 * WS.verifyElementPropertyValue(response1, '[50].mysqlParameters.OffsetEnable',
 * true)
 * 
 * WS.verifyElementPropertyValue(response1, '[50].mysqlParameters.SqlQuery',
 * 'SELECT ID,NAME,EMAIL,MSISDN,DATAPlan,to_base64(FirstName),filename FROM
 * smdb.UploadTest')
 * 
 * WS.verifyElementPropertyValue(response1, '[50].mysqlParameters.StopLimit',
 * '2')
 */
//WS.setHarFileGeneration(false)
//
//WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
//WS.verifyElementPropertyValue(response, 'bulkId', 111)
//
//WS.verifyElementPropertyValue(response, 'status', 'Successful')
//
//WS.sendRequest(findTestObject('TriggerBulkAPIWithJsonEmpty', [('bulkProcessName') : GlobalVariable.Sync_BulkProcess, ('URL') : GlobalVariable.URL]))

response=WS.sendRequestAndVerify(findTestObject('bulk_master_api/Mysql/emailattach-2', [('URL') : GlobalVariable.URL, ('ServiceName') : GlobalVariable.POST_bulkProcess
            , ('BulkID') : GlobalVariable.POST_bulkID, ('IsHeaderEnable') : GlobalVariable.Offset_false, ('SendEmailAsAttachment') : GlobalVariable.Offset_true
            , ('Limit') : GlobalVariable.offsetiszero, ('FileExtension') : GlobalVariable.FileExtension[0], ('FieldSeparator') : GlobalVariable.FieldSeparator[0]]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
WS.verifyElementPropertyValue(response, 'bulkId',  GlobalVariable.POST_bulkID)
//
WS.verifyElementPropertyValue(response, 'status', 'Successful')