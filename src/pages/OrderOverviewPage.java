package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderOverviewPage {
	WebDriver driver;
	WebElement MessageLabel;
	
	public OrderOverviewPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getMessageLabel() {
		return this.driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
	}
	
	public String messageLabelText() {
		return this.getMessageLabel().getText();
	}
	
	

}
