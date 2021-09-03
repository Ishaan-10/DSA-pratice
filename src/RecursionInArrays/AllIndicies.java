package RecursionInArrays;

public class AllIndicies {
    
    public static int[] findIndicies(int arr[],int num,int index){

        if(arr.length==index){
            int output[] = new int[0];
            return output;
        }

        int smallOutput[] = findIndicies(arr, num, index+1);

        if(arr[index]==num){
            int output[] = new int[smallOutput.length + 1];
            output[0]=index;

            for(int i=1;i<output.length;i++){
                output[i]=smallOutput[i-1];
            }
            return output;
        }else{
            return smallOutput;
        }

    }

    public static void main(String[] args) {
        
        int arr[] = { 1 , 22 , 23 , 13 , 22 , 19 , 3};
        int ans[] = findIndicies(arr, 22, 0);

        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}
