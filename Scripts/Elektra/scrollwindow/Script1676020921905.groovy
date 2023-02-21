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
//import com.kms.katalon.core.

import org.openqa.selenium.WebDriver;

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elektra.mx/')


  WebUI.click(findTestObject('ElektraPage/HomePage/Departamentos_HP'))
  
  WebUI.click(findTestObject('ElektraPage/HomePage/L1category_HP'))
 
//WebUI.takeFullPageScreenshot([])

//WebUI.executeJavaScript('window.scrollTo(0,document.body.scrollHeight)',null)


	/*
	 * JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();
	 * 
	 * 
	 * long intialLength = (long)
	 * (js.executeScript("return document.body.scrollHeight"));
	 * 
	 * while(true){
	 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); try {
	 * Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
	 * 
	 * long currentLength = (long)
	 * (js.executeScript("return document.body.scrollHeight")); if(intialLength ==
	 * currentLength) { break; }
	 * 
	 * intialLength = currentLength;
	 * 
	 * }
	 */
  
 
/*
 * long intialLength = (long)
 * JavascriptExecutor.executeScript("return document.body.scrollHeight");
 */
/*
 * while(true){
 * WebUI.executeJavaScript("window.scrollTo(0,document.body.scrollHeight)",
 * null); try { Thread.sleep(4000); } catch (InterruptedException e) {
 * e.printStackTrace(); }
 * 
 * 
 * long currentLength = (long)
 * WebUI.executeJavaScript("return document.body.scrollHeight"); if(intialLength
 * ==currentLength) { break; }
 * 
 * }
 */
  
/*
 * height = browser.execute_script("return document.body.scrollHeight") for
 * (scroll in range(100,height,100))
 * browser.execute_script(f"window.scrollTo(0,{scrol})") time.sleep(0.1)
 */
  
  // softly scroll to the element group
  JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getWebDriver();

  for (int i = 0; i < 5000; i += 7) {
	 js.executeScript("window.scrollTo(0, " + i + ")");
	 js.executeScript(var1, var2)
	
  }

  System.out.println("selected button");
 //WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/bannerImg_clp'),0)
  System.out.println("element is present");

WebUI.delay(5)

//WebUI.scrollToPosition(0, 0)
//WebUI.verifyElementPresent(findTestObject('ElektraPage/CLPPage/bannerImg_clp'),0)
