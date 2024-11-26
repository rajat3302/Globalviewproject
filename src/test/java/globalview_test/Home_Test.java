package globalview_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.management.DescriptorKey;
import baselibrary.BaseLibrary;
import globalview_page.Homepage;
import io.qameta.allure.Description;


public class Home_Test extends BaseLibrary

{
	Homepage ob;
	@BeforeTest
	public void getLaunchurl_globalview()
	{
		getLaunchUrl("https://dev.globalviews.com/");
		ob = new Homepage();
	}
	
	@Description("To verify the Home page of Globalview")
	@Test
	
	public void toverifyTitle()
	{
		ob.gettitleGolbalView();
	}
	
	
	
}	
