package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ATS14_DropDownMenu {
    @Test
    public void dropmenu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore--ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com.au/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        WebElement Allmenu=driver.findElement(By.id("searchDropdownBox"));

        Select ss=new Select(Allmenu);
        List<WebElement> listofdrop=ss.getOptions();
        int size= listofdrop.size();
        System.out.println("This is the size of menu items: "+size);
        for(int i=0;i<size;i++){
            String menutext=listofdrop.get(i).getText();
            System.out.println("This is text of menu items: "+menutext);

        }

        }
    }

