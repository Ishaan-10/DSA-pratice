package Stacks;

import java.util.*;


public class stockSpan {
    
    public static void main(String[] args) {
        int arr[]={60 ,70 , 80 , 100 ,90 ,75 ,80 ,120};
        int span[]=stockSpan(arr);

        for(int i:span){
            System.out.print(i + " ");
        }
    }



    static int[] stockSpan(int prizes[]) {

        int span[] = new int[prizes.length];
        Stack<Integer> indices = new Stack<>();
        span[0]=1;
        indices.push(0);

        for(int i=1;i<prizes.length;i++){

            while(!indices.empty() && prizes[indices.peek()] < prizes[i]){
                indices.pop();
            }

            if(indices.empty()){
                span[i]= i+1;
            }else{
                span[i]= i - indices.peek();
            }

            indices.push(i);
        }
    return span;
    }
}
