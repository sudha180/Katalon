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

WebUI.maximizeWindow()

CustomKeywords.'myKeywords.scrollWindow'()

WebUI.click(findTestObject('ElektraPage/HomePage/Departamentos_HP'))

WebUI.click(findTestObject('ElektraPage/HomePage/L1category_HP'))

CustomKeywords.'myKeywords.clickElement'(findTestObject(null))

CustomKeywords.'myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/brandCorousel_clp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/brandCarouselSection_clp'), 0)

WebUI.scrollToElement(findTestObject('ElektraPage/CLPPage/brandCarouselSection_clp'), 0)

WebUI.delay(2)

CustomKeywords.'myKeywords.clickElement'(findTestObject('ElektraPage/CLPPage/AppleBrandImg_clp'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('ElektraPage/CLPPage/AppleBrandImg_clp'), FailureHandling.STOP_ON_FAILURE)

