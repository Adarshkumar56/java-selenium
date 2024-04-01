

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App7 {

    public static void main(String[] args) {

        // Use WebDriverManager to set up ChromeDriver for M1
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adarshkumar\\Desktop\\java_selenium\\selenium_testing\\src\\drivers\\chromedriver.exe");    


        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com/");

        // Perform a Google search
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).submit();

        // Navigate to Facebook
        driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        // Enter first name on Facebook
       // driver.findElement(By.name("firstname")).sendKeys("YourFirstName");
         driver.findElement(By.id("firstName")).sendKeys("Adarsh");
	        driver.findElement(By.id("lastName")).sendKeys("kumar");
	     driver.findElement(By.id("femalerb")).click();
	        driver.findElement(By.id("englishchbx")).click();
	        driver.findElement(By.id("hindichbx")).click();
	        driver.findElement(By.id("email")).sendKeys("adarsh2gmail.com");
	        driver.findElement(By.id("registerbtn")).click();

        // Refresh the page
        driver.navigate().refresh();

        // Pause for 2 seconds (you can use WebDriverWait for better synchronization)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Navigate back
        driver.navigate().back();

        // Navigate forward
        driver.navigate().forward();

        // Close the browser
        driver.quit();
    }
}