package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ATS09_WindowHandles {

    @Test
    public void windowhandle1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver();


        driver.get("https://www.harveynorman.com.au/customer/account/login");

driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[text()='CustomiseMe']")).click();

//Now a new window has opened so to get its window handle, we use below code, that returns a set of string
//of all window handles.
        Set<String> allwindowhandles=driver.getWindowHandles();

//Now we use Iterator to get window handles of required window only(to separate all handles)
        Iterator<String> it=allwindowhandles.iterator();

//First time, next method will catch window handle of first window,(at index 0)
// i.e HN account screen window here(First window)

        String firsthandle=it.next();

//Now it will catch next window handle which is "Customise Me" window.
        String secondhandle= it.next();

        System.out.println("This is first window handle: "+firsthandle);
        System.out.println("This is second window handle: "+secondhandle);

//Now switch to the second window of "Customise Me"
        driver.switchTo().window(secondhandle);
         Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hi");
         Thread.sleep(2000);
        driver.switchTo().window(firsthandle);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");



    }
}
