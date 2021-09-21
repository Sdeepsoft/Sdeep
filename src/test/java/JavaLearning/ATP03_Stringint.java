package JavaLearning;

import org.junit.Test;

public class ATP03_Stringint {
    @Test
    public void add(){
       //Local variables
       int i=20;
       int j=50;
       int k=i+j;
       System.out.println(k);

    }
    @Test
    public void subtract(){
        int l=90;
        int m=70;
        int p=l-m;
        System.out.println(p);
    }
    @Test
    public void string1(){
        String fname="Auto";
        String mname="mation";
        String lname="class";

        System.out.println("This is:  "+fname+mname+"  "+lname);
    }
}
