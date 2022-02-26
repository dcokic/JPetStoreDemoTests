package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FishPage {
	WebDriver driver;
	WebElement SWZeroOneButton;
	WebElement SWZeroTwoButton;
	WebElement FWZeroOneButton;
	WebElement FWZeroTwoButton;
	WebElement ReturnToMainMenuButton;
	
	public FishPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSWZeroOneButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	} //*[@id="Catalog"]/table/tbody/tr[2]/td[1]/a

	public WebElement getSWZeroTwoButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}

	public WebElement getFWZeroOneButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a"));
	}
	
	public WebElement getFWZeroTwoButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a"));
	}

	public WebElement getReturnToMainMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
	} 
	
	public void clickOnFIZeroOneButton() {
		this.getSWZeroOneButton().click();
	}
	
	public void clickOnFIZeroTwoButton() {
		this.getSWZeroTwoButton().click();
	}
	
	public void clickOnSWZeroOneButton() {
		this.getFWZeroOneButton().click();
	}
	
	public void clickSWZeroTwoButton() {
		this.getFWZeroTwoButton().click();
	}
	
	public void clickOnReturnToMyMenuButton() {
		this.getReturnToMainMenuButton().click();
	}

}
