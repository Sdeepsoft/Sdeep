package CreateAccount;

import BaseClass.OpenBrowser;
import ExcelReader.XLS_reader;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;


public class AT02_CreateAccount {


    @Test
    public static void createacc() throws IOException {
        OpenBrowser.NavtoWebsite("Regurl");
    }
    @Test
    public static void asserttitle()  {
        String Actualtitle= OpenBrowser.driver.getTitle();

        Assert.assertTrue(Actualtitle.contains("Norman"));
    }


@Test
    public static void enterfirstname(){

    XLS_reader reader=new XLS_reader("C:\\Users\\Lenovo\\Downloads\\TestDataHN1.xlsx");

        String Firstname=reader.getCellData("UserData","FirstName",2);
        OpenBrowser.driver.findElement(By.id("firstname")).clear();
        OpenBrowser.driver.findElement(By.id("firstname")).sendKeys(Firstname);  }
@Test
    public static void enterlastname(){

    XLS_reader reader=new XLS_reader("C:\\Users\\Lenovo\\Downloads\\TestDataHN1.xlsx");
        String Lastname=reader.getCellData("UserData","LastName",2);
        OpenBrowser.driver.findElement(By.id("lastname")).clear();
        OpenBrowser.driver.findElement(By.id("lastname")).sendKeys(Lastname); }
@Test
    public static void enteremail(){

    XLS_reader reader=new XLS_reader("C:\\Users\\Lenovo\\Downloads\\TestDataHN1.xlsx");
        String Emailadd=reader.getCellData("UserData","EmailAddress",2);
        OpenBrowser.driver.findElement(By.id("email_address")).clear();
        OpenBrowser.driver.findElement(By.id("email_address")).sendKeys(Emailadd);  }
     @Test
    public static void enterpswd(){

         XLS_reader reader=new XLS_reader("C:\\Users\\Lenovo\\Downloads\\TestDataHN1.xlsx");
        String Password1=reader.getCellData("UserData","Password",2);
        OpenBrowser.driver.findElement(By.id("password")).clear();
        OpenBrowser.driver.findElement(By.id("password")).sendKeys(Password1); }
@Test
    public static void enterrepswd(){
    XLS_reader reader=new XLS_reader("C:\\Users\\Lenovo\\Downloads\\TestDataHN1.xlsx");

        String Password2=reader.getCellData("UserData","RePassword",2);
        OpenBrowser.driver.findElement(By.id("confirmation")).clear();
        OpenBrowser.driver.findElement(By.id("confirmation")).sendKeys(Password2);  }
}
