package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatsPage {
	WebDriver driver;
	WebElement ManxCatButton;
	WebElement PersianCatButton;
	WebElement ReturnToMainMenuButton;
	
	public CatsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getManxCatButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	}
	public WebElement getPersianCatButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}
	public WebElement getReturnToMainMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
	}
	
	public void clickOnManxCatButton() {
		this.getManxCatButton().click();
	}
	
	public void clickOnPersianCatButton() {
		this.getPersianCatButton().click();
	}
	
	public void clickOnReturnToMainMenuButton() {
		this.getReturnToMainMenuButton().click();
	}
	
}
