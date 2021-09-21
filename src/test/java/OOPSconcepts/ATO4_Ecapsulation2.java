package OOPSconcepts;

import org.junit.Test;

public class ATO4_Ecapsulation2 {
    @Test
    public void encMethod2(){
        ATO3_Encapsulation ob= new ATO3_Encapsulation();
        int k=ob.encMethod1(70,30);
        System.out.println("This is the value returned by method1: "+k);
    }
}
