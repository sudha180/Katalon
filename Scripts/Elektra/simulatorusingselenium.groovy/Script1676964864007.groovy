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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.kms.katalon.core.webui.driver.DriverFactory;
import org.openqa.selenium.WebDriver;

System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");

Map<String, String> devicemodEmu = new HashMap<>()
devicemodEmu.put("deviceName","Nexus 5");
ChromeOptions chropt = new ChromeOptions();
chropt.setExperimentalOption("mobileEmulation", devicemodEmu)
WebDriver driver = new ChromeDriver(chropt);
driver.get("https://www.elektra.mx/");
DriverFactory.changeWebDriver(driver)

WebUI.click(findTestObject('Object Repository/Page_watch - Elektra en Lnea/input_Entrar_downshift-4-input'))

WebUI.setText(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Entrar_downshift-3-input'), 'watch')

WebUI.sendKeys(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Entrar_downshift-3-input'), Keys.chord(
		Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_watch - Elektra en Lnea/body__satellite_runScript1(function(event, _c2197a_1'))

//WebUI.getUrl("https://www.elektra.mx/")