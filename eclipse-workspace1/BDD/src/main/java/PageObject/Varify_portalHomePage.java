package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Varify_portalHomePage {
	public WebDriver driver;
	 By searchBox= By.name("query");
	 
public Varify_portalHomePage(WebDriver driver) {
	this.driver= driver;
}

public WebElement getSearchBox() {
	return driver.findElement(searchBox);
}
}