package Arrays2;

public class FindSecondLargest {
    
    public static int secondLargest(int arr[]){

        int max=Integer.MIN_VALUE, smax= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                int temp=max;
                max=arr[i];
                smax=temp;
            }
        }

        return smax;
    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7,8,10};
        System.out.println(secondLargest(arr));
    }
}
