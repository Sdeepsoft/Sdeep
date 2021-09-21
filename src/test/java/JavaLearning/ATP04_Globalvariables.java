package JavaLearning;

import org.junit.Test;

public class ATP04_Globalvariables {
    //Global variables
    int i=10;
    int j=30;
    String firstname="Software";
    String lastname="Labs";
    @Test
    public void add1(){
        int a=i+j;
        System.out.println("This is the sum:  " +a);
    }
    @Test
    public void string2(){
        System.out.println("This is the name of company: "+firstname+lastname);
    }
}
