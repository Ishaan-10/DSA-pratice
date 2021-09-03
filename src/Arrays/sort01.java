package Arrays;


public class sort01 {
    
    public static void sortZeroOne(int arr[]){

        int zero=0;
        for(int curr=0;curr<arr.length;curr++){
            if(arr[curr]==0){
                int temp = arr[curr];
                arr[curr]=arr[zero];
                arr[zero]=temp;
                zero++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1};
        sortZeroOne(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
