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
import internal.GlobalVariable
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global

import org.openqa.selenium.Keys as Keys

WS.comment('delete our voulme')
CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_sync_bulk_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

WS.comment('count our voulme')
InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_sync_bulk_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

println("InitalCountProceesed--"+InitalCountProceesed)

WS.verifyEqual(InitalCountProceesed, InitalCountProceesed + 0)

///

WS.comment('delete our voulme')
CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

WS.comment('count our voulme')
thirdpartyInitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println("thirdpartyInitalCountProceesed--"+thirdpartyInitalCountProceesed)

WS.verifyEqual(thirdpartyInitalCountProceesed, thirdpartyInitalCountProceesed + 0)

WS.comment('update bulk service')

response = WS.sendRequest(findTestObject('bulk_master_api/mongoDB/Action_type-mongo', [('ServiceName') : GlobalVariable.Sync_BulkProcess, ('BulkID') : GlobalVariable.Sync_BulkID
	, ('OffsetEnable') : false, ('StopLimit') : '0', ('RetryEnable') : false, ('IsHeaderEnable') : false, ('SftpEnable') : true
	, ('CompressEnable') : false, ('FileExtension') : '.csv', ('FieldSeparator') : '|', ('sendNotification') : false
	, ('pvc') : false, ('sftp') : false, ('enrichEnable') : false, ('Limit') : '3']))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', '901')

WS.verifyElementPropertyValue(response, 'status', 'Successful')

WS.comment('trigger bulk service')

WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.Sync_BulkProcess, ('URL') : GlobalVariable.URL
            , ('stoplimitunderlimit') : 0]))

WS.comment('tvalidate our count')

finalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_sync_bulk_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

println('finalCountProceesed-->'+finalCountProceesed)

filecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(5, 3)

println('filecount-->'+filecount)

WS.verifyEqual(InitalCountProceesed, finalCountProceesed - filecount)

fileext = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_sync_bulk_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/','.csv')

println(fileext)

WS.verifyEqual(true, fileext)

//////

thirdpartyfinalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println('thirdpartyfinalCountProceesed-->'+thirdpartyfinalCountProceesed)

thirdpartyfilecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(5, 3)

println('thirdpartyfilecount-->'+thirdpartyfilecount)

WS.verifyEqual(thirdpartyInitalCountProceesed, thirdpartyfinalCountProceesed - thirdpartyfilecount)

thirdpartyfileext = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/','.csv')

println(thirdpartyfileext)

WS.verifyEqual(true, thirdpartyfileext)