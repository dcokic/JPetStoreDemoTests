package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductsToCartTests extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void AddOneProductToCart() throws InterruptedException {
		String actualText;
    	String expectedText = excelReader.returnStringDataFromExcel("Add products to cart", 10, 4);
    	
		super.signInWithValidCredentials();
		mainPage.clickOnCatsLeftImage();
		Thread.sleep(1000);
		catsPage.clickOnPersianCatButton();
		Thread.sleep(1000);
		persianPage.clickOnAddToCartFirstButton();
		Thread.sleep(1000);
		actualText = shoppingCartPage.firstProductName();
		assertEquals(actualText, expectedText);
	}
	
	@Test
	public void AddTwoDifferenteProductsToCart() throws InterruptedException {
		String actualText;
    	String expectedText = excelReader.returnStringDataFromExcel("Add products to cart", 26, 4);
    	/*int actualQuantity;
    	int expectedQuantity = (int) excelReader.returnDoubleDataFromExcel("Add products to cart", 27, 2);*/
    	
		super.signInWithValidCredentials();
		mainPage.clickOnCatsLeftImage();
		Thread.sleep(1000);
		catsPage.clickOnManxCatButton();
		Thread.sleep(1000);
		manxPage.clickOnAddToCartFirstButton();
		Thread.sleep(1000);
		shoppingCartPage.clickOnReturnToMyMenuButton();
		Thread.sleep(1000);
		mainPage.clickOnDogsLeftImage();
		Thread.sleep(1000);
		dogsPage.clickOnBulldogButton();
		Thread.sleep(1000);
		bulldogPage.clickOnAddToCartButtonFirst();
		Thread.sleep(1000);
		actualText = shoppingCartPage.secondProductName();
		assertEquals(actualText, expectedText);
		/*actualQuantity = shoppingCartPage.productQuantity();
		assertEquals(actualQuantity, expectedQuantity);*/
		
	}
	
	@AfterMethod
    public void afterMethod() throws InterruptedException {
		mainPage.clickOnSignOutButton();
	}
	
	

}
