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
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\GlobalViews\\Comglobalview\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try
        {
            // Navigate to the webpage
            driver.get("https://uat.globalviews.com/brand-partners/williamsburg");

            // Locate all images on the page
            List<WebElement> images = driver.findElements(By.tagName("img"));

            // Iterate through each image and validate
            for (WebElement image : images) {
                // Get the image URL from the 'src' attribute
                String imageURL = image.getAttribute("src");

                // Validate the image URL
                if (imageURL != null && !imageURL.isEmpty()) {
                    // Check if the image is accessible
                    boolean isImageValid = validateImageURL(imageURL);
                    if (isImageValid) {
                        System.out.println("Image is valid: " + imageURL);
                    } else {
                        System.out.println("Image is broken: " + imageURL);
                    }
                } else {
                    System.out.println("Image src is empty or null.");
                }
            }
        } finally 
        {
            // Close the browser
            //driver.quit();
        }
    }

    // Method to validate the image URL
    public static boolean validateImageURL(String imageURL) 
    {
        try {
            // Open a connection to the image URL
            HttpURLConnection connection = (HttpURLConnection) new URL(imageURL).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            // Get the HTTP response code
            int responseCode = connection.getResponseCode();

            // Check if the response code is 200 (OK)
            return responseCode == HttpURLConnection.HTTP_OK;
        } catch (Exception e) {
            System.out.println("Error while validating image: " + e.getMessage());
            return false;
        }
    }
}

