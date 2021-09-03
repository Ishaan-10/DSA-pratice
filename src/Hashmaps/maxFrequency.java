package Hashmaps;

import java.util.*;

public class maxFrequency {

    public static void main(String[] args) {

        int arr[]={1,2,2,3,3,4,5,6,7,8,9,10,10,10};
        System.out.println(maxFreq(arr));
        
    }
    public static int maxFreq(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int max = Integer.MIN_VALUE;
        int maxNumber=arr[0];

        for(int i=0;i<arr.length;i++){
            int val = map.get(arr[i]);
            if(val>max){
                max=val;
                maxNumber=arr[i];
            }
        }
        return maxNumber;
    }
    
}
