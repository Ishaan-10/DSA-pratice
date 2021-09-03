import java.util.Scanner;

public class EquilibruimIndex {
    
    public static int equilibruimIndex(int arr[]){
        int leftSum=0,rightSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){

            rightSum-=arr[i];

            if(leftSum==rightSum) return i;

            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int result =equilibruimIndex(arr);
        System.out.println(result);
    }
}
