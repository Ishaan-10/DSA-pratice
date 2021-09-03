package Arrays2;
public class binarySearch{

    public static int search(int arr[],int a){

        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>a){
                end=mid-1;
            }else if(arr[mid]<a){
                start = mid+1;
            }else{
                return mid;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = { 1,2,3,4,5,6,7,8,9,20};
        System.out.println(search(arr, 8));
    }
}