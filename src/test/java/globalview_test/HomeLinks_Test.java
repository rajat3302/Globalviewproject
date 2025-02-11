package globalview_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import baselibrary.CustomReportListener;
import globalview_page.HomeLinks_page;
import globalview_page.HomepageTitle;


@Listeners(CustomReportListener.class)
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

@Test(priority = 0 , groups = "sanity" )

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
public void validatelinksshopcategory() throws InterruptedException
{
	ob.Verifyshopcategorylinks();
}


@Test(priority = 9 , groups = "sanity")

public void validatefooterlinks() throws InterruptedException
{
	ob.verifypageFooter();
}

@Test(priority = 10 , groups = "regression")
public void signupupdates() throws InterruptedException
{
	
	ob.siggnupform();
}

@Test(priority = 11 , groups = "sanity")
public void Validatebrandpartnerinshop()

{
	ob.Verifybrandpartnerinshop();
}

@Test(priority= 12 ,  groups = "regression")
public void Validatesocialmedialinks()
{
	ob.verifysocialmedialinks();
}

@AfterTest
public void tearDown()
{
//	if(driver != null)
//	{
//		driver.quit();
//	}
}










}