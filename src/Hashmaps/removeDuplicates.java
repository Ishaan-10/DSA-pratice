package Hashmaps;

import java.util.*;

public class removeDuplicates {

    public static ArrayList<Integer> duplicateRemove(int arr[]){

        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i],true);
        }

        return output;
    }
    
    public static void main(String[] args) {
        
        int arr[]={7,1,2,1,3,4,2,3,4,6,7,8,6,9,10};
        System.out.println(duplicateRemove(arr));
    }
}
