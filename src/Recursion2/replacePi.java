package Recursion2;

public class replacePi {
    
    public static String replacepi(String str){

        String output;
        if(str.length()<=1){
            return str;
        }
        String small = replacepi(str.substring(1));

        if(str.charAt(0)=='p' && small.charAt(0)=='i'){
            output = "3.14" + small.substring(1);
        }else{
            output = str.charAt(0) + small;
        }

        return output;
    }
    public static void main(String[] args) {

        System.out.println(replacepi("piipi"));
        
    }
}
