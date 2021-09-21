package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ATS03_Entertext {

    @Test
    public void Textenter01()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
//Open Create Account screen on HN website.
        driver.get("https://www.harveynorman.com.au/customer/account/create/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//Enter "autotest" in the field of firstname.
        driver.findElement(By.id("firstname")).sendKeys("autotest");


    }
}
