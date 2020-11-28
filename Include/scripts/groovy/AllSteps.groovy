import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AllSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	@Given("User navigated to ups login page")
	def user_navigated_to_ups_login_page() {
		WebUI.openBrowser("https://www.ups.com/us/en/Home.page")
	}

	
	@When("User click on signup link")
	def user_click_on_signup_link() {
		WebUI.click(findTestObject('Object Repository/UPS_Login_Testing/Page_Global Shipping  Logistics Services  U_9deb17/SignUpLink'))
	
	}
	
	@When("User entered correct user name")
	def user_entered_correct_user_name() {
		WebUI.setText(findTestObject('Object Repository/UPS_Login_Testing/Page_Login  UPS - United States/userId'), "kaniz")
	}
	
	
	@When("User entered correct password")
	def user_entered_correct_password() {
		WebUI.setText(findTestObject('Object Repository/UPS_Login_Testing/Page_Login  UPS - United States/password'),"1234")
	}
	
	@When("User click on checkbox")
	def user_click_on_checkbox(){
		WebUI.click(findTestObject('Object Repository/UPS_Login_Testing/Page_Login  UPS - United States/checkbox')     )
	}
	
	@When("User click on login")
	def user_click_on_login(){
		WebUI.click(findTestObject('Object Repository/UPS_Login_Testing/Page_Login  UPS - United States/loginBtn')     )
	}
	
	
}