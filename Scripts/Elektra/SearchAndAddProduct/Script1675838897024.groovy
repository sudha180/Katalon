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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elektra.mx/')

WebUI.setText(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_searchBar_hp'), 'watch')

WebUI.sendKeys(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_searchBar_hp'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_watch - Elektra en Lnea/img_firstProduct_plp'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Huawei Watch Fit 2 Negro  Elektra tien_5563d7/div_AddtoCart_pdp'))

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

