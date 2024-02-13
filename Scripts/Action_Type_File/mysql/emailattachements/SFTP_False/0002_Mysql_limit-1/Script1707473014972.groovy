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

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY', 'NOTIFICATION_ID', 37346)

IMongoDBCount = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

CustomKeywords.'sftp_keyword.refactor_sftp.Deletingsftpwithdirectory'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.Post_cache_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println('SftpFileCount------------------------------------> ' + InitalCountProceesed)

responseupdate = WS.sendRequest(findTestObject('bulk_master_api/Mysql/emailattach-1', [('URL') : GlobalVariable.URL, ('ServiceName') : GlobalVariable.POST_bulkProcess
            , ('BulkID') : GlobalVariable.POST_bulkID, ('SendEmailAsAttachment') : GlobalVariable.Offset_true, ('CompressEnable') : GlobalVariable.Offset_false
            , ('FileExtension') : '.csv', ('FieldSeparator') : '|', ('StopLimit') : GlobalVariable.offsetiszero, ('OffsetEnable') : GlobalVariable.Offset_false
            , ('Limit') : 1]))

WS.verifyElementPropertyValue(responseupdate, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(responseupdate, 'bulkId', GlobalVariable.POST_bulkID)

WS.verifyElementPropertyValue(responseupdate, 'status', 'Successful')

WS.sendRequest(findTestObject('TriggerBulkAPI_DB_Bulk', [('bulkProcessName') : GlobalVariable.POST_bulkProcess, ('URL') : GlobalVariable.URL
            , ('stoplimitunderlimit') : 0]))

finalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

println(finalCountProceesed)

filecount = CustomKeywords.'basicOperations.RandomStringGenerator.filecount'(10, 1)

println(filecount)

WS.verifyEqual(InitalCountProceesed, finalCountProceesed - filecount)


////////////////
mongolist = CustomKeywords.'mongoDatabaseOperations.MongoConnect.mongojsonpathlist'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName,
	'NOTIFICATION_EMAIL_HISTORY', 'NOTIFICATION_ID', 37346, 'EMAILFILEATTACHMENTDETAILS[0].fileName')

println(mongolist)

sftplist = CustomKeywords.'sftp_keyword.refactor_sftp.SftpFileList'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store/')

CustomKeywords.'basicOperations.RandomStringGenerator.comparelist'(mongolist, sftplist)


