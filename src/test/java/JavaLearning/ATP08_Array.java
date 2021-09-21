package JavaLearning;

import org.junit.Test;

public class ATP08_Array {
@Test
    public void arr1() {

        int[] age = {100, 200, 300, 400, 500, 600};
        int l=age.length;
        for (int i = 0; i < l; i++)
        {
            System.out.println("Array index:  "+i+"  contains value:  "+age[i]);
        }
    }
}