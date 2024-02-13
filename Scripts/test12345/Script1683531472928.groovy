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

//response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/apimusql', [('ServiceName') : GlobalVariable.Mysql_Api_Intemtion[
//            0], ('BulkID') : GlobalVariable.Mysql_Api_Intemtion[1], ('StopLimit') : GlobalVariable.Mysql_Api_Intemtion[4]
//            , ('OffsetEnable') : GlobalVariable.Mysql_Api_Intemtion[5]]))
//
//WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
//WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Mysql_Api_Intemtion[1])
//
//WS.verifyElementPropertyValue(response, 'status', 'Successful')
//
//response123 = WS.sendRequest(findTestObject('bulk_master_api/fetchAllrecods'))
//
//WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[0], GlobalVariable.Mysql_Api_Intemtion[
//    0], FailureHandling.STOP_ON_FAILURE)
//
//WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[1], GlobalVariable.Mysql_Api_Intemtion[
//    1], FailureHandling.STOP_ON_FAILURE)
//
//WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[4], GlobalVariable.Mysql_Api_Intemtion[
//    4], FailureHandling.STOP_ON_FAILURE)
//
//WS.verifyElementPropertyValue(response123, GlobalVariable.MySql_Api_intemtion_index[5], GlobalVariable.Mysql_Api_Intemtion[
//    5], FailureHandling.STOP_ON_FAILURE)
//
//WS.sendRequest(findTestObject('MYSQL_API_int_without_Offset', [('DataPlan') : 10]))



response=WS.sendRequest(findTestObject('bulk_master_api/file/Action_type_file', [('ServiceName') : 'notification-bulk-service', ('BulkID') : 909, ('RetryEnable') : false
            , ('IsHeaderEnable') : false, ('SftpEnable') : false, ('CompressEnable') : false, ('Limit') : '0', ('FileExtension') : '.csv'
            , ('FieldSeparator') : '|', ('sendNotification') : false, ('pvc') : false, ('sftp') : false, ('Notify') : false]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
WS.verifyElementPropertyValue(response, 'bulkId', 909)
//
WS.verifyElementPropertyValue(response, 'status', 'Successful')