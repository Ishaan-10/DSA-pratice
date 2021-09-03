package Hashmaps;

import java.util.HashMap;

public class printIntersection {
    
    public static void main(String[] args) {
        
        int arr1[]={1,3,2,2,3,6};
        int arr2[]={2,4,2,3,5,6,6,2};
        printArrayIntersection(arr1,arr2);
    }

    private static void printArrayIntersection(int[] arr1, int[] arr2) {

        HashMap<Integer,Boolean> map1 = new HashMap<>();

        for(int i:arr1){
            map1.put(i, true);
        }
        for(int i:arr2){
            if(map1.containsKey(i)){
                System.out.print(i + " ");
            }
        }
        
    }
}
