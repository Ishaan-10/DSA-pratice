package Recursion1;

public class NumberOfDigits {
    
    public static int digits(int n){
        if(n==0) return 0;
        int ans = 1 + digits(n/10);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(digits(123));
    }
}
