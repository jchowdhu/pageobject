package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RadiffHomePage;
import objectrepository.RediffloginPage;

public class PageObjectTest {
@Test
public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Documents\\webdriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	RediffloginPage rd= new RediffloginPage(driver);
	
	rd.Emailid().sendKeys("hello");
	rd.Password().sendKeys("1234");
	rd.checkbox().click();
//	rd.submit().click();
	rd.homepage().click();
	RadiffHomePage rh=new RadiffHomePage(driver);
	rh.searchbox().sendKeys("cricket");
	rh.submit().click();
	
}
}
