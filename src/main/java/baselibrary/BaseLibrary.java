package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseLibrary 

{
	static public WebDriver driver;
	
	public void getLaunchUrl (String url)
	{
		String loc= "C:\\GlobalViews\\Comglobalview\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", loc);
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
