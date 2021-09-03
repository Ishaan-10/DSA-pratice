/* 
2nd sorting algo
In every iteration , the maximum number in the array reaches the end postion



*/

package Arrays2;
public class bubbleSort {
    
    public static void sort(int arr[]){

        for(int i=0;i<arr.length;i++){

            boolean swapped = false;

            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }

            }

        if(swapped==false) break;
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        long start = System.nanoTime();
        sort(arr);
        long end = System.nanoTime();

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Time taken = " + (end-start) + " nano seconds");
        
    }
}
