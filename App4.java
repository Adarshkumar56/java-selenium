import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adarshkumar\\Desktop\\java_selenium\\selenium_testing\\src\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.python.org/");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

