package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ATS06_Tooltip {
    @Test
    public void tooltiplearn(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore--ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver();

        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);

        WebElement Firsttooltip=driver.findElement(By.xpath("//a[contains(text(),'Tooltips')]"));

        Actions action=new Actions(driver);
       action.moveToElement(Firsttooltip).build().perform();

        String firsttiptext=driver.findElement(By.xpath("//body/div[1]/div[1]")).getText();

        System.out.println("This is the First tooltip text: "+firsttiptext);


    }
}
