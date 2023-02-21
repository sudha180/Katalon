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

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/span_Entrar con e-mail y contrasea'))

WebUI.setText(findTestObject('ElektraPage/HomePage/input_email_loginOverlay'), 'saddepalli@kognivera.co')

WebUI.setEncryptedText(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_password_login'), 
    '4MI0l6NGHQElPoE9OgyuQw==')

WebUI.click(findTestObject('ElektraPage/HomePage/span_Entrar_loginOverlay'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/HomePage/b_Holausername_hp'), 0)

