package variousConcepts;


	package variousConcepts;

	import java.util.concurrent.TimeUnit;

	import org.junit.Before;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GitTest1 {
		public class AddCustomer {
			WebDriver driver;
			
			@Before
			public void init() {
				System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			    driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://techfios.com/billing/?ng=admin/");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		}
	}
}
