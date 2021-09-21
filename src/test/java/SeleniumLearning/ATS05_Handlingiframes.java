package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ATS05_Handlingiframes {
@Test
    public void handleframe1() {

    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--ignore-ssl-errors=yes");
    options.addArguments("--start-maximized");
    WebDriver driver = new ChromeDriver(options);

    driver.get("https://www.harveynorman.com.au/signup");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    List<WebElement> listofframes = driver.findElements(By.tagName("iframe"));
    int lsize = listofframes.size();
    System.out.println(lsize);

    WebElement frm= driver.findElement(By.xpath("//iframe[@class='mobSubscribe ']"));
    driver.switchTo().frame(frm);

    driver.findElement(By.id("firstName")).sendKeys("auto");
    System.out.println("Sign up frame has been found");
    driver.switchTo().defaultContent();
}


        }









