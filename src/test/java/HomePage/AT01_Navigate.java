package HomePage;

import BaseClass.OpenBrowser;
import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AT01_Navigate {

@Test
    public static void nav() throws IOException {
    OpenBrowser.NavtoWebsite("url");
}
@Test
    public static void asserttitle(){
    String Actualtitle= OpenBrowser.driver.getTitle();

    Assert.assertTrue(Actualtitle.contains("Norman"));


    }
    }

