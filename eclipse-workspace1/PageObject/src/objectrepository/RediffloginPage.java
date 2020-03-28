package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffloginPage {
	

	WebDriver driver;
	public RediffloginPage(WebDriver driver) {
		 
		this.driver=driver;
	}
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By checkbox=By.xpath("//input[@id='remember']");
	By go= By.name("proceed");
	By home= By.linkText("Home");

public WebElement Emailid() {
	 return driver.findElement(username);
}
public WebElement Password() {
	return driver.findElement(password);
	
}
public WebElement checkbox() {
	return driver.findElement(checkbox);
}
public WebElement submit() {
	return driver.findElement(go);
}
public WebElement homepage() {
	return driver.findElement(home);
}

}

