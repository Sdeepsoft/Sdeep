package OOPSconcepts;

import org.junit.Test;

public class ATO17_ForLoop {

    @Test
    public void loop1(){
        System.out.println("This is reverse even series");

        for(int i=26;i>=2;i=i-2){
            System.out.println(i);
        }
        System.out.println("This is reverse odd series");
        for(int i=27;i>=1;i=i-2){
            System.out.println(i);
        }
    }
}
