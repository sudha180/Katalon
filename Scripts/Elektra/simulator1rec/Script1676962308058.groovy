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

WebUI.click(findTestObject('Object Repository/Page_watch - Elektra en Lnea/input_Entrar_downshift-4-input'))

WebUI.setText(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Entrar_downshift-3-input'), 'watch')

WebUI.sendKeys(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Entrar_downshift-3-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_watch - Elektra en Lnea/body__satellite_runScript1(function(event, _c2197a_1'))

WebUI.click(findTestObject('Object Repository/Page_watch - Elektra en Lnea/img_Sigue tu pedido_vtex-render-runtime-8-x_3a1b44'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/div_Sigue tu pedidoEntrar0'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/body__satellite_runScript1(function(event, _c2197a_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/body__satellite_runScript1(function(event, _c2197a_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/body__satellite_runScript1(function(event, _c2197a_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/body__satellite_runScript1(function(event, _c2197a_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/body__satellite_runScript1(function(event, _c2197a_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/body__satellite_runScript1(function(event, _c2197a_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/body__satellite_runScript1(function(event, _c2197a_1_2'))

