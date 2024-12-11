package globalview_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Brokenlinks_Test 
{

    public static void main(String[] args) {
        // Set the ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\GlobalViews\\Comglobalview\\driver\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Base URL
        String baseUrl = "https://uat.globalviews.com/"; // Replace with your web application URL

        try {
            // Open the application
            driver.get(baseUrl);
            driver.manage().window().maximize();

            // Find all links on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));
   		    System.out.println("Total links found: " + links.size());

            int totalLinks = 0;
            int workingLinks = 0;
            int brokenLinks = 0;

            System.out.println("Checking links on: " + baseUrl);

            // Iterate through the links
            for (WebElement link : links) {
                String url = link.getAttribute("href");

                // Skip empty or null URLs
                if (url == null || url.isEmpty()) {
                    System.out.println("Empty or null link found");
                    continue;
                }

                totalLinks++;

                try {
                    // Check the URL status
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.setConnectTimeout(5000); // Timeout in milliseconds
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 400) {
                        System.out.println("Working Link: " + url);
                        workingLinks++;
                    } else {
                        System.out.println("Broken Link: " + url);
                        brokenLinks++;
                    }

                    connection.disconnect();

                } catch (IOException e) {
                    System.out.println("Error checking link: " + url);
                    brokenLinks++;
                }
            }

            // Print the summary
            System.out.println("\n=== Summary ===");
            System.out.println("Total Links: " + totalLinks);
            System.out.println("Working Links: " + workingLinks);
            System.out.println("Broken Links: " + brokenLinks);

        } 
        finally 
        {
            // Close the browser
            driver.quit();
        }
   }
}
