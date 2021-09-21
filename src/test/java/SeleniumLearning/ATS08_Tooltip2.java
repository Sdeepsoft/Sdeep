package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ATS08_Tooltip2 {
    @Test
    public void tooltiplearn() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore--ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.gsmarena.com/samsung-phones-9.php");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,450)");
         Thread.sleep(3000);
        WebElement tooltip=driver.findElement(By.xpath("//img[contains(@src,'m32-5g')]"));

        Actions action=new Actions(driver);
       action.moveToElement(tooltip).build().perform();



    }
}
