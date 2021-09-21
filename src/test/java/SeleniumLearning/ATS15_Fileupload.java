package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ATS15_Fileupload {
    @Test
    public void fileup1() throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-error=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("http://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Lenovo\\Documents\\Xpath--CSSVersions.rtf");

        Thread.sleep(2500);
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("submitbutton")).click();

       File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotfile, new File("D:\\screen\\screenshot.png"));



    }

}
