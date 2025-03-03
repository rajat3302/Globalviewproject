package globalview_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import baselibrary.BaseLibrary;

import globalview_page.SignIn_page;



public class SignIn_test extends BaseLibrary	

{

	SignIn_page ob;
	@BeforeTest
	@Parameters("browser")
	public void getLaunchurl_globalview(String browser)
	//public void getLaunchurl_globalview()
	{
		//getLaunchUrl("https://uat.globalviews.com/");
		initializedriver(browser, "https://uat.globalviews.com/");
	ob = new SignIn_page();
	}
	
	@Test(priority = 0)
	public void ClickonMyaccount() throws InterruptedException
	{	
		Thread.sleep(2000);
		ob.clickonMyaccount();	
	}
	@Test (priority = 1)
	public void clickonSignIn() throws InterruptedException
	{
		Thread.sleep(1000);
		ob.clickonsignin();
	}
	@Test (priority = 2)
	public void username()
	{
		ob.enterusername();
	}
	@Test  (priority = 3)
	public void password()
	{
		ob.enterpassword();
	}
	@Test  (priority = 4 )
	public void login()
	{
		ob.clickonlogin();
	}
	@Test (priority = 5)
		public void uname()
		{
			ob.uname();
		}
	@Test(priority = 6)
	public void pass1()
	{
		ob.pass1();
	}
	@Test(priority = 7 )
	public void login2()
	{
		ob.login2();
	}
	@Test(priority = 8)
	public void uname2()
	{
		ob.uname2();
	}
	
	@Test(priority = 9)
	public void login3() 
	{
		ob.login3();
	}
	@Test(priority = 10)
	public void logout() throws InterruptedException
	{
		
		ob.logout();
	}
	
	
	
}
