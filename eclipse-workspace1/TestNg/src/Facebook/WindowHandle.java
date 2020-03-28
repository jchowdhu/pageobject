package Facebook;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle extends BaseClass {
	@BeforeMethod
	public void url() {
		driver.get("https://phptravels.com/demo");

	}
	@Test
	public void PrintTitle() {
		System.out.println(driver.getTitle());
	}

	@Test
	public void verifyImage() {
		driver.findElement
		(By.xpath("//div[@class='col-md-6']//a[@class='btn btn-hero btn-success hero-right']")).isDisplayed();
	}
	

}
