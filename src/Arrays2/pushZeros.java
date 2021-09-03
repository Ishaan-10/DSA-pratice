package Arrays2;

public class pushZeros {

    public static void zeros(int arr[]){
        int i=0,j=0;
        while(i <arr.length){

            if(arr[i] != 0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            j++;
            }
            i++;
            
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = { 1 , 0 , 0 , 0 , 5,4,9,0,2,0,0,8};
        zeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
