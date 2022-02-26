package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement SignInButton;
	WebElement CartIconButton;
	WebElement MyAccountButton;
	WebElement FishLeftImage;
	WebElement DogsLeftImage;
	WebElement CatsLeftImage;
	WebElement ReptilesLeftImage;
	WebElement BirdsLeftImage;
	WebElement SignOutButton;
	
	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignInButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
	}

	public WebElement getCartIconButton() {
		return this.driver.findElement(By.name("img_cart"));
	}
	
	public WebElement getMyAccountButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]"));
	}
	
	public WebElement getFishLeftImage() {
		return this.driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
	}
// //*[@id="SidebarContent"]/a[1]/img 
	public WebElement getDogsLeftImage() {
		return this.driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img"));
	}

	public WebElement getCatsLeftImage() {
		return this.driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]/img"));
	}

	public WebElement getReptilesLeftImage() {
		return this.driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img"));
	}

	public WebElement getBirdsLeftImage() {
		return this.driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img"));
	}
	
	

	public WebElement getSignOutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
	}

	public void clickOnSignInButton() throws InterruptedException {
		this.getSignInButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnCartIconButton() throws InterruptedException {
		this.getCartIconButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnMyAccountButton() {
		this.getMyAccountButton().click();
	}
	
	public void clickOnFishLeftImage() {
		this.getFishLeftImage().click();
	}
	
	public void clickOnDogsLeftImage() {
		this.getDogsLeftImage().click();
	}
	
	public void clickOnCatsLeftImage() {
		this.getCatsLeftImage().click();
	}
	
	public void clickOnReptilesLeftImage() {
		this.getReptilesLeftImage().click();
	}
	
	public void clickOnBirdsLeftImage() throws InterruptedException {
		this.getBirdsLeftImage().click();
		Thread.sleep(1000);
	}
	
	public void clickOnSignOutButton() throws InterruptedException {
		this.getSignOutButton().click();
		Thread.sleep(1000);
	}
}
