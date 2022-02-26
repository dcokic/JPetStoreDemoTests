package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DogsPage {
	WebDriver driver;
	WebElement BulldogButton;
	WebElement PoodleButton;
	WebElement DalmationButton;
	WebElement GoldenRetrieverButton;
	WebElement LabradorRetrieverButton;
	WebElement ChihuahuaButton;
	WebElement ReturnToMainMenuButton;
	
	public DogsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getBulldogButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	} 

	public WebElement getPoodleButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}
	

	public WebElement getDalmationButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a"));
	}

	public WebElement getGoldenRetrieverButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a"));
	}

	public WebElement getLabradorRetrieverButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[6]/td[1]/a"));
	}

	public WebElement getChihuahuaButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td[1]/a"));
	}

	public WebElement getReturnToMainMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
	}
	
	public void clickOnBulldogButton() throws InterruptedException {
		this.getBulldogButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnPoodleButton() throws InterruptedException {
		this.getPoodleButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnDalmationButton() throws InterruptedException {
		this.getDalmationButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnGoldenRetriverButton() throws InterruptedException {
		this.getGoldenRetrieverButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnLabradorRetriverButton() throws InterruptedException {
		this.getLabradorRetrieverButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnChihuahuaButton() throws InterruptedException {
		this.getChihuahuaButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnReturnToMainMenuButton() throws InterruptedException {
		this.getReturnToMainMenuButton().click();
		Thread.sleep(2000);
	}
	

}
