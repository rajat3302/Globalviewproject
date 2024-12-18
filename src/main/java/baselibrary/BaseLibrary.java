package baselibrary;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.xml.XmlSuite;





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
	
	
	
	public class CustomReporter implements IReporter 
	{

	    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	        System.out.println("Generating custom report...");
	        // Example: Extract details from test results and format a custom report.
	        for (ISuite suite : suites) {
	            suite.getResults().forEach((key, result) -> {
	                System.out.println("Suite Name: " + suite.getName());
	                System.out.println("Test Name: " + result.getTestContext().getName());
	                System.out.println("Passed Tests: " + result.getTestContext().getPassedTests().size());
	                System.out.println("Failed Tests: " + result.getTestContext().getFailedTests().size());
	                System.out.println("Skipped Tests: " + result.getTestContext().getSkippedTests().size());
	            });
	        }
	    }
	}
	

	
	
	@AfterTest
	public void teardown()
	{
		//driver.quit();
		
	}

}
