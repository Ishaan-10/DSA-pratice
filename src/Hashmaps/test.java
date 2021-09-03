package Hashmaps;

import java.util.*;

public class test {

    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("abc", 1);
        h.put("def", 3);

        if(h.containsKey("abc1")){
            System.out.println("map has abc");
        }
        int i= h.get("abc");
        System.out.println(i);
    }
    
    
}
