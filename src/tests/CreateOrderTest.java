package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateOrderTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		mainPage.clickOnSignInButton();
		Thread.sleep(1000);
		signInPage.clearPasswordField();
	}
	
	@Test
	public void createOrderForOneProductTest() throws InterruptedException {
		String actualText;
    	String expectedText = excelReader.returnStringDataFromExcel("Creating order", 12, 4);
    	
		super.signInWithValidCredentials();
		Thread.sleep(1000);
		mainPage.clickOnCatsLeftImage();
		Thread.sleep(1000);
		catsPage.clickOnManxCatButton();
		Thread.sleep(1000);
		manxPage.clickOnAddToCartFirstButton();
		Thread.sleep(1000);
		shoppingCartPage.clickOnProceedToCheckoutButton();
		Thread.sleep(1000);
		paymentDetailsPage.clickOnContinueButton();
		Thread.sleep(1000);
		orderConfirmPage.clickOnConfirmButton();
		Thread.sleep(2000);
		actualText = orderOverviewPage.messageLabelText();
		assertEquals(actualText, expectedText);
		
	}


}
