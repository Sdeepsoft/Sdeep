package BaseClass;

import Properties.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OpenBrowser {
    public static WebDriver driver;

    public static void NavtoWebsite(String url) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

      //Navigate to HN website
        driver.get(ReadPropertiesFile.Readprop("url"));
       //Maximum wait for 30 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void CloseBrowser(){
        driver.close();
    }
}
