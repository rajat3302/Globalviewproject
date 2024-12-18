package applicationutility;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.BaseLibrary;

public class Applicationutility extends BaseLibrary




{
	
	public static void doubleclick(WebElement ele, WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele);
	}
	 
	public static void rightclick(WebElement ele, WebDriver driver)
	{
		Actions act1= new Actions(driver);
	    act1.contextClick(ele);
	}
	
	public static void mousehover(WebElement ele, WebDriver driver)
	{
		Actions act2 = new Actions(driver);
		act2.moveToElement(ele).perform();
	}
	
	public static void mousehoverclick(WebElement ele, WebElement clickele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).click(clickele).build().perform();
	}
	
	
	
	public static void chnagewindow(int tabno, WebDriver driver)
	{
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> tab = new ArrayList<String>(set);
		driver.switchTo().window(tab.get(tabno));
	}
	
	public static void waitforVisible (WebDriver driver, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
	}
	
	public static void waitforclickible (WebDriver driver, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	
	
	//scroll to element 
	public static void getscroll (WebElement ele, WebDriver driver)
	{
		try 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in Getscroll" +e);
		}
	}
	
	public static void scrolltotop() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(200, 0);");
		
	}
	
	public static void scrolltobottom()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	public static void dropdown(WebElement element, String visibleText)
	{
	
		Select sell = new Select(element);
		sell.selectByVisibleText(visibleText);
	}
	

	
	
	
	
	
}

	












