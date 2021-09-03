package Arrays;


public class PairSumHint {
    
    public static int pairs(int[] arr,int x){
        int count=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(j==1) continue;

                if(arr[i]+arr[j]==x){

                    System.out.println(arr[i] +" "+ arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int arr[] = { 2 , 3 , 4 , 5 , 6 , 7};
        System.out.println(pairs(arr, 7));

    }
}
