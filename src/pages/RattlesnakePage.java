package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RattlesnakePage {
	WebDriver driver;
	WebElement EST11Button;
	WebElement EST12Button;
	
	
	
	public RattlesnakePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEST11Button() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	}

	public WebElement getEST12Button() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}
	
	public void clickOnEST11Button() {
		this.getEST11Button().click();
		
	}
	
	public void clickOnEST12Button() {
		this.getEST12Button().click();
	}

}
