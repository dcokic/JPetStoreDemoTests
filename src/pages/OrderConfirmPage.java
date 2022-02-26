package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmPage {
	WebDriver driver;
	WebElement ConfirmButton;
	
	
	
	public OrderConfirmPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getConfirmButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
	}
	
	public void clickOnConfirmButton() {
		this.getConfirmButton().click();
	}

}
