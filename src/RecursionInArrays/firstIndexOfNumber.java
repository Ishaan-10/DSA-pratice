package RecursionInArrays;

public class firstIndexOfNumber {

public static int firstIndex(int arr[],int num){
    return firstIndex(arr, num, 0);
}
    
    private static int firstIndex(int arr[],int num,int startIndex){

        if(arr[startIndex]==num){
            return startIndex;
        }
        if(startIndex==arr.length-1){
            return -1;
        }
        return firstIndex(arr, num, startIndex+1);
    }
    public static void main(String[] args) {
        
        int arr[] = { 1 , 5 , 10 , 23 , 82 , 39 , 99 , 101};
        int ans = firstIndex(arr, 101);
        System.out.println(ans);
    }
}
