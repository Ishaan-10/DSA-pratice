import java.util.Arrays;

public class arrayIntersection {

    public static void intersect(int a[],int b[]){

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i : a) {
           System.out.print(i + " "); 
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " "); 
         }
         System.out.println();
        int i=0,j=0;

        while(i<a.length && j<b.length){

            if(a[i]==b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]) j++;
            else i++;
        }
        
    }
    
    public static void main(String[] args) {
        
        int arr1[] = { 9 , 2 , 0 , 3 , 7 , 12 , 15 , 7 , 3};
        int arr2[] = { 15 , 6 , 9 , 10 , 18 , 7 , 12 , 2};

        intersect(arr1, arr2);

    }
}
