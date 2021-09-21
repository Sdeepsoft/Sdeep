package JavaLearning;

import org.junit.Test;

import java.util.HashMap;

public class ATP10_Hashmap {
@Test
    public void hashm(){
        HashMap<String,Integer> map= new HashMap<>();
    map.put("Joe",500);
        map.put("Joa",100);
        map.put("Job",200);
        map.put("Joc",300);
        map.put("Jod",400);


        System.out.println("This is the size of Hashmap: "+map.size());

        System.out.println("These are key values in Hashmap: "+map);
        if(map.containsKey("Joe")){
            int i=map.get("Joe");
            System.out.println("Value for the key:  "+"Joe" +  " is : "+i);
        }


    }
}
