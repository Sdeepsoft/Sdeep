package OOPSconcepts;

import org.junit.Test;

public class ATO9_Polymorph_MethodOverloading1 {

    @Test
    public void addnum1(){
        int a=50;
        int b=70;
        System.out.println("This is the first addition method:  "+(a+b));
    }
    public void addnum2(int a,int b)
    {
        System.out.println("This is the second addition method:  "+(a+b));
    }
    public void addnum3(int a)
    {
        System.out.println("This is the third addition method:  "+a);
    }
}
