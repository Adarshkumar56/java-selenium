import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App2 {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adarshkumar\\Desktop\\java_selenium\\selenium_testing\\src\\drivers\\chromedriver.exe");    

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a URL
        driver.get("https://youtube.com");

        // Perform some actions on the page using XPath
        WebElement exampleLink = driver.findElement(By.xpath("https://www.youtube.com/@nittetube"));
        exampleLink.click();

        // Navigate back to the previous page
        driver.navigate().back();

        // Navigate forward to the next page using XPath
        WebElement nextLink = driver.findElement(By.xpath("https://www.youtube.com/watch?v=7Je-y7Dnl3w"));
        nextLink.click();

        // Refresh the current page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
