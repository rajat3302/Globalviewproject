package globalview_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.management.DescriptorKey;
import baselibrary.BaseLibrary;
import globalview_page.HomepageTitle;
import globalview_page.SignIn_page;
import io.qameta.allure.Description;
import propertyutility.Propertyutility;


public class HomeTitle_Test extends BaseLibrary

{
	HomepageTitle ob;
	
	@BeforeTest
	@Parameters("browser") //fetch sthe browser type from testng.xml
	public void getLaunchurl_globalview(String browser)
	//public void getLaunchurl_globalview()
	{
		//getLaunchUrl("https://globalviews.com/");
		initializedriver(browser, "https://uat.globalviews.com/");
		ob = new HomepageTitle();
	}
	
	@Description("To verify the Home page of Globalview")
	@Test
	public void toverifyTitle()
	{
		ob.gettitleGolbalView();
	}
	
	
	
}	
