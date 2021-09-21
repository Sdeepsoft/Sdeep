package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ATS11_selectallCheckboxs {
@Test
    public void selectchk1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--Start-maximized");
        WebDriver driver=new ChromeDriver();

        driver.get("https://echoecho.com/htmlforms09.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,450)");

        List<WebElement> checkboxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));
        int csize=checkboxlist.size();
        System.out.println("The number of checkboxes are:  "+csize);

        for(int i=0;i<csize;i++){

            boolean cstatus=checkboxlist.get(i).isSelected();

            if(cstatus==false){
                checkboxlist.get(i).click();
                String checkname=checkboxlist.get(i).getAttribute("value");
                System.out.println("The checkbox name is:  "+checkname);
                Thread.sleep(2500);
            }
            else if(cstatus==true){
                checkboxlist.get(i).click();
                String checkname=checkboxlist.get(i).getAttribute("value");
                System.out.println("The checkbox name is:  "+checkname);
                Thread.sleep(2500);
            }
        }


    }
}
