package Recursion2;

public class removeX {
    
    public static String removex(String str){

        if(str.length()<=1){
            if(str.charAt(0) != 'x'){
                return str;
            }else{
                return "";
            }

        }

        String smallAns = removex(str.substring(1));
        char c = str.charAt(0);
        if(c != 'x'){
            smallAns = c + smallAns;
        }
        return smallAns;
    }

    public static void main(String[] args) {
        String str = "xxxaxxxbxxxcxxx";
        System.out.println(removex(str));
    }
}
