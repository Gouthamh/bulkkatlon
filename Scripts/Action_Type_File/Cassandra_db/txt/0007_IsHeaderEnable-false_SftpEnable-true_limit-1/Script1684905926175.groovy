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

'updating post-cache-services for the file write type'
response = WS.sendRequest(findTestObject('bulk_master_api/Cassandra-db/Actiontype-file', [('ServiceName') : GlobalVariable.CassandraDB_actionType_file[
            0], ('BulkID') : GlobalVariable.CassandraDB_actionType_file[1], ('FileExtension') : GlobalVariable.FileExtension[
            1], ('FileTimeFormat') : GlobalVariable.CassandraDB_actionType_file[2], ('FieldSeparator') : GlobalVariable.FieldSeparator[
            0], ('IsHeaderEnable') : GlobalVariable.Offset_false, ('SftpEnable') : GlobalVariable.Offset_true, ('Notify') : GlobalVariable.Offset_false
            , ('pvc') : GlobalVariable.Offset_false, ('sftp') : GlobalVariable.Offset_false, ('FileHeaders') : GlobalVariable.CassandraDB_actionType_file[
            3], ('Limit') : GlobalVariable.Limit[1], ('sendNotification') : GlobalVariable.Offset_false]))

'verifying the successfully\r\n'
WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

'verifying based bulk id'
WS.verifyElementPropertyValue(response, 'bulkId', 847)

WS.verifyElementPropertyValue(response, 'status', 'Successful')
/////////////////////


'api for the fetch all data for bulk services\r\n'
response1 = WS.sendRequestAndVerify(findTestObject('bulk_master_api/fetchAllrecods'))

WS.verifyElementPropertyValue(response1, GlobalVariable.CassandraDB_actionType_file_indexing[0], GlobalVariable.CassandraDB_actionType_file[
    0])

WS.verifyElementPropertyValue(response1, GlobalVariable.CassandraDB_actionType_file_indexing[1], GlobalVariable.CassandraDB_actionType_file[
    1])

  WS.verifyElementPropertyValue(response1,GlobalVariable.
  CassandraDB_actionType_file_indexing[7],GlobalVariable.Offset_true)
  
 /* 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[3],GlobalVariable.Limit[0])
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[4],GlobalVariable.
 * CassandraDB_actionType_file[2])
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[5],GlobalVariable.FieldSeparator[0])
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[6],GlobalVariable.Offset_false)
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[7],GlobalVariable.Offset_false)
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[8],GlobalVariable.Offset_false)
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[9],GlobalVariable.
 * CassandraDB_actionType_file[1])
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[10],GlobalVariable.
 * CassandraDB_actionType_file[0])
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[11],GlobalVariable.
 * CassandraDB_actionType_file[1])
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[12],GlobalVariable.
 * CassandraDB_actionType_file[0])
 * 
 * WS.verifyElementPropertyValue(response1,GlobalVariable.
 * CassandraDB_actionType_file_indexing[13],GlobalVariable.
 * CassandraDB_actionType_file[1])
 */
  
  //////////////////////////////
  
  
'inital count from stfp based SFTP'
countSFTP = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store')


println('countSFTP ' + countSFTP)

'delete all the records from based sftp location'
CustomKeywords.'sftp_keyword.refactor_sftp.deleteAllRecords'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[1], 
    GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store')

countSFTP1 = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store')

println('countSFTP1 ' + countSFTP1)

WS.verifyEqual(countSFTP1, 0)

////////////////////////////////////////

'inital count from stfp third party SFTP'
countSFTP = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store')


println('countSFTP ' + countSFTP)

'delete all the records from based sftp location'
CustomKeywords.'sftp_keyword.refactor_sftp.deleteAllRecords'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[1],
	GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store')

countSFTP12 = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store')

println('countSFTP12 ' + countSFTP12)

WS.verifyEqual(countSFTP12, 0)

///////////////////////////////////////

response2 =   WS.sendRequest(findTestObject('Cassandra_triggerapi', [('bulkProcessName') :
  GlobalVariable.CassandraDB_actionType_file[ 0], ('URL') : GlobalVariable.URL,
  ('valeid1') : GlobalVariable.valeid[1], ('valeid') : GlobalVariable.valeid[0]]))

WS.verifyElementPropertyValue(response2, 'response', 'cache-post-bulk-service triggered Successfully')

///////////////////////////////////////

finalcountSFTP1 = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store')

println('finalcountSFTP1 ' + finalcountSFTP1)

WS.verifyEqual(finalcountSFTP1, GlobalVariable.valeid[1]-GlobalVariable.valeid[0]+1)

fileexct = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store')


println (fileexct)

WS.verifyEqual(fileexct, true)

///////////////////////////////////

'inital count from stfp third party SFTP'

finalcountSFTP2 = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store')

println('finalcountSFTP2 ' + finalcountSFTP2)

WS.verifyEqual(finalcountSFTP2, GlobalVariable.valeid[1]-GlobalVariable.valeid[0]+1)

fileexct = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store')


println (fileexct)

WS.verifyEqual(fileexct, true)


///////////////////////

headers = CustomKeywords.'sftp_keyword.refactor_sftp.readAllLines'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store')

println(headers)

headers123 = CustomKeywords.'sftp_keyword.refactor_sftp.Converting_String_to_HeaderString'('usage_units,usage_discount,id,testdataone,holiday_date', ';', '|')

println('headers123 ' + headers123)

header_present=CustomKeywords.'sftp_keyword.refactor_sftp.Header_is_present'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
    1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store','usage_units,usage_discount,id,testdataone,holiday_date')

println (header_present)

WS.verifyEqual(header_present, false)

////////////////////////////////

headersthird = CustomKeywords.'sftp_keyword.refactor_sftp.readAllLines'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store')

println(headersthird)

headersthird123 = CustomKeywords.'sftp_keyword.refactor_sftp.Converting_String_to_HeaderString'('usage_units,usage_discount,id,testdataone,holiday_date', ';', '|')

println('headers123 ' + headersthird123)

header_presentheadersthird123=CustomKeywords.'sftp_keyword.refactor_sftp.Header_is_present'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store','usage_units,usage_discount,id,testdataone,holiday_date')

println (header_presentheadersthird123)

WS.verifyEqual(header_present, false)

'verify header is presnt'
fileexct = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], GlobalVariable.cache_post_service_host, GlobalVariable.Sftp_inform[3], '/bulk-store')

println(fileexct)

'verifying and comparing the header is present or not ?'
WS.verifyEqual(fileexct, true)

'verify header is presnt'
fileexct = CustomKeywords.'sftp_keyword.refactor_sftp.SFTPFileExtensionValidator'(GlobalVariable.Sftp_inform[0], GlobalVariable.Sftp_inform[
	1], GlobalVariable.Sftp_inform[2], 31703, GlobalVariable.Sftp_inform[3], '/bulk-store')

println(fileexct)

'verifying and comparing the header is present or not ?'
WS.verifyEqual(fileexct, true)
