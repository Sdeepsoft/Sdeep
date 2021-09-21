package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ATS13_MouseoverMenu {
    @Test
    public void mouseover(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore--ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.flipkart.com/samsung-galaxy-m11-black-32-gb/p/itm0871b45a83143?pid=MOBFRZZHRFVXDUZZ&lid=LSTMOBFRZZHRFVXDUZZT0UXMH&fm=neon%2Fmerchandising&iid=M_bc192a15-5506-4043-b66f-dc2e35b19261_30.9KK7Q86K1XDD&ppt=hp&ppn=homepage&ssid=10e1ljxhnk0000001631598141870&otracker=hp_omu_Best%2BBattery%2BPhones_2_15.dealCard.OMU_9KK7Q86K1XDD_7&otracker1=hp_omu_WHITELISTED_neon%2Fmerchandising_Best%2BBattery%2BPhones_NA_dealCard_cc_2_NA_view-all_7&cid=9KK7Q86K1XDD");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement womenmenu=driver.findElement(By.xpath("//span[text()='Women']"));

        Actions action=new Actions(driver);
       action.moveToElement(womenmenu).build().perform();

        System.out.println("Mouse over women tab is done");


    }
}
