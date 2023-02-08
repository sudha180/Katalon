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

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/filterSection_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/FiltradoLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_DepartamentoLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_CategoraLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_Sub-CategoraLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_MarcaLabel_plp'), 0)

WebUI.scrollToElement(findTestObject('ElektraPage/PLPPage/label_ElektraSeller_plp'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/label_ElektraSeller_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/div_sellerNameLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_ColorFilter_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/listOfProducts_plp'), 0)

WebUI.scrollToElement(findTestObject('ElektraPage/PLPPage/productSellingPrice_plp'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/productName_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/productSellingPrice_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/emiAmount_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/homeDelivery_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/footerWithCertificates_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/socialNetworkIcons_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/creditoElektraImage_plp'), 0)

