package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;


public class ATP09_ArrayList {
//Basic declaration of Arraylist is:
// List<Class_Name>listname = new ArrayList<>();

    @Test
    public void arrlist1() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add("This is an ");
        al.add("Array ");
        al.add("List");

        int s = al.size();
        System.out.println("Size of the arraylist: " + s);
        for (int j = 0; j < s; j++) {
            System.out.println("Array index :"+j+" contains value :"+al.get(j));
        }
    }
}








