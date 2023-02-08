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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elektra.mx/')

WebUI.click(findTestObject('ElektraPage/HomePage/b_IniciarSession_hp'))

WebUI.click(findTestObject('ElektraPage/HomePage/enterEmail_hp'))

WebUI.setText(findTestObject('ElektraPage/HomePage/input_email_loginOverlay'), userName)

WebUI.setText(findTestObject('Page_Elektra, Tu Familia Vive Mejor/passwordField_loginOverlay'), password)

WebUI.click(findTestObject('ElektraPage/HomePage/span_Entrar_loginOverlay'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/HomePage/b_Holausername_hp'), 0)

WebUI.click(findTestObject('ElektraPage/HomePage/Departamentos_HP'))

WebUI.click(findTestObject('ElektraPage/HomePage/L1category_HP'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/bannerImg_clp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/brandCorousel_clp'), 0)

WebUI.delay(3)

not_run: WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/newsletter_clp'), 0)

WebUI.click(findTestObject('ElektraPage/CLPPage/AppleBrandImg_clp'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/assertPLPDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ElektraPage/PLPPage/input_Color_plp'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/assertFilterSelected_plp'), 0)

WebUI.scrollToElement(findTestObject('ElektraPage/PLPPage/assertFilterSelected_plp'), 0)

WebUI.click(findTestObject('ElektraPage/PLPPage/productName_plp'))

WebUI.callTestCase(findTestCase('CommonMethods/assertPdpDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ElektraPage/PDPPage/div_AddToCart_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ElektraPage/CartPage/bagIcon_header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ElektraPage/CartPage/continuar_minicart'), FailureHandling.STOP_ON_FAILURE)

checkoutUrl = WebUI.getUrl()

String expectedCheckoutUrl = 'https://www.elektra.mx/checkout/cart'

if (checkoutUrl.equalsIgnoreCase(expectedCheckoutUrl)) {
    KeywordUtil.markPassed('url is correct')
} else {
    KeywordUtil.markFailed('checkout url is incorrect')
}

WebUI.verifyElementPresent(findTestObject('ElektraPage/CheckoutPage/checkoutPagesBreadCrumb_checkout'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/CheckoutPage/checkCartEnabled_checkout'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/CheckoutPage/verifyEmailDisabled_checkout'), 0)

