package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadiffHomePage {

	WebDriver driver;

	public RadiffHomePage(WebDriver driver) {

		this.driver = driver;

	}

	By search = By.xpath("//input[@id='srchquery_tbox']");
	By click = By.xpath("//form[@name='newsrchform']//input[@class='newsrchbtn']");

	public WebElement searchbox() {

		return driver.findElement(search);
	}
	public WebElement submit() {
		return driver.findElement(click);
	}
}