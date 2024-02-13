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


WebUI.comment('emailattachrecord deleted')
CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY', 'NOTIFICATION_ID', 37346)
WebUI.comment('emailattachrecord filecount')
IMongoDBCount = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

WebUI.comment('our volume')

CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

println(InitalCountProceesed)

WS.verifyEqual(InitalCountProceesed, InitalCountProceesed + 0)

WebUI.comment('third party volume')

CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

thirdpartyInitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(thirdpartyInitalCountProceesed)

WS.verifyEqual(thirdpartyInitalCountProceesed, thirdpartyInitalCountProceesed + 0)

WebUI.comment('udate master data')

response=WS.sendRequestAndVerify(findTestObject('bulk_master_api/Mysql/emailattach-2', [('URL') : GlobalVariable.URL, ('ServiceName') : GlobalVariable.POST_bulkProcess
            , ('BulkID') : GlobalVariable.POST_bulkID, ('IsHeaderEnable') : GlobalVariable.Offset_false, ('SendEmailAsAttachment') : GlobalVariable.Offset_true
            , ('Limit') : 1, ('FileExtension') : GlobalVariable.FileExtension[0], ('FieldSeparator') : GlobalVariable.FieldSeparator[0]]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')
//
WS.verifyElementPropertyValue(response, 'bulkId',  GlobalVariable.POST_bulkID)
//
WS.verifyElementPropertyValue(response, 'status', 'Successful')

WebUI.comment('trigger')

WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.POST_bulkProcess, ('URL') : GlobalVariable.URL
            , ('stoplimitunderlimit') : 0]))

finalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/')

println(finalCountProceesed)

filecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(10, 1)

WS.verifyEqual(InitalCountProceesed, finalCountProceesed - filecount)

fileext = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/SuccessFileTransfer/', 
    '.csv')

println(fileext)

WS.verifyEqual(true, fileext)

/////// third party

thirdpartyfinalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.group_id_test_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(thirdpartyfinalCountProceesed)

thirdpartyfilecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(10, 1)

WS.verifyEqual(thirdpartyInitalCountProceesed, thirdpartyfinalCountProceesed - thirdpartyfilecount)


WS.delay(10)
///
WebUI.comment(' validation for the file attachement')

FMongoDBCount = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY')

WS.verifyEqual(IMongoDBCount, FMongoDBCount - 10)

///

mongolist = CustomKeywords.'mongoDatabaseOperations.MongoConnect.mongojsonpathlist'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY', 'NOTIFICATION_ID', 37346, 'EMAILFILEATTACHMENTDETAILS[0].fileName')

println(mongolist)

sftplist = CustomKeywords.'sftp_keyword.refactor_sftp.SftpFileList'(GlobalVariable.sftpUserName, GlobalVariable.sftpPassword
	, GlobalVariable.sftpHost, GlobalVariable.cache_post_service_host, GlobalVariable.sshKey, '/bulk-store/')

	

println(sftplist)
CustomKeywords.'basicOperations.RandomStringGenerator.comparelist'(mongolist, sftplist)


