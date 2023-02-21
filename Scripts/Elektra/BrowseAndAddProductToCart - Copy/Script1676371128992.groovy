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

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/b_Inicia sesin_hp'))

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/span_Entrar con e-mail y contrasea'))

WebUI.setText(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_e-mail_Login'), 'saddepalli@kognivera.com')

WebUI.setText(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/input_password_login'), 
    'Luckytara123$')

WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/span_submitLogin_login'))

WebUI.delay(3)

CustomKeywords.'myKeywords.scrollWindow'()

CustomKeywords.'myKeywords.clickElement'(findTestObject('ElektraPage/HomePage/Departamentos_HP'))

CustomKeywords.'myKeywords.clickElement'(findTestObject('ElektraPage/HomePage/L1category_HP'))

not_run: WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight)', null)

not_run: WebUI.delay(5)

CustomKeywords.'myKeywords.scrollWindow'()

//WebUI.scrollToPosition(0, 0)
WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/bannerImg_clp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/brandCorousel_clp'), 0)

WebUI.scrollToElement(findTestObject('ElektraPage/CLPPage/brandCarouselSection_clp'), 0)

CustomKeywords.'myKeywords.clickElementWithoutScroll'(findTestObject('ElektraPage/CLPPage/AppleBrandImg_clp'))

WebUI.delay(3)

CustomKeywords.'myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/filterSection_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/FiltradoLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_DepartamentoLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_CategoraLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_Sub-CategoraLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/span_MarcaLabel_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/listOfProducts_plp'), 0)

WebUI.scrollToElement(findTestObject('ElektraPage/PLPPage/productName_plp'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/productName_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/productSellingPrice_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/emiAmount_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/homeDelivery_plp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/creditoElektraImage_plp'), 0)

WebUI.click(findTestObject('ElektraPage/PLPPage/input_Color_plp'))

CustomKeywords.'myKeywords.clickElement'(findTestObject('ElektraPage/PLPPage/input_Color_plp'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/PLPPage/assertFilterSelected_plp'), 0)

WebUI.scrollToElement(findTestObject('ElektraPage/PLPPage/productSection_plp'), 0)

CustomKeywords.'myKeywords.clickElementWithoutScroll'(findTestObject('ElektraPage/PLPPage/productName_plp'))

WebUI.delay(5)

CustomKeywords.'myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ElektraPage/PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PDPPage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PDPPage/productImage_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PDPPage/benefitsList_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PDPPage/button_Comprar_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/PDPPage/div_AddToCart_pdp'), 0)

not_run: CustomKeywords.'myKeywords.scrollToTop'()

WebUI.delay(5)

WebUI.click(findTestObject('ElektraPage/PDPPage/backToTop_pdp'))

CustomKeywords.'myKeywords.clickElementWithoutScroll'(findTestObject('ElektraPage/PDPPage/div_AddToCart_pdp'))

WebUI.maximizeWindow()

CustomKeywords.'myKeywords.clickElementWithoutScroll'(findTestObject('ElektraPage/CartPage/bagIcon_header'))

CustomKeywords.'myKeywords.clickElementWithoutScroll'(findTestObject('ElektraPage/CartPage/continuar_minicart'))

checkoutUrl = WebUI.getUrl()

String expectedCheckoutUrl = 'https://www.elektra.mx/checkout/cart'

if (checkoutUrl.equalsIgnoreCase(expectedCheckoutUrl)) {
    KeywordUtil.markPassed('url is correct')
} else {
    KeywordUtil.markFailed('checkout url is incorrect')
}

WebUI.verifyElementPresent(findTestObject('ElektraPage/CheckoutPage/checkoutPagesBreadCrumb_checkout'), 0)

WebUI.verifyElementPresent(findTestObject('ElektraPage/CheckoutPage/checkCartEnabled_checkout'), 0)

CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('ElektraPage/CheckoutPage/checkCartEnabled_checkout'))

WebUI.verifyElementPresent(findTestObject('ElektraPage/CheckoutPage/verifyEmailDisabled_checkout'), 0)

WebUI.setText(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/input_postalCode_checkout'), 
    '14000')

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Buscar_checkout'))

CustomKeywords.'myKeywords.clickElementWithoutScroll'(findTestObject('ElektraPage/checkoutPage1/div_Buscar_checkout'))

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/a_Continuar con tu compra'))

CustomKeywords.'myKeywords.clickElementWithoutScroll'(findTestObject('ElektraPage/checkoutPage1/a_Continuar con tu compra'))

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Continuar_submit_Shipping_checkout'))

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Continuar con el pago_payment_checkout'))

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_CieBancomer_payment_checkout'))

CustomKeywords.'myKeywords.clickElement'(findTestObject('ElektraPage/checkoutPage1/div_CieBancomer_payment_checkout'))

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra - Tienda en lnea/div_Pagar_payment_checkout'))

CustomKeywords.'myKeywords.clickElement'(findTestObject('ElektraPage/checkoutPage1/div_Pagar_payment_checkout'))

CustomKeywords.'myKeywords.scrollWindow'()

WebUI.verifyElementText(findTestObject('Object Repository/ElektraPages/Page_Orden colocada/div_Gracias por tu compra_confirmationPage'), 
    '¡Gracias por tu compra!')

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

CustomKeywords.'myKeywords.clickElement'(findTestObject('ElektraPages/Page_Orden colocada/span_Ir a mis pedidos_confirmationPage'))

not_run: WebUI.click(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/svg_Oferta Relmpago_vtex__icon-close'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/ElektraPages/Page_Elektra, Tu Familia Vive Mejor/div_Pedido  v36386919ekt-01'), 
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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/li_Mis pedidos_breadcrumb_myOrders'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/productSection_myOrders'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/button_Ver filtros_myOrders'), 
    0)

