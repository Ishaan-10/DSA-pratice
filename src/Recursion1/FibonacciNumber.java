package Recursion1;

public class FibonacciNumber {
    
    public static int fib(int n){

        if(n==0 || n==1){
            return n;
        }

        int ans = fib(n-1) + fib(n-2);
        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println(fib(10));
    }
}
