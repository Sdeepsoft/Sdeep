package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ATS02_Takescreenshot {
    @Test
    public void navigate() throws IOException {
        //Opening the browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);

     //Navigating to the url
        driver.get("https://www.google.com/");

     //wait for max 30seconds for the page to load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    //Now take the screenshot of screen
        File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("D:\\screen\\screenshot.png"));

    }
}
