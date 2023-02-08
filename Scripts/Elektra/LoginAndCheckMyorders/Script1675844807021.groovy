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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elektra.mx/')

WebUI.click(findTestObject('ElektraPage/HomePage/b_IniciarSession_hp'))

WebUI.click(findTestObject('ElektraPage/HomePage/enterEmail_hp'))

WebUI.setText(findTestObject('ElektraPage/HomePage/input_email_loginOverlay'), 'saddepalli@kognivera.com')

WebUI.setText(findTestObject('Page_Elektra, Tu Familia Vive Mejor/passwordField_loginOverlay'), 'Luckytara123$')

WebUI.click(findTestObject('ElektraPage/HomePage/span_Entrar_loginOverlay'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/HomePage/b_Holausername_hp'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/p_Mis pedidos'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/li_Mis pedidos_breadcrumb_myOrders'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/productSection_myOrders'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/button_Ver filtros_myOrders'), 0)

