package RecursionInArrays;

public class checkNumber {

    public static boolean check(int arr[],int x){

        if(arr[0]==x){
            return true;
        }
        if(arr.length==1){
            return false;
        }

        int newArr[] = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            newArr[i-1]=arr[i];
        }
        boolean isPresent = check(newArr, x);
        
        return isPresent;

    }
    
    public static void main(String[] args) {

        int arr[] = { 1, 2 , 4 , 5 , 2 ,14 ,222 ,21 };
        System.out.println(check(arr,222 ));
        
    }
}
