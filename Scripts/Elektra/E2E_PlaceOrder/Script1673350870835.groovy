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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elektra.mx/')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/offers_icon-close_1'), 
    0) == true) {
    WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/offers_icon-close_1'))
} else {
    println('offer is not present')
}

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/b_Inicia sesin_hp'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/span_Entrar con e-mail y contrasea'))

WebUI.setText(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_e-mail_Login'), 'saddepalli@kognivera.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_password_login'), 
    '4MI0l6NGHQElPoE9OgyuQw==')

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/span_submitLogin_login'))

WebUI.setText(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_searchBar_hp'), '852980')

WebUI.sendKeys(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_searchBar_hp'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_watch - Elektra en Lnea/img_firstProduct_plp'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Huawei Watch Fit 2 Negro  Elektra tien_5563d7/div_AddtoCart_pdp'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('ElektraPage/CartPage/bagIcon_header'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ElektraPage/CartPage/continuar_minicart'), FailureHandling.STOP_ON_FAILURE)

checkoutUrl = WebUI.getUrl()

WebUI.setText(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/input_postalCode_checkout'), 
    '14000')

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Buscar_checkout'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/a_Continuar con tu compra'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/span_Seleccionar tienda_shipping_checkout'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/selectStoreRadioButton_shipping_checkout'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Continuar_submit_Shipping_checkout'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Continuar con el pago_payment_checkout'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_CieBancomer_payment_checkout'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Pagar_payment_checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/div_Gracias por tu compra_confirmationPage'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/div_Gracias por tu compra_confirmationPage'), 
    '¡Gracias por tu compra!')

WebUI.rightClick(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/h4_No. de pedido v36386919ekt-01'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/div_Gracias por tu compraTe enviaremos el d_2d12dd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/productDetails_confirmationPage'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/personalInfo_confirmationPage'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/span_Ir a mis pedidos_confirmationPage'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/span_newPayment_confirmationPage'), 
    0)

String orderId_ConfirmPage = WebUI.getText(findTestObject('ElektraPages/Page_Orden colocada/orderId_confirmationPage'))

println('orderId_ConfirmPage: ' + orderId_ConfirmPage)

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/span_Ir a mis pedidos_confirmationPage'))

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/svg_Oferta Relmpago_vtex__icon-close'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/div_Pedido  v36386919ekt-01'), 
    0)

not_run: WebUI.rightClick(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/div_Pedido  v36386919ekt-01'))

not_run: WebUI.rightClick(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/div_Pedido  v36386919ekt-01'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/div_Huawei Watch Fit 2 NegroCreadoPaga para_51e436'), 
    0)

//WebUI.acceptAlert()
ActualmyOrdersUrl = WebUI.getUrl()

ActualmyOrdersUrl.contains(expectedMyordersUrl)

not_run: WebUI.click(findTestObject('Pages/Checkout page/btnPlaceOrder'))

String order = WebUI.getText(findTestObject('Object Repository/ElektraPages/order_MyOrders'))

println('order: ' + order)

String pedidoText = order.substring(0, 7)

println('pedidoText' + pedidoText)

String orderId = order.substring(10, 24)

println('orderId: ' + orderId)

