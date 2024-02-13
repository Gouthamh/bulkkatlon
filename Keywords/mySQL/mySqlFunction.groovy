package mySQL
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import java.sql.*;

class mySqlFunction {
	/**
	 * Send request and verify status code
	 * @param request request object, must be an instance of RequestObject
	 * @param expectedStatusCode
	 * @return a boolean to indicate whether the response status code equals the expected one
	 */
	//Added by Divya
	@Keyword
	def connectandVeiw(String SqlURI, String UserName, String Password, String collection) {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(
				SqlURI, UserName, Password);
		String query = "SELECT * FROM "+ collection;
		Statement stmt=con.createStatement();

		//----------SELECT and display list-----------
		ResultSet rs=stmt.executeQuery(query); while(rs.next())
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		con.close();
	}

	//Count collection entries sent in method
	@Keyword
	def CountTableEntries(String SqlURI, String UserName, String Password, String Table) {
		Connection con=DriverManager.getConnection(SqlURI, UserName, Password);
		Statement stmt=con.createStatement();
		String	query = "select count(*) from " + Table;
		ResultSet rs = stmt.executeQuery(query);
		rs.next();
		int count = rs.getInt(1);
		con.close();
		return count;
	}

	@Keyword
	def boolean DeleteRecords(String DB_URL,String USER,String PASS,String QUERY,String selectQuery) {

		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement(); // Create a Statement
			stmt.executeUpdate(QUERY); // Execute the query

			ResultSet resultSet = stmt.executeQuery(selectQuery);

			if (resultSet.next()) {
				int rowCount = resultSet.getInt(1);
				if (rowCount == 0) {
					return true;
				} else {
					return false;				}
			}

			conn.close(); // Close the connection when you're done

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}