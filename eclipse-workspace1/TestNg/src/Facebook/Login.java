package Facebook;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	@BeforeMethod
	public void Url() {
		driver.get("https://www.facebook.com");

	}

	@Test(priority = 3, groups = "test1")
	public void verifyTest() {
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Facebook - Log In or Sign Up");
	}

	@Test(priority = 1, groups = "test2")
	@Parameters({ "username", "password" })
	public void UsernameAndPasswordTest(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

	@Test(priority = 2, groups = "test2")
	@Parameters({ "username", "password" })
	public void verrifyErrorTest(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		String Title = driver.findElement(By.cssSelector("div[class='_4rbf _53ij']")).getText();
		System.out.println(Title);
		Assert.assertEquals(Title, "The password you’ve entered is incorrect. Forgot Password?");
	}

	@Test(priority = 4, groups = "test3")
	public void verifyImagetest() {
//		driver.findElement(By.cssSelector("a[id='u_0_m']")).isDisplayed();
		boolean a = driver.findElement(By.xpath("//h2[@class='inlineBlock _3ma _6n _6s _6v']")).isDisplayed();
		System.out.println(a);
	}

}
