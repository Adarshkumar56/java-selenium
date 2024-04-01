import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting WebDriver...");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adarshkumar\\Desktop\\java_selenium\\selenium_testing\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Open the Moodle login page
            driver.get("http://lms.nmit.ac.in/moodle/login/index.php");

            // Find the username input field and enter the username
            WebElement usernameBox = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            usernameBox.sendKeys("1NT21CS015");

            // Find the password input field and enter the password
            WebElement passwordBox = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            passwordBox.sendKeys("Adarshkumar#4915");

            // Find the login button and click on it
            WebElement loginButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("loginbtn")));
            loginButton.click();

            System.out.println("Logged in successfully!");

            // Wait for a few seconds before quitting the driver
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the WebDriver
            driver.quit();
        }
    }
}
