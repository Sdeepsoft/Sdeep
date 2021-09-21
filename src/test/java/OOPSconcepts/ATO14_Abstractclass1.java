package OOPSconcepts;

import org.junit.Test;

public abstract class ATO14_Abstractclass1
{
    @Test
    public void add(){
        int a=10;
        int b=20;
        System.out.println("This is addition:  "+(a+b));
    }
    @Test
    public void sub(){
        int a=200;
        int b=100;
        System.out.println("This is subtraction:  "+(a-b));
    }
    //We don't know the logic/code for division method so leaving abstract
    @Test
    public abstract void division();
}
