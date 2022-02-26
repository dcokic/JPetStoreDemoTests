package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BulldogPage {
	WebDriver driver;
	WebElement ESTSixButton;
	WebElement ESTSevenButton;
	WebElement AddToCartButtonFirst;
	WebElement AddToCartButtonSecond;

	public BulldogPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getESTSixButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	}

	public WebElement getESTSevenButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}

	public WebElement getAddToCartButtonFirst() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
	}

	public WebElement getAddToCartButtonSecond() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a"));
	}
	
	public void clickOnAddToCartButtonFirst() throws InterruptedException {
		this.getAddToCartButtonFirst().click();
		Thread.sleep(1000);
	}
	
	public void clickOnAddToButtonSecond() throws InterruptedException {
		this.getAddToCartButtonSecond().click();
		Thread.sleep(1000);
	}
	
	
	
	

}
