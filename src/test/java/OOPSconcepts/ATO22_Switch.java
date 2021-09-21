package OOPSconcepts;

import org.junit.Test;

public class ATO22_Switch {

    @Test
    public void switchstatement(){
        int x=3;
        switch(3) {
            case 1:
                System.out.println("Case 1 is selected");
            case 2:
                System.out.println("Case 2 is selected");
            case 3:
                System.out.println("Case 3 is selected");
                break;
            case 4:
                System.out.println("Case 4 is selected");

            default:
                System.out.println("None is selected");
        }
        }
    }

