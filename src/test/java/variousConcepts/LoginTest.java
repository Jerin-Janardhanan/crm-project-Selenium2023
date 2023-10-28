 package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
  public static void main(String[] args) throws InterruptedException {
	
   launchChrome();
   positiveLoginTest();
   closeBrowser();
   
   launchChrome();
   negLoginTest();
   closeBrowser();
    
   
        }
     
  public static void launchChrome() {
//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\jerin\\eclipseSeleniumnew-workspace\\CRM1\\driver\\chromedriver.exe" );
	  
//	  System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe" );

	  System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe" );
	  
	
	  driver = new ChromeDriver();
	  //clear cookies
	  driver.manage().deleteAllCookies();
	  driver.get("http://www.techfios.com/billing/?ng=admin/");
	  driver.manage().window().maximize();
	  //manage time
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  public static void closeBrowser() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	  
  }
  public static void positiveLoginTest() {
	  driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	  driver.findElement(By.name("password")).sendKeys("abc123");
	  driver.findElement(By.name("login")).click();
	  
  }
  
public static void negLoginTest() {
	 driver.findElement(By.id("username")).sendKeys("demo@techfios231.com");
	  driver.findElement(By.name("password")).sendKeys("abc123");
	  driver.findElement(By.name("login")).click();
	  
  }
}
