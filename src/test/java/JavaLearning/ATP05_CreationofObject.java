package JavaLearning;

import org.junit.Test;

public class ATP05_CreationofObject {
@Test
    public void object(){
        ATP03_Stringint obj=new ATP03_Stringint();
        obj.add();
        obj.string1();
    }

    @Test
    public void object1(){
        ATP02_LearnMethods obj1= new ATP02_LearnMethods();
        System.out.println("This is the output of two methods of learnmethods class");
        obj1.method01();
        obj1.method02();
    }
}
