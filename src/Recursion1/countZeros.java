package Recursion1;

public class countZeros {
    
    public static int zeros(int x){

        if(x<=10){
            if(x==0){
                return 1;
            }else{
                return 0;
            }
        }

        if(x%10==0){
            return 1 + zeros(x/10);
        }else{
            return zeros(x/10);
        }

    }
    public static void main(String[] args) {
        
        System.out.println(zeros(12));
    }


}
