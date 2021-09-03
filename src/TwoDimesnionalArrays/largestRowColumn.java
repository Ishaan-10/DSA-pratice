package TwoDimesnionalArrays;

public class largestRowColumn {

    public static void largestRowOrColumn(int arr[][]){

        int maxRow=0 , maxRowSum=Integer.MIN_VALUE , maxColumn=0 , maxColumnSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>maxRowSum){
                maxRowSum= sum;
                maxRow=i;
            }
        }

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[j][i];
            }
            if(sum>maxRowSum){
                maxColumnSum= sum;
                maxColumn=i;
            }
        }

        if(maxRowSum>maxColumnSum){
            System.out.println("Row " + maxRow + " " + maxRowSum);
        }else{
            System.out.println("Column " + maxColumn + " " + maxColumnSum);
        }
    }
    
    public static void main(String[] args) {

        int arr[][]= {
            {1,1,1},
            {1,1,1},
            {1,1,1}
        };
        largestRowOrColumn(arr);

    }
}
