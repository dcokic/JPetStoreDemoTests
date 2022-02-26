package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	WebDriver driver;
	WebElement usernameInputField;
	WebElement passwordInputField;
	WebElement loginButton;
	WebElement loginErrorTosterMessage;

	public SignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUsernameInputField() {
		return this.driver.findElement(By.name("username"));
	}

	public WebElement getPasswordInputField() {
		return this.driver.findElement(By.name("password"));
	}

	public WebElement getLoginButton() {
		return this.driver.findElement(By.name("signon"));

	}

	public WebElement getLoginErrorTosterMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
	}

	public void clearPasswordField() {
		this.getPasswordInputField().clear();
	}
	
	public void insertUsername(String username) throws InterruptedException {
		this.getUsernameInputField().sendKeys(username);
		Thread.sleep(1000);
		
	}
	
	public void insertPassword(String password) throws InterruptedException {
		this.getPasswordInputField().sendKeys(password);
		Thread.sleep(1000);
	}
	
	public void clickLogin() throws InterruptedException {
		this.getLoginButton().click();
		Thread.sleep(1000);
	}
	
	public String getLoginErrorTosterMessageText() {
		return this.getLoginErrorTosterMessage().getText();
	}

}
