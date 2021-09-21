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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ATS10_isselectedAllradio {
    @Test
    public void radiobutton1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-error=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver();

        driver.get("https://echoecho.com/htmlforms10.htm");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        List<WebElement> radiolist=driver.findElements(By.xpath("//input[@type='radio']"));
        int rsize=radiolist.size();

        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,450)");
        System.out.println("This is the size of radiolist buttons:  "+rsize);


        for(int i=0;i<rsize;i++){

            boolean rstatus=radiolist.get(i).isSelected();

            if(rstatus!=true){
                radiolist.get(i).click();
                String rtext=radiolist.get(i).getAttribute("value");
                System.out.println("This is name of radio button:  "+rtext);
                Thread.sleep(3000);
            }

        }
            }


        }


