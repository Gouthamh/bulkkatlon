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

response = WS.sendRequest(findTestObject('bulk_master_api/mongomysql/delete', [('ServiceName') : GlobalVariable.deleteMysql
            , ('BulkID') : GlobalVariable.deletemysqlid, ('StopLimit') : GlobalVariable.offsetiszero, ('OffsetEnable') : GlobalVariable.Offset_true]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.deletemysqlid)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, '[37].serviceName', 'db-mongo-delete-mysql')

WS.verifyElementPropertyValue(response1, '[37].bulkID', 107)

WS.verifyElementPropertyValue(response1, '[37].bulkType', 'DB-MYSQL')

WS.verifyElementPropertyValue(response1, '[37].action.Protocol', 'MONGO')

WS.verifyElementPropertyValue(response1, '[37].action.operation', 'Delete')

WS.verifyElementPropertyValue(response1, '[37].action.collectionName', 'DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL')

WS.verifyElementPropertyValue(response1, '[37].action.condition.$and[0]["inputValue.id"]', '{:0}')

WS.verifyElementPropertyValue(response1, '[41].mysqlParameters.OffsetEnable', GlobalVariable.Offset_true)

WS.verifyElementPropertyValue(response1, '[41].mysqlParameters.StopLimit', 0)

WebUI.callTestCase(findTestCase('mongo protocal mysql bulk/Mongo_Protocol_Create_MySQL/offSet_StopLimit_false/test0001_Offset-true_Stoplimit-zero_Offset_zero'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WS.sendRequest(findTestObject('Mongo_protocol_create', [('URL') : GlobalVariable.URL, ('Mongo_create') : GlobalVariable.deleteMysql
            , ('Offset') : GlobalVariable.offsetisabovelimit]))
