package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
	WebDriver driver;
	
	@BeforeClass 
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	@AfterClass
    public static void afterClass() {
		System.out.println("afterClass");
	}
	@Before
	public void launchChrome() {
      
		System.out.println("launchChrome");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

	    driver = new ChromeDriver();
		// clear cookies
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		// manage time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @After
	public void closeBrowser() throws InterruptedException {
    	System.out.println(" closeBrowser");
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
    @Test
	public void positiveLoginTest() {
    	System.out.println("positiveLoginTest");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}
   @Test
	public void negLoginTest() {
	   System.out.println("negLoginTest");
		driver.findElement(By.id("username")).sendKeys("demo@techfios231.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}
}
