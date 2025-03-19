package globalview_test;

import java.text.ParseException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import globalview_page.AddtoCart_page;
import globalview_page.Checkout_page;
import globalview_page.HomepageTitle;
import globalview_page.SignIn_page;

public class Checkout_Test extends BaseLibrary

{
	
	SignIn_page ob;
	AddtoCart_page ob1;
	HomepageTitle ob2;
	Checkout_page ob3;
	
	
   @BeforeTest
   public void getlanunchurl_globalview()
   {
	   getLaunchUrl("https://uat.globalviews.com/");
	   ob = new SignIn_page();
	   ob1= new AddtoCart_page();
	   ob2= new HomepageTitle();
	   ob3= new Checkout_page();
	   
	   
	   
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
	public void theproductpricesubtotal() throws InterruptedException, ParseException
	{
		ob1.verifytheproductpricesubtotal();
	}
	@Test(priority = 10)
	public void validatecarttotal() throws ParseException, InterruptedException
	{
		ob1.verifythecarttotal();
	}
	@Test(priority =11)
	public void validateremoveitem() throws InterruptedException
	{
		ob1.removeproductoncart();
	}
	@Test(priority = 12)
	public void vaidatesubtotalagain() throws InterruptedException
	{
		ob1.verifysubtotalagainfirstitem();
	}	
	@Test(priority = 13)
	public void validateprintcart() throws InterruptedException
	{
		ob1.printcartvaldate();
	}
	@Test(priority = 14)
	public void securecheckout() throws InterruptedException
	{
		ob1.securecheckout();
	}
	@Test(priority = 15)
	public void validatepagetitel() throws InterruptedException
	{
		ob3.validatepagetitlecheckout();
	}
	@Test(priority= 16)
	public void ordersummery() throws InterruptedException
	{
		ob3.ordersummery();
	}
	@Test(priority = 17)
	public void selectshippingaddress() throws InterruptedException
	{
		ob3.selectshippingadderess();
	}
	@Test(priority = 18)
	public void verifynewaddressform() throws InterruptedException
	{
		ob3.validatenewshippingaddressform();
	}
	@Test(priority= 19)
	public void selectshipingmethod() throws InterruptedException
	{
		ob3.selectshippingmethod();
	}
	@Test(priority = 20)
	public void editponumber() throws InterruptedException
	{
	ob3.validateeditponumber();
	}	
	@Test(priority= 21)
	public void validateinfinalcheckout() throws InterruptedException
	{
		ob3.finalcheckoutpagevalidation();
	}
	@Test(priority = 22)
	public void finalcheckout() throws InterruptedException
	{
		ob3.finalcheckout();
	}
	
	
	
	
	
	
	
	
	
	
}
