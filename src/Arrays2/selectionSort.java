/*
    First sorting algorthim 
    Iterates over and selects the minimum , and then assigns place
    o(n^2);
*/
package Arrays2;
public class selectionSort {
    
    public static void sort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int min=arr[i];

            for(int j=i;j<arr.length;j++){

                if(arr[j]<min){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    min=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        long start = System.nanoTime();
        sort(arr);
        long end = System.nanoTime();

        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Time taken = " + (end-start) + " nano seconds");
    }
}
