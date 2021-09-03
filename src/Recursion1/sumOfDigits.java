package Recursion1;

public class sumOfDigits {

    public static int sum(int x){
        if(x==0){
            return 0;
        }
        return x%10 + sum(x/10);
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
