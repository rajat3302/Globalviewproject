package baselibrary;



import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;





public class BaseLibrary 

{
	static public WebDriver driver;
	

	public static void getLaunchUrl (String url)
	{
		String loc= "C:\\GlobalViews\\Comglobalview\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", loc);
	    ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	
	public void initializedriver(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\GlobalViews\\Comglobalview\\driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("--incognito");
			driver = new ChromeDriver();
			driver.get(url);
					
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\GlobalViews\\Comglobalview\\driver\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
	        options.addArguments("-private");
			driver = new FirefoxDriver();
			driver.get(url);
			
		}
		else if (browser.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", "C:\\GlobalViews\\Comglobalview\\driver\\msedgedriver.exe");
			EdgeOptions options = new EdgeOptions(); 
	        options.addArguments("-inprivate");
			driver = new EdgeDriver();
			driver.get(url);
			
		}
		else
		{
			throw new IllegalArgumentException("Browser not supported: "+browser);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

	
	
	@AfterTest
	public void teardown()
	{
		//driver.quit();
		
	}

}
