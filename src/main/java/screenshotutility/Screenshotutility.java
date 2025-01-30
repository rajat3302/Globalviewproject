package screenshotutility;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import baselibrary.CustomReportListener;


@Listeners(CustomReportListener.class)
public class Screenshotutility extends BaseLibrary


{
 @BeforeMethod
 public void setup()
 {
	 getLaunchUrl("https://uat.globalviews.com/"); 
 }
	
 @AfterMethod
 public void teardoen()
 {
	 driver.quit();
 }
 
 @Test
 public void takeScreenshotTest1()
 {
	 Assert.assertEquals(false, true );
 }
 
 @Test
 public void takeScreenshotTest2()
 {
	 Assert.assertEquals(false, true );
 }
  
 @Test
 public void takeScreenshotTest3()
 {
	 Assert.assertEquals(false, true );
 }
	
}
