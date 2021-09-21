package Playpen;

import ExcelReader.XLS_reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CreateUsers {

    @Test
    public void enterText() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        // Navigate to HN website
        driver.get("https://www.harveynorman.com.au/customer/account/create/");

        //maxium Wait for 30 sec
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        XLS_reader reader=new XLS_reader("C:\\Users\\Lenovo\\Downloads\\TestDataHN1.xlsx");

        int rowcount=reader.getRowCount("RegTestData");

        for(int rownum=2;rownum<rowcount;rownum++) {


            String Firstname=reader.getCellData("RegTestData","FirstName",rownum);
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys("Firstname");

            String Lastname=reader.getCellData("RegTestData","LastName",rownum);
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("Lastname");

            String Emailadd=reader.getCellData("RegTestData","EmailAddress",rownum);
            driver.findElement(By.id("email_address")).clear();
            driver.findElement(By.id("email_address")).sendKeys("Emailadd");

            String Password1=reader.getCellData("RegTestData","Password",rownum);
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Password1");

            String Password2=reader.getCellData("RegTestData","RePassword",rownum);
            driver.findElement(By.id("confirmation")).clear();
            driver.findElement(By.id("confirmation")).sendKeys("Password2");

        }


}}
