package OOPSconcepts;

import org.junit.Test;

public class ATO21_elseIf {
    @Test
    public void  elseiflearn() {
        String browser = "firefox";

        if (browser.equalsIgnoreCase("safari"))
        {System.out.println("This testcase will run on Safari browser");
        }
        else if (browser.equalsIgnoreCase("IE"))
        {System.out.println("This testcase will run on IE browser");
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {System.out.println("This testcase will run on Firefox browser");
        }
        else{
            System.out.println("The browser is not in the list");
        }
    }
    }

