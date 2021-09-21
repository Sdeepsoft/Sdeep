package Playpen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class webtableslearning {
@Test
    public void webtable1() {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--ignore-ssl-errors=yes");
            options.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(options);

            // Navigate to website
            driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

            //maximum Wait for 30 sec
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            List<WebElement> col=driver.findElements(By.xpath("//thead/tr/th"));
            int colsize= col.size();
            System.out.println("This is the column size:  "+colsize);

        List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
        int rowsize= row.size();
        System.out.println("This is the row size:  "+rowsize);



        }}
