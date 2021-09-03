package Recursion1;

public class PowerLogarithmic {
    
    public static int power(int x,int n){
       
        if(n==0) return 1;
        
        int half = power(x,n/2);
        int full = half * half;

        if(n % 2 ==1){
            full = full * x;
        }

        return full;
    }
    public static void main(String[] args) {
        
        System.out.println(power(2,10));
    }
}
