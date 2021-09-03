package Arrays;

import java.util.Scanner;

public class findUnique {

    public static int unique(int arr[]){
        int ans=-1;

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(count>1) break;
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                ans=arr[i];
                return ans;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }

       System.out.println(unique(arr));
        
    }
}
