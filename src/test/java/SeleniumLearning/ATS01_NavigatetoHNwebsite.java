package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class ATS01_NavigatetoHNwebsite {
public static WebDriver driver;
@Test
public void navigate() {
    //This code will identify the installed version of chrome and open accordingly.

    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--ignore-ssl-errors=yes");
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
//Navigate to HN website
    driver.get("https://www.harveynorman.com.au/");
//Maximum wait for 30 seconds
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//Assert means confirmation that we are on the right page.
    System.out.println("Title of this page is:  "+driver.getTitle());

    String ActualTitle= driver.getTitle();

    String ExpectedTitle="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";

    //assertequals

    Assert.assertEquals(ExpectedTitle, ActualTitle);

    //Another version of assert

    Assert.assertTrue(ActualTitle.contains("Computers"));
}
}
