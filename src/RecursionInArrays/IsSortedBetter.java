package RecursionInArrays;


// Better as a new array is not created every time the function runs.
// Less Space complexity 
public class IsSortedBetter {

    public static boolean isSortedBetter(int arr[],int startIndex){

        if(startIndex==arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }

        boolean isSmallSorted = isSortedBetter(arr, startIndex+1);
        return isSmallSorted;


    }
    public static void main(String[] args) {

        int arr[]= { 5 , 2 ,4, 1 , 4 , 5};
        System.out.println(isSortedBetter(arr, 0));
        
    }
}
