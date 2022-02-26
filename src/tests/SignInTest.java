package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		mainPage.clickOnSignInButton();
		Thread.sleep(1000);
		signInPage.clearPasswordField();
	}
	
	@Test
	public void signInWithValidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("Log in", 7, 2);
		String password = excelReader.returnStringDataFromExcel("Log in", 8, 2);
		
		signInPage.insertUsername(username);
		signInPage.insertPassword(password);
		signInPage.clickLogin();
	}
	
	@Test
	public void signInWithInvalidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("Log in", 19, 2);
		String password = excelReader.returnStringDataFromExcel("Log in", 20, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Log in", 23, 3);
		String actualText;
		
		signInPage.insertUsername(username);
		signInPage.insertPassword(password);
		signInPage.clickLogin();
		actualText = signInPage.getLoginErrorTosterMessageText();
		
		assertEquals(actualText, expectedText);
	}
}
