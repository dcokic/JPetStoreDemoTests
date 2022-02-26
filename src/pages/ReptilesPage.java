package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReptilesPage {
	WebDriver driver;
	WebElement RattlesnakeButton;
	WebElement IguanaButton;
	WebElement ReturnToMainMenuButton;
	
	public ReptilesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getRattlesnakeButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	}

	public WebElement getIguanaButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}

	public WebElement getReturnToMainMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
	}
	

	public void clickOnRattlesnakeButton() throws InterruptedException {
		this.getRattlesnakeButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnIguanaButton() throws InterruptedException {
		this.getIguanaButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnReturnToMainMenuButton() throws InterruptedException {
		this.getReturnToMainMenuButton().click();
		Thread.sleep(1000);
	}

}
