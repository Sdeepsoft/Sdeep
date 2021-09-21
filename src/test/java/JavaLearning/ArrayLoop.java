package JavaLearning;

import org.junit.Test;

public class ArrayLoop {

    @Test
    public void arr2(){
        int[] age={1,2,3,4,5,6,7,8,9,10};
        int j= age.length;
        System.out.println("The length of this array is: " +j);

        for(int i=9;i<j;i--){
            System.out.println("Array index : "+i+"  contains value:  "+age[i]);

        }
    }
}
