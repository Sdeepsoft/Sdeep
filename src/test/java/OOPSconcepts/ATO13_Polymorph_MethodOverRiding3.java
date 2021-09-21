package OOPSconcepts;

import org.junit.Test;

public class ATO13_Polymorph_MethodOverRiding3
{
    @Test
    public void polyOverride3(){
        ATO11_Polymorph_MethodOverRiding1 p1= new ATO11_Polymorph_MethodOverRiding1();
        System.out.println("This is third override method");
        p1.polyOverride1();
    }

}
