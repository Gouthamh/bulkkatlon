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

dele = CustomKeywords.'mySQL.mySqlFunction.DeleteRecords'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, GlobalVariable.MySqlPassword, 
    'delete from smdb.automation_tbl', 'SELECT COUNT(*) FROM smdb.automation_tbl')

println(dele)

WS.verifyEqual(dele, true)

intalcount = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, GlobalVariable.insertforautomation)

response = WS.sendRequest(findTestObject('IntergationServices/insertforautomation', [('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(response, 'insertforautomation.response.code', 200)

WS.verifyElementPropertyValue(response, 'insertforautomation.response.status', 'RECORD CREATED SUCCESSFULLY')

WS.verifyResponseStatusCode(response, 200)

finalcount = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, GlobalVariable.insertforautomation)

WS.verifyEqual(intalcount + 1, finalcount)

finalcount1 = CustomKeywords.'mySQL.mySqlFunction.CountTableEntries'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, 
    GlobalVariable.MySqlPassword, GlobalVariable.insertforautomation)

response = WS.sendRequest(findTestObject('bulk_master_api/file/File_Data Enrichment', [('ServiceName') : GlobalVariable.Notification_BulkProcess
            , ('BulkID') : GlobalVariable.Notification_BulkID]))

WS.verifyElementPropertyValue(response, 'msg', 'Bulk master configuration successfuly updated into DB')

WS.verifyElementPropertyValue(response, 'bulkId', GlobalVariable.Notification_BulkID)

WS.verifyElementPropertyValue(response, 'status', 'Successful')

CustomKeywords.'sftp_keyword.refactor_sftp.deleteAllRecords'('admin', 'admin', '172.20.21.57', 31704, '172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==', 
    '/bulk-store')

CustomKeywords.'sftp_keyword.refactor_sftp.deleteAllRecords'('admin', 'admin', '172.20.21.57', 31704, '172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==', 
    '/bulk-store/ProccessedFiles/')

//InitalCountProceesed = CustomKeywords.'sftp_keyword.refactor_sftp.countFiles'('admin', 'admin', '172.20.21.57', 31704, '172.20.21.57 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCfeK+wXukXepUaNZmSTGEjDeUTmJdJlMepkUZA6m5p6tzJa77dIAEx1DOdS+uYCOQWJeguACk204p8Qg83w2Is/YtfzoprK9suIBuZLgDoFT+rSXWptVR3weHQqmwh9aN3AwcRN2ql+czgT3SjIMOahz9peLeRKe+20TiOLv8+c0h8+IQxkqX7qrY0sYrrZyJsQ9HQVrLGEb9RLmOgyKPnqCDIRFH72+nYSpcN+k7Yxc8GiL+qUtKs/GZwBYW2oQMVJR/7XeFVfMYgKBbh/R4L9hYztJX5jCn6iovAwhMB9bd0KqDHhJsiU39R8JoUeGXkW83j3/dZdO1QvTY+AQHmZRW7mZ5MInWeT6BwAJqYICfibSfD/0FYXG7fonPAlzAl6lDiMyBpmZnZOMn0vF8JgHPu1AUxgPrcbNbLhwl19qfz2GnIHoDfg2h8IPXhASh56oIGFSbREIeTYjx0JkJgkZsbGKMYKnEjbSApMUNfhUu16/khm+/tptDqmMDnYmU2E4SQ+Jici9FD1bGO2pDUS2Z6NQz5HyzQyhHPnSH/eQnowRc+YnXa15npey/EEsKE/NGEtS/xk1DXsqEk30wMZYEfwEga5YDCCwIEgzYpHIgF2MmCGYnb/AgtjPRQEYvAWz42S2yD1FNnmsxGxTvOfg60+PuzJW5l2l6zrzvPxw==',
//	'/bulk-store/ProccessedFiles')
//
//println(InitalCountProceesed)
//
uploadresponse = WS.sendRequestAndVerify(findTestObject('FileUpload', [('path') : 'files/MandatoryFields-PROCESSED-0.csv'
            , ('bulkProcessName') : GlobalVariable.Notification_BulkProcess, ('bulkId') : GlobalVariable.Notification_BulkID
            , ('URL') : GlobalVariable.URL]))

WS.verifyElementPropertyValue(uploadresponse, 'bulkId', GlobalVariable.Notification_BulkID)

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].FileName[0]', 'MandatoryFields-PROCESSED-0.csv')

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].msg', 'File uploaded successfully')

WS.verifyElementPropertyValue(uploadresponse, 'uploadDetails[0].status', 'Successful')

CustomKeywords.'mongoDatabaseOperations.MongoConnect.DeleteDBManyRecords'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO', 'fileName', 'MandatoryFields-PROCESSED-0.csv')

countFiles1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'BULK_DATA_FILE_INFO')

countEntries1 = CustomKeywords.'mongoDatabaseOperations.MongoConnect.countDBEntries'(GlobalVariable.Mongo_URL, GlobalVariable.MongoDBName, 
    'NOTIFICATION_EMAIL_HISTORY')

dele = CustomKeywords.'mySQL.mySqlFunction.DeleteRecords'(GlobalVariable.MySqlURI, GlobalVariable.MySqlUserName, GlobalVariable.MySqlPassword, 
    'delete from smdb.automation_tbl', 'SELECT COUNT(*) FROM smdb.automation_tbl')

println(dele)

WS.verifyEqual(dele, true)


WS.sendRequestAndVerify(findTestObject('TriggerBulkAPI_enricher', [('bulkProcessName') : GlobalVariable.Notification_BulkProcess, ('URL') : GlobalVariable.URL]))

