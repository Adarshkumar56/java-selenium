import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adarshkumar\\Desktop\\java_selenium\\selenium_testing\\src\\drivers\\chromedriver.exe");
        System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");


        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("apple");


        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchButton.click();


        Thread.sleep(3000);


        WebElement firstVideo = driver.findElement(By.xpath("//ytd-video-renderer[1]//a[@id='thumbnail']"));
        firstVideo.click();


        Thread.sleep(5000);


        WebElement playButton = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
        playButton.click();


     //    Thread.sleep(10000);

     //    driver.quit();
    }
}