package Playpen;

import ExcelReader.XLS_reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class webtables2 {
    @Test
    public void webtable2() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        // Navigate to website
        driver.get("file:///C:/Users/Lenovo/Downloads/webtablehtml.html");

        //maximum Wait for 20 sec
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //List<WebElement> col=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
        //int colsize= col.size();
        //System.out.println("This is the column size:    "+colsize);


        WebElement burjrow = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/th[1]"));
        String burjrowText = burjrow.getText();
        //System.out.println("This is the burjrow text:  " + burjrowText);

        String actualrowtext="Burj Khalifa";

        String beforexpath="//*[@class='tsc_table_s13']/tbody/tr[";
        String afterxpath="]/th";

        String beforexpathcol="//*[@class='tsc_table_s13']/tbody/tr/td[";
        String afterxpathcol="]";


        List<WebElement> completerow=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td"));
        int completerowsize=completerow.size();
        System.out.println("Number of cells in Burj Khalifa row are:  " + completerowsize);
      for(int i=1;i<=6;i++){
          if(burjrowText.equalsIgnoreCase(actualrowtext)){
              for(int j=1;j<=completerowsize;j++){
                  String actualxpathcol=beforexpathcol+j+afterxpathcol;
                  String textvalue2=driver.findElement(By.xpath(actualxpathcol)).getText();
                  System.out.println("This is the burjrow text:  " + textvalue2);

              }
              break;

          }

      }
    }
}
