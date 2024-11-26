package globalview_page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;


public class SignIn_page extends BaseLibrary

{
	public SignIn_page() // constructor 
	{
		PageFactory.initElements(driver, this); // initelements is a method this refer global
	} 
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement clickMyaccount;
	@FindBy(xpath="//*[@title='Log In']")
	private WebElement clicksignIn;
	@FindBy(xpath = "//input[@name='login[username]']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='login[password]']")
	private WebElement password;
	@FindBy(xpath="(//div[@class='primary'])[1]/button")
	private WebElement login;
	@FindBy(xpath = "//input[@placeholder='EMAIL ADDRESS*']")
	private WebElement uname;
	@FindBy(xpath = "//input[@placeholder='PASSWORD*']")
	private WebElement pass1;
	@FindBy(xpath = "(//*[text()='LOGIN'])[2]")
	private WebElement login2;
	@FindBy(xpath= "//*[text()='Log Out']")
	private WebElement logout;
	
	
	
	public void clickonMyaccount()
	{
		clickMyaccount.click();
	}
	public void clickonsignin()
	{
		clicksignIn.click();
	}
	public void enterusername()
	{
		username.sendKeys("rshrotriya3@gmail.com");
	}
	public void enterpassword()
	{
		password.sendKeys("Rajat@123");
	}
	public void clickonlogin()
	{
		login.click();
	}
	public void uname()
	{
		uname.clear();
		uname.sendKeys("Satsish@gmail.com");
		
	}
	public void pass1()
	{
		pass1.sendKeys("1234");
	}
	public void login2()
	{
		login2.click();
	}
	
	public void uname2()
	{
		uname.clear();
		uname.sendKeys("naveen.k.sharma@innoage.in");
	}
	public void pass2()
	{
		pass1.sendKeys("Admin@1234");
	}
	public void login3()
	{
		login2.click();
	}
	public void logout()
	{
		clickMyaccount.click();
		logout.click();
	}
	
	
}
