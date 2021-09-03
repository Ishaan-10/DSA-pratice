package Hashmaps;

import java.util.*;

public class PairSumToZero{

    public static int printPairSumCount(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int pairSumCount=0;

        for(int i=0;i<arr.length;i++){
            int key =arr[i];
            int val;
            
            if(map.containsKey(key) && map.containsKey(-key)){

                if(key==(-key)){
                    int occurances = map.get(key);
                    val = (occurances * (occurances-1))/2;
                    pairSumCount+=val;
                    map.put(0,0);
                }else{
                    val=map.get(key) * map.get(-key);
                    pairSumCount+=val;
                    map.put(key,0);
                    map.put(-key, 0);
                }
            }


        }
        return pairSumCount;

    }

    public static void main(String args[]){

        int arr[]={2,1,-2,2,3};
        System.out.println(printPairSumCount(arr)); 
    }
}