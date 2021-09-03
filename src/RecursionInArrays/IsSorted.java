package RecursionInArrays;

public class IsSorted {
    
    public static boolean isSorted(int input[]){

        if(input.length==1){
            return true;
        }

        int smallArr[] = new int[input.length-1];

        for(int i=1;i<input.length;i++){
            smallArr[i-1]=input[i];
        }

        boolean isSmallSorted = isSorted(smallArr);
        if(isSmallSorted==false){
            return false;
        }
        
        if(input[0]<input[1]){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        int arr[] = {5,1,2,3,4};
        System.out.println(isSorted(arr));
        

    }
}
