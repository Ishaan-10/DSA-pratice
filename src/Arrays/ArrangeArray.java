package Arrays;

import java.util.Scanner;

public class ArrangeArray{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        int j=n-1;
        int i=0;
        int num=1;

        while(i<=j){
            
            arr[i]=num;
            num++;
            arr[j]=num;
            num++;
            i++;
            j--;
        }
        for(int z:arr){
            System.out.println(z);
        }
        System.out.println(arr);

        

    }
}