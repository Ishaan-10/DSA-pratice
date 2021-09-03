package Arrays2;

public class rotateArray {
    
    public static void reverse(int arr[],int i , int j){
        while(i<j){

            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void shift(int arr[],int s){

        s=s%arr.length;
        if(s<0){
            s+=arr.length;
        }

        reverse(arr, arr.length-s, arr.length-1);

        reverse(arr, 0, arr.length-s-1);

        reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {

        int arr[] = { 2 , 5 , 4 , 3 , 5 , 3 , 2 ,1};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        shift(arr, 2);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
