package Recursion2;

public class mergeSort {

    public static int[] sort(int arr[],int start,int end){

        if(start==end){
            int[] ba = new int[1];
            ba[0]=arr[0];
            return ba;
        }

        int mid = (start+end)/2;

        int[] fsh = sort(arr,start,mid);
        int[] ssh = sort(arr,mid+1,end);
        int[] fullArray = merge(fsh,ssh);

        return fullArray;

    }
    
    public static int[] merge(int a[],int b[]){

        int newArr[] = new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){

            if(a[i]>b[j]){
                newArr[k]=b[j];
                j++;
                k++;
            }else{
                newArr[k]=a[i];
                i++;
                k++;
            }
        }

        while(i<a.length){
            newArr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            newArr[k]=b[j];
            j++;
            k++;
        }

        return newArr;
    }

    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};
        int newArr[] = sort(arr, 0, arr.length-1);

        for(int i:newArr){
            System.out.print(i + " ");
        }
        
    }
}
