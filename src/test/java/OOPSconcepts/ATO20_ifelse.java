package OOPSconcepts;

import org.junit.Test;

public class ATO20_ifelse {

    @Test
    public void ifelselearn1(){
        String browser="Chromeqa";


        if(browser.equalsIgnoreCase("Chrome"))
        {
            System.out.println("This is the expected browser.");
        }
        else
        {
            System.out.println("This is not the expected browser.");
        }


    }
}
