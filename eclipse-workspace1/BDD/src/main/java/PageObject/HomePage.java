package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By Login = By.cssSelector("a[href*='sign_in']");

	By popup = By.xpath("//button[text()='NO THANKS']");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement signin() {
		return driver.findElement(Login);
	}

	public List<WebElement> getpopupSize() {

		return driver.findElements(popup);
	}

	public WebElement getpopup() {

		return driver.findElement(popup);

	}
}
