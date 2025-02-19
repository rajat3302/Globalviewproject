package globalview_page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;


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
	@FindBy(xpath="//div[@class='login-popup-top']//button[@id='send2']")
	private WebElement login;
	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[4]/div[1]")
	private WebElement rememberme;
	@FindBy(xpath = "//label[text()='Email Address*']/following-sibling::div/input")
	private WebElement uname;
	@FindBy(xpath = "//label[text()='Password*']/following-sibling::div/input")
	private WebElement pass1;
	@FindBy(xpath = "//button[text()='Login']")
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
		username.sendKeys(Propertyutility.getproperty("email1"));
	}
	public void enterpassword()
	{
		password.sendKeys(Propertyutility.getproperty("password1"));
	}
	public void clickonlogin()
	{	
		login.click();
	}
	public void uname()
	{
		uname.clear();
		uname.sendKeys(Propertyutility.getproperty("email2"));
		
	}
	public void pass1()
	{
		pass1.sendKeys(Propertyutility.getproperty("password2"));
	}
	public void login2()
	{
		login2.click();
	}
	
	public void uname2()
	{
		uname.clear();
		uname.sendKeys(Propertyutility.getproperty("email3"));
		pass1.sendKeys(Propertyutility.getproperty("password3"));
	}
	public void login3()
	{
		login2.click();
		
	}
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		clickMyaccount.click();
		logout.click();
	}
	
	
}
