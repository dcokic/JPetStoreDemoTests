package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManxPage {
	WebDriver driver;
	WebElement EST14Button;
	WebElement EST15Button;
	WebElement ReturnToCATSButton;
	WebElement AddToCartFirstButton;
	WebElement AddToCartSecondButton;
	
	public ManxPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEST14Button() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));

	}

	public WebElement getEST15Button() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));

	}

	public WebElement getReturnToCATSButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));

	}

	public WebElement getAddToCartFirstButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));

	}

	public WebElement getAddToCartSecondButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a"));

	}
	
	public void clickOnEST14Button() throws InterruptedException {
		this.getEST14Button().click();
		Thread.sleep(1000);
	}
	
	public void clickOnEST15Button() throws InterruptedException {
		this.getEST15Button().click();
		Thread.sleep(1000);
	}
	
	public void clickOnAddToCartFirstButton() throws InterruptedException {
		this.getAddToCartFirstButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnAddToCartSecondButton() throws InterruptedException {
		this.getAddToCartSecondButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnRetunToCATSButton() throws InterruptedException {
		this.getReturnToCATSButton().click();
		Thread.sleep(1000);
	}


}
