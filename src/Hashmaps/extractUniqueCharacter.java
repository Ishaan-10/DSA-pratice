package Hashmaps;

import java.util.HashMap;

public class extractUniqueCharacter {

    public static String uniqueCharacter(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        String output="";

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(map.get(c)==null){
                output+=c;
                map.put(c,1);
            }

        }

        return output;
    }


    
    public static void main(String[] args) {

        String str = "";
        System.out.println(uniqueCharacter(str));
         
        
    }
}
