package globalview_test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baselibrary.BaseLibrary;




public class Verifyimagetest extends BaseLibrary
{

	
	    public static void main(String[] args) 
	    {
	    	 System.setProperty("webdriver.edge.driver", "C:\\GlobalViews\\Comglobalview\\driver\\msedgedriver.exe");

	         // Initialize WebDriver
	         WebDriver driver = new ChromeDriver();

	         // Base URL
	         String baseUrl = "https://anirudh-bhati-store01.myshopify.com/collections/all?page=2"; 

	        try {
	            // Navigate to the webpage
	            driver.get("https://anirudh-bhati-store01.myshopify.com/collections/all?page=4");
	            driver.manage().window().maximize();
	            
	            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1");
	            driver.findElement(By.xpath("//*[text()='Enter']")).click();
	            
	            
	            
	            
	            

	            // Find all image elements
	            List<WebElement> images = driver.findElements(By.tagName("img"));
	            System.out.println("Total images found: " + images.size());

	            for (WebElement img : images) {
	                // Get the 'src' attribute of the image
	                String imageUrl = img.getAttribute("src");

	                // Check if the URL ends with .webp
	                if (imageUrl != null && imageUrl.endsWith(".webp")) {
	                    System.out.println("Image with .webp extension found: " + imageUrl);
	                    
	                    // Verify if the image is accessible
	                    try {
							if (isImageUrlValid(imageUrl)) {
							    System.out.println("Image is valid and accessible.");
							} else {
							    System.out.println("Broken image: " + imageUrl);
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                } else {
	                    System.out.println("Non-webp image found: " + imageUrl);
	                }
	            }
	        } finally {
	            // Close the driver
	            driver.quit();
	        }
	    }

	    // Function to verify if the image URL is valid
	    public static boolean isImageUrlValid(String imageUrl) 
	    {
	        try {
	            URL url = new URL(imageUrl);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");
	            connection.connect();
	            int responseCode = connection.getResponseCode();
	            return responseCode == 200;
	        } catch (Exception e) {
	            System.out.println("Error checking image URL: " + imageUrl);
	            return false;
	        }
	    }
	}
	

