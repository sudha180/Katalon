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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elektra.mx/')

WebUI.click(findTestObject('outlook/img_Iniciarsesin_elektra-hp'))

WebUI.click(findTestObject('outlook/span_EnterEmailAndPasswordButton_hp'))

WebUI.click(findTestObject('outlook/a_signupLink_loginOverlay'))

WebUI.setText(findTestObject('outlook/input_enterEmail_signup'), 'saddepalli@kognivera.com')

WebUI.click(findTestObject('outlook/span_submitEmail_signup'))

String currentPage = WebUI.getUrl()

int currentTab = WebUI.getWindowIndex()

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')

WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl('outlook.com')

WebUI.click(findTestObject('outlook/a_Sign in_outlook'))

WebUI.setText(findTestObject('outlook/input_Sign in_loginfmt'), 'saddepalli@kognivera.com')

WebUI.click(findTestObject('outlook/Next_Button_Outlook'))

WebUI.delay(5)

WebUI.setText(findTestObject('outlook/input_Enter password_passwd'), Password)

WebUI.delay(5)

WebUI.click(findTestObject('outlook/input_YesButton'))

WebUI.click(findTestObject('outlook/input_YesButton'))

WebUI.delay(5)

WebUI.click(findTestObject('outlook/span_clickInbox'))

OTP = WebUI.getText(findTestObject('outlook/otp_outlook'))

println(currentTab)

WebUI.switchToWindowIndex(currentTab)

WebUI.delay(2)

WebUI.setText(findTestObject('outlook/input_otp_signup'), OTP)

WebUI.setText(findTestObject('outlook/input_password_signup'), Create_Password)

WebUI.setText(findTestObject('outlook/input_confirmPassword_signup'), Create_Password)

WebUI.click(findTestObject('outlook/span_Crear'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/HomePage/b_Holausername_hp'), 0)

