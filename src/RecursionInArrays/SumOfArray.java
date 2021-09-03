package RecursionInArrays;

public class SumOfArray {

    public static int arraySum(int input[]){
        
        if(input.length==1){
            return input[0];
        }
        
        int newArray[] = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            newArray[i-1]=input[i];
        }
        int smallAns = arraySum(newArray);
        
        int finalAns = input[0] + smallAns;
        return finalAns; 


    }
    
    public static void main(String[] args) {
        int arr[] = {1,4,2,9,1,6,5,-3};
        System.out.println(arraySum(arr));
    }
}
