package Recursion1;

public class Multiplication {

    public static int multiply(int x , int y){
        if(y==0){
            return 0;
        }
        return x + multiply(x, y-1);
    }
    
    public static void main(String[] args) {
        
        System.out.println(multiply(0,0));

    }
}
