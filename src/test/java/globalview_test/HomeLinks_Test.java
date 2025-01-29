package globalview_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import globalview_page.HomeLinks_page;
import globalview_page.HomepageTitle;

public class HomeLinks_Test extends BaseLibrary


{
	HomeLinks_page ob;
	HomepageTitle ob1;
	@BeforeTest
	@Parameters("browser")
	//public void getLaunchurl_globalview(String browser)
	public void getLaunchurl_globalview()
	{
		getLaunchUrl("https://uat.globalviews.com/");
		//initializedriver(browser, "https://uat.globalviews.com/");
	   ob= new HomeLinks_page();
	   ob1= new HomepageTitle();
	
    }

@Test(priority = 0 , groups = "sanity")

	public void gettitle()
	{
		ob1.gettitleGolbalView();
	}

@Test(priority = 1 , groups = "sanity")

	public void verifylogoofpage() throws InterruptedException
	{
		ob.Validatelogo();
	}

@Test(priority = 2 , groups = "regression")
	public void verifyheader() throws InterruptedException
   {
	  ob.validateheader();
   }

@Test(priority = 3  ,  groups = "regression")
public void verifythepage() throws InterruptedException
{
	ob.verifypage();
}

@Test(priority = 4  , groups = "regression")
public void verifynewintroimages()
{
	ob.validatenewindrodcutions();
}

@Test(priority = 5  , groups = "regression")
public void verifybrandpart()
{
	ob.validatebrandpartner();
}

@Test(priority = 6  , groups = "regression")
public void verifyserchbar()
{
	ob.validatesearchbar();
}

@Test(priority = 7 , groups = "sanity")
public void validatesignup() throws InterruptedException
{
	ob.signuplatestupadtes();
}

@Test(priority = 8 , groups = "regression")
public void validatelinksshopcategory()
{
	ob.Verifyshopcategorylinks();
}


















}