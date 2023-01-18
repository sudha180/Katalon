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

not_run: WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/offers_icon-close_1'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/p_Departamentos'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/a_Blusas_l1Category'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Blusas para Mujer - Elektra en Lnea/div_Blusa Moda Oggi Mujer Mezclilla 2212303_d141bc'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Blusas para Mujer - Elektra en Lnea/div_Blusa Moda Oggi Mujer Mezclilla 2212303_d141bc'))

WebUI.click(findTestObject('Object Repository/Page_Blusas para Mujer - Elektra en Lnea/img_Nombre, decreciente_vtex-product-summar_9f1841'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/div_CH'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/div_Agregar al carrito'))

