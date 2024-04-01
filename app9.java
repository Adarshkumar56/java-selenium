import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class app9{
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\adarshkumar\\Desktop\\java_selenium\\selenium_testing\\src\\drivers");
        System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parenthandle = driver.getWindowHandle();
        System.out.println("Parent Handle: "+parenthandle);

        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> handles = driver.getWindowHandles();

        for (String handle:handles){
            System.out.println(handle);
            if(!handle.equals(parenthandle)){
                driver.switchTo().window(handle);
                driver.findElement(By.id("firstName")).sendKeys("Amit");
                driver.findElement(By.id("lastName")).sendKeys("Sah");
        
                driver.findElement(By.id("malerb")).click();
                driver.findElement(By.id("englishchbx")).click();
                driver.findElement(By.id("hindichbx")).click();
                driver.findElement(By.id("frenchchbx")).click();

               driver.findElement(By.id("email")).sendKeys("1nt21cs027.amit@nmit.ac.in");
               driver.findElement(By.id("password")).sendKeys("Nitte123");

               Thread.sleep(5000);
               driver.close();
            }
        }
        driver.switchTo().window(parenthandle);
        Thread.sleep(5000);
        driver.quit();
    }
}
