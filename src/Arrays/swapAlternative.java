package Arrays;

import java.util.Scanner;

public class swapAlternative {

    public static void arraySwap(int arr[]){
        
        for(int i=0;i<arr.length-1;i+=2){
            int j=i+1;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }

        arraySwap(arr);

        for(int i:arr){
            System.out.println(i);
        }
    }
}
