package globalview_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import baselibrary.CustomReportListener;
import globalview_page.AddtoCart_page;
import globalview_page.HomeLinks_page;
import globalview_page.SignIn_page;



@Listeners(CustomReportListener.class)
public class AddtoCart_Test extends BaseLibrary

{
	SignIn_page ob;
	AddtoCart_page ob1;
	HomeLinks_page ob2;
	
	@BeforeTest
	public void getlaunchurl_globalview()
	{
		getLaunchUrl("https://uat.globalviews.com/");
		ob = new SignIn_page();
		ob1 = new AddtoCart_page();
		ob2 = new HomeLinks_page();
	}
	
	
	
	@Test(priority = 0)
	public void clickonmyaccount()
	{
		ob.clickonMyaccount();
	}
	@Test(priority = 1)
	public void clickonsignIn() throws InterruptedException
	{
		Thread.sleep(1000);
		ob.clickonsignin();
	}
	@Test(priority = 2 )
	public void usernamepass() throws InterruptedException
	{
		Thread.sleep(1000);
		ob.uname2();
	}
	@Test(priority = 3)
	public void loginaccount()
	{
		ob.login3();
	}
	@Test(priority = 4)
	public void shopbrandpartners() throws InterruptedException
	{
		ob1.shopmodule();
	}
	
	@Test(priority = 5)
	public void validatepdppage() throws InterruptedException
	{
		ob1.pdppage();
	}
	
	@Test(priority = 6)
	public void addsecondproduct() throws InterruptedException
	{
		ob1.addproductnewintro();
	}
	
	@Test(priority = 7)
	public void validateaddtocart() throws InterruptedException
	{
		ob1.Addtocart();
	}
	@Test(priority= 8)
	public void cartcheckout() throws InterruptedException
	{
		ob1.validateavaivaility();
	}
	@Test(priority = 9)
	public void theproductpricesubtotal() throws InterruptedException
	{
		ob1.verifytheproductpricesubtotal();
	}
	
	
@AfterTest
public void quitdriver()
{
	//driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
