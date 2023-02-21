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
import com.kms.katalon.core.webui.driver.DriverFactory;
import org.openqa.selenium.DevTools.V93.Network;

ChromeDriver driver = new ChromeDriver()
DevTools devTools = driver.getDevTools()
WebDriver driver1;
driver1.getDevTools();
devTools.createSession();
// iPhone 11 Pro dimensions
devTools.send(Emulation.setDeviceMetricsOverride(375,
												 812,
												 50,
												 true,
												 Optional.empty(),
												 Optional.empty(),
												 Optional.empty(),
												 Optional.empty(),
												 Optional.empty(),
												 Optional.empty(),
												 Optional.empty(),
												 Optional.empty(),
												 Optional.empty()));
driver.get("https://selenium.dev/");
driver.quit();