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

public class ATS04_ListofLinks {

    @Test
    public void linklist1()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
//Open Create Account screen on HN website.
        driver.get("https://www.harveynorman.com.au/customer/account/create/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//We are finding all elements of tagname "a" which means a list of links that we stored in 'list'

        List<WebElement> list=driver.findElements(By.tagName("a"));
//check how many total no. of links are there.

        int totallinks= list.size();
        System.out.println(totallinks);

//Print text/linknames of all links now

        for(int i=0;i<totallinks;i++){
            String Linknames=list.get(i).getText();

//Checking if a particular linkname is there in the list or not.
            if(Linknames.equalsIgnoreCase("Account")){
                System.out.println("Account linkname has been found");
                break;
            }
        }

    }

}
