package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	WebDriver driver;
	
	@BeforeMethod
	public void initialize() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Documents\\webdriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@AfterMethod
	public void teardown() {
		driver.close();

	}

}
