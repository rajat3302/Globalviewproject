package globalview_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.management.DescriptorKey;
import baselibrary.BaseLibrary;
import globalview_page.Homepage;
import globalview_page.SignIn_page;
import io.qameta.allure.Description;
import propertyutility.Propertyutility;


public class Home_Test extends BaseLibrary

{
	Homepage ob;
	@BeforeTest
	@Parameters("browser") //fetch the browser type from testng.xml
	public void getLaunchurl_globalview(String browser)
	//public void getLaunchurl_globalview()
	{
		//getLaunchUrl("https://globalviews.com/");
		initializedriver(browser, "https://uat.globalviews.com/");
		ob = new Homepage();
	}
	@Description("To verify the Home page of Globalview")
	@Test
	
	public void toverifyTitle()
	{
		ob.gettitleGolbalView();
	}
	
	
	
}	
