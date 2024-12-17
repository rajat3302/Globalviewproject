package globalview_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import globalview_page.Register_page;
import globalview_page.SignIn_page;


public class Register_Test extends BaseLibrary



{
	Register_page ob;
	SignIn_page ob1;
	@BeforeTest
	@Parameters("browser")
	//public void getLaunchurl_globalview(String browser)
	public void getLaunchurl_globalview()
	{
		getLaunchUrl("https://uat.globalviews.com/");
		//initializedriver(browser, "https://uat.globalviews.com/");
	ob = new Register_page();
	ob1=  new SignIn_page();
	
	}
	
	@Test (priority =1)
	public void clickonMyacount()
	{
		ob1.clickonMyaccount();
	}
	
	@Test(priority = 2)
	public void clickonregister()
	{
		ob.ClickonRegister();
	}
	
	@Test(priority = 3)
	public void companydetails()
	{
		ob.companydetails();
	}
	
	@Test(priority = 4 )
	public void primarydetails() throws InterruptedException
	{
		ob.Primarycontact();
	}
	
	@Test(priority =5)
	public void businessoverview()
	{
		ob.businessoverview();
	}
	
	
	
	
	
	
	
	
}
