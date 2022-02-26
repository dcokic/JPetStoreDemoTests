package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AngelfishPage {
	WebDriver driver;
	WebElement ESTOneButton;
	WebElement ESTTwoButton;
	WebElement AddToCartButtonOne;
	WebElement AddToCartButtonTwo;
	WebElement ReturnToFishButton;
	
	public AngelfishPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getESTOneButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	}

	public WebElement getESTTwoButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}

	public WebElement getAddToCartButtonOne() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
	}

	public WebElement getAddToCartButtonTwo() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a"));
	}

	public WebElement getReturnToFishButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
	}
	
	public void clickOnAddToCartButtonOne() {
		this.getAddToCartButtonOne().click();
	}
	
	public void clickOnAddToCartButtonTwo() {
		this.getAddToCartButtonTwo().click();
	}

}
