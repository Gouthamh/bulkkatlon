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
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global as Global
import org.openqa.selenium.Keys as Keys

//CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')
//
//InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')
//
//println(InitalCountProceesed)
//
//WS.verifyEqual(InitalCountProceesed, InitalCountProceesed + 0)
//
///////////
//
//CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')
//
//thirdpartyInitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')
//
//println(thirdpartyInitalCountProceesed)
//
//WS.verifyEqual(thirdpartyInitalCountProceesed, thirdpartyInitalCountProceesed + 0)
//
//response = WS.sendRequest(findTestObject('bulk_master_api/Mysql/MYSQL_Actiontyep_file - sftp_true', [('ServiceName') : 'cache-post-bulk-service'
//			, ('BulkID') : 911, ('RetryEnable') : false, ('FileHeaders') : 'notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount'
//			, ('IsHeaderEnable') : false, ('SftpEnable') : true, ('CompressEnable') : false, ('Limit') : '3', ('FileExtension') : '.csv'
//			, ('FieldSeparator') : '|']))
//
//WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
//WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.POST_bulkID)
//
//WS.verifyElementPropertyValue(response, 'status', 'Successful')
//
//WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.POST_bulkProcess, ('URL') : GlobalVariable.URL
//			, ('stoplimitunderlimit') : 0]))
//
//finalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')
//
//println(finalCountProceesed)
//
WS.callTestCase(findTestCase('Action_Type_File/mysql/emailattachements/SFTP_True/0009_Mysql_limit-3_Extension-csv_header-fasle'), 
    [:], FailureHandling.STOP_ON_FAILURE)

filecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(10, 3)

//
//WS.verifyEqual(InitalCountProceesed, finalCountProceesed - filecount)
//
//fileext = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/',
//	'.csv')
//
//println(fileext)
//
//WS.verifyEqual(true, fileext)
//
//header = CustomKeywords.'sftp_keyword.refactor_sftp.Header_is_present'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/',
//	'notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount')
//
//println(header)
//
//WS.verifyEqual(header, false)
//
FileCount = CustomKeywords.'sftp_keyword.refactor_sftp.SftpFileCount'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

println(FileCount)

WS.verifyEqual(FileCount, filecount)

//
sftprecordcount = CustomKeywords.'sftp_keyword.refactor_sftp.SftpAllFileCount'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

println(sftprecordcount)

countmysql = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.BulkNotificationServices')

println(countmysql)

WS.verifyEqual(sftprecordcount, countmysql)

//
///////////
//
//thirdpartyfinalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')
//
//println(thirdpartyfinalCountProceesed)
//
thirdpartyfilecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(10, 3)

//
//WS.verifyEqual(thirdpartyInitalCountProceesed, thirdpartyfinalCountProceesed - thirdpartyfilecount)
//
//thirdpartyfileext = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/',
//	'.csv')
//
//println(thirdpartyfileext)
//
//WS.verifyEqual(true, thirdpartyfileext)
//
//thirdpartyheader = CustomKeywords.'sftp_keyword.refactor_sftp.Header_is_present'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
//	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/',
//	'notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount')
//
//println(thirdpartyheader)
//
//WS.verifyEqual(thirdpartyheader, false)
thirdpartyFileCount = CustomKeywords.'sftp_keyword.refactor_sftp.SftpFileCount'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(thirdpartyFileCount)

WS.verifyEqual(thirdpartyFileCount, thirdpartyfilecount)

thirdpartysftprecordcount = CustomKeywords.'sftp_keyword.refactor_sftp.SftpAllFileCount'(GlobalVariable.Sftp_inform[0], 
    GlobalVariable.Sftp_inform[1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[
    3], '/bulk-store/')

println(thirdpartysftprecordcount)

thirdpartycountmysql = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, 'smdb.BulkNotificationServices')

println(thirdpartycountmysql)

WS.verifyEqual(thirdpartysftprecordcount, thirdpartycountmysql)

