package Recursion1;

public class geometricSum {

    public static double sum(int x){

        if(x==0){
            return 1;
        }
        
        double answer = (1/Math.pow(2, x)) + sum(x-1); 

        return answer;
    }
    
    public static void main(String[] args) {
        
        System.out.println(sum(4));

    }
}
