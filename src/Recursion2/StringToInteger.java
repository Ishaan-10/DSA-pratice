package Recursion2;

public class StringToInteger {
    
    public static int stringToInt(String str){

        if(str.length()==1){
            return str.charAt(0)-'0';
        }

        int smallAns = stringToInt(str.substring(1));

        int digit = str.charAt(0) - '0';
        return   digit*(int)Math.pow(10, str.length()-1) + smallAns; 

    }
    public static void main(String[] args) {
        String str="12345";
        int x = stringToInt(str);
        System.out.println(x);
    }
}
