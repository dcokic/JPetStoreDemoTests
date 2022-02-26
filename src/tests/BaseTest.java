package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AngelfishPage;
import pages.BirdsPage;
import pages.BulldogPage;
import pages.CatsPage;
import pages.DogsPage;
import pages.FishPage;
import pages.MainPage;
import pages.ManxPage;
import pages.OrderConfirmPage;
import pages.OrderOverviewPage;
import pages.PaymentDetailsPage;
import pages.PersianPage;
import pages.RegistrationPage;
import pages.ReptilesPage;
import pages.ShoppingCartPage;
import pages.SignInPage;
import pages.WelcomePage;



public class BaseTest {
	WebDriver driver;
	ExcelReader excelReader;
	WelcomePage welcomePage;
	MainPage mainPage;
	RegistrationPage registrationPage;
	SignInPage signInPage;
	ShoppingCartPage shoppingCartPage;
	PaymentDetailsPage paymentDetailsPage;
	OrderConfirmPage orderConfirmPage;
	OrderOverviewPage orderOverviewPage;
	DogsPage dogsPage;
	BulldogPage bulldogPage;
	CatsPage catsPage;
	ManxPage manxPage;
	PersianPage persianPage;
	FishPage fishPage;
	AngelfishPage angelfishPage;
	BirdsPage birdsPage;
	ReptilesPage reptilesPage;
	String webSiteUrl;
	
	
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		excelReader = new ExcelReader(new File("data/TestPlan.xlsx"));
		//welcomePage = new WelcomePage(driver);
		mainPage = new MainPage(driver);
		registrationPage = new RegistrationPage(driver);
		signInPage = new SignInPage(driver);
		paymentDetailsPage = new PaymentDetailsPage(driver);
		orderConfirmPage = new OrderConfirmPage(driver);
		orderOverviewPage = new OrderOverviewPage(driver);
		fishPage = new FishPage(driver);
		dogsPage = new DogsPage(driver);
		bulldogPage = new BulldogPage(driver);
		catsPage = new CatsPage(driver);
		manxPage = new ManxPage(driver);
		persianPage = new PersianPage(driver);
		angelfishPage = new AngelfishPage(driver);
		shoppingCartPage = new ShoppingCartPage(driver);
		driver.manage().window().maximize();
		webSiteUrl = excelReader.returnStringDataFromExcel("Log In", 4, 2);
		//welcomePage.EnterTheStoreButtonClick();
		
	}
	
	@AfterClass
	public void afterClass() {
		this.driver.close();
	}
	
	public void signInWithValidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("Log in", 7, 2);
		String password = excelReader.returnStringDataFromExcel("Log in", 8, 2);
		mainPage.clickOnSignInButton();
		signInPage.clearPasswordField();
		signInPage.insertUsername(username);
		signInPage.insertPassword(password);
		signInPage.clickLogin();
	}

}


