package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
	WebDriver driver;
	WebElement UpdateCartButton;
	WebElement ProceedToCheckoutButton;
	WebElement ReturnToMainMenuButton;
	WebElement productNameFirstLabel;
	WebElement productNameSecondLabel;
	WebElement productQuantityFirstBox;
	WebElement productQuantitySecondBox;
	WebElement removeProductButton;
	
	public ShoppingCartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUpdateCartButton() {
		return UpdateCartButton;
	}

	public WebElement getProceedToCheckoutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
	}

	public WebElement getReturnToMainMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
	
	}
	
	
	
	
	public WebElement getProductNameFirstLabel() {
		return this.driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[3]"));
	}

	public WebElement getProductNameSecondLabel() {
		return this.driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[3]"));
	}
	
	
	
	public WebElement getProductQuantityFirstBox() {
		return this.driver.findElement(By.name("EST-14"));
	}

	public WebElement getProductQuantitySecondBox() {
		return this.driver.findElement(By.name("EST-6"));
	}
	
	

	public WebElement getRemoveProductButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a"));
	}

	public void clickOnReturnToMyMenuButton() {
		this.getReturnToMainMenuButton().click();
	}
	
	public void clickOnProceedToCheckoutButton() {
		this.getProceedToCheckoutButton().click();
	}
	
	public String firstProductName() {
		return this.getProductNameFirstLabel().getText();
	}
	public String secondProductName() {
		return this.getProductNameSecondLabel().getText();
	}
	
	public void clickRemoveButton() {
		this.getRemoveProductButton().click();
	}
	
	
	public int productQuantityFirstBox() {
		String stringProductQuantitiy = this.getProductQuantityFirstBox().getText();
		int intProductQuantity = Integer.parseUnsignedInt(stringProductQuantitiy);
		return intProductQuantity;
	}
	
	public int productQuantitySecondBox() {
		String stringProductQuantitiy = this.getProductQuantitySecondBox().getText();
		int intProductQuantity = Integer.parseUnsignedInt(stringProductQuantitiy);
		return intProductQuantity;
	}

}
