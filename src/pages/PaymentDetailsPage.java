package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentDetailsPage {
	WebDriver driver;
	WebElement ContinueButton;
	
	public PaymentDetailsPage(WebDriver driver) {
		super();
		this.driver = driver;
		
	}

	public WebElement getContinueButton() {
		return this.driver.findElement(By.name("newOrder"));
	}
	
	public void clickOnContinueButton() {
		this.getContinueButton().click();
	}
	
	

}
