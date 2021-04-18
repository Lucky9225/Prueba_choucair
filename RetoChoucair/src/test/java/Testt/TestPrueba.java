package Testt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPrueba {

 WebDriver driver;
 String TIPO_DRIVER = "webdriver.chrome,driver";
 String PATH_DRIVER =".src/test/resources/webDriver/chromedriver.exe";
 String URL = "http://automationpractice.com/index.php";
 
 @Before
 
 public void setUp()
{	 
	System.setProperty(TIPO_DRIVER, PATH_DRIVER);
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	}
 
@Test
 public void testlocators() throws InterruptedException 
 {
	 //By ID
	 WebElement elemento = driver.findElement(By.id("search_query_top"));
	 elemento.sendKeys("POR ID");
	Thread.sleep(3000);
	//By Name
	elemento.clear();
	elemento = driver.findElement(By.name("search_query"));
	elemento.sendKeys("POR NOMBRE");
	Thread.sleep(3000);
	//By classNem
	elemento.clear();
	elemento = driver.findElement(By.className("login"));
	elemento.click();
	Thread.sleep(3000);
	//By TagName
	elemento = driver.findElement(By.tagName("Body"));
	elemento.click();
	//By linkText
	elemento = driver.findElement(By.linkText("Contact_us"));
	elemento.click();
	//By PartLinkText
	elemento = driver.findElement(By.partialLinkText("Contact"));
	elemento.click();
	//By cssSelector
	elemento = driver.findElement(By.cssSelector(".search_query.form-control.ac.input"));
	elemento.sendKeys("POR CSSSELECTOR");
	Thread.sleep(3000);
	//By xpath
	elemento.clear();
	elemento = driver.findElement(By.xpath("//input[@id'search_query_top']"));
	elemento.sendKeys("POR XPATH");
	Thread.sleep(3000);
	
 }
 
 @After
 public void tearDown()
 {
	 driver.quit();
 }
 
}
