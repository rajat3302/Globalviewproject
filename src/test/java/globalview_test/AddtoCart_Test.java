package globalview_test;

import java.text.ParseException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import baselibrary.CustomReportListener;
import globalview_page.AddtoCart_page;
import globalview_page.HomeLinks_page;
import globalview_page.HomepageTitle;
import globalview_page.SignIn_page;



@Listeners(CustomReportListener.class)
public class AddtoCart_Test extends BaseLibrary

{
	SignIn_page ob;
	AddtoCart_page ob1;
	HomeLinks_page ob2;
	HomepageTitle ob3;
	
	@BeforeTest
	public void getlaunchurl_globalview()
	{
		getLaunchUrl("https://uat.globalviews.com/");
		ob = new SignIn_page();
		ob1 = new AddtoCart_page();
		ob2 = new HomeLinks_page();
		ob3 = new HomepageTitle();
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
	
//	@Test(priority = 7)
//	public void validateaddtocart() throws InterruptedException
//	{
//		ob1.Addtocart();
//	}
//	@Test(priority= 8)
//	public void cartcheckout() throws InterruptedException
//	{
//		ob1.validateavaivaility();
//	}
//	@Test(priority = 9)
//	public void theproductpricesubtotal() throws InterruptedException, ParseException
//	{
//		ob1.verifytheproductpricesubtotal();
//	}
//	@Test(priority = 10)
//	public void validatecarttotal() throws ParseException, InterruptedException
//	{
//		ob1.verifythecarttotal();
//	}
//	@Test(priority =11)
//	public void validateremoveitem() throws InterruptedException
//	{
//		ob1.removeproductoncart();
//	}
//	@Test(priority = 12)
//	public void vaidatesubtotalagain() throws InterruptedException
//	{
//		ob1.verifysubtotalagainfirstitem();
//	}	
//	@Test(priority = 13)
//	public void validateprintcart() throws InterruptedException
//	{
//		ob1.printcartvaldate();
//	}
//	@Test(priority = 14)
//	public void securecheckout() throws InterruptedException
//	{
//		ob1.securecheckout();
//	}
//	@Test(priority = 15)
//	public void clearcart() throws InterruptedException
//	{
//		ob1.clearshopingcart();
//	}
//	@Test(priority = 16)
//	public void verifypagetitle()
//	{
//		ob3.gettitleGolbalView();
//	}
//	@Test(priority = 17)
//	public void validatelogout() throws InterruptedException
//	{
//		ob.logout();
//	}
	
@AfterTest
public void quitdriver()
{
	//driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
