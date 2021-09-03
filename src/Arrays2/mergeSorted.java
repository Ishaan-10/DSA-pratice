package Arrays2;
public class mergeSorted {

    public static int[] sort(int a[],int b[]){

        int c[] = new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){

            if(a[i]>b[j]){
                c[k]=b[j];
                k++;
                j++;
            }else{
                c[k]=a[i];
                k++;
                i++;
            }
        }

       while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
       }
       while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
       }

        return c;
    }
    
    public static void main(String[] args) {
        
        int a[] = {2,3,5,9,12,15,20,100,111,122,133,196,2000};
        int b[] = {1,4,10,11,14,19,21,22,23,24,25};
        int c[]= sort(a, b);
        System.out.println("Array 1 :-");
        for(int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array 2 :-");
        for(int i:b){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Merged array is :-");
        for(int i:c){
            System.out.print(i + " ");
        }
        System.out.println();


    }
}
