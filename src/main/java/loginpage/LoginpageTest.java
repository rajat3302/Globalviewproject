package loginpage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginpageTest 


{
	
	static ChromeDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	{
		
		
		driver = new ChromeDriver();
		driver.get("https://surya.commerce.insitesandbox.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//*[text()='Open a Trade Account'])[1]"));
		element.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement companyname = driver.findElement(By.xpath("//*[@name='companyName']"));
		js.executeScript("arguments[0].scrollIntoView(true);", companyname);
		companyname.sendKeys("Abc private limited");
		

		
		
		
		
		
		
		
		
		
		
		String act_Title =   driver.getTitle();
		System.out.println(act_Title);
		
		
		
//		driver.close();
		
	}
}
