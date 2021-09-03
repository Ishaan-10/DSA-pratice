package Recursion1;

public class checkPalindrome {
    
    public static void main(String[] args) {
        String str = "niceecin";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }

    public static boolean isPalindrome(String str , int startIndex , int endIndex){

        if(startIndex>endIndex){
            return true;
        }
        if(str.charAt(startIndex) != str.charAt(endIndex)){
            return false;
        }

        return isPalindrome(str, startIndex+1, endIndex-1);
    }
}
