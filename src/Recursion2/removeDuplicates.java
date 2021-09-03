package Recursion2;

public class removeDuplicates {
    
    public static String remove(String str,int x){

        if(x==str.length()){
            return new String(" ");
        }
        String smallAns = remove(str,x+1);

        if(str.charAt(x) != smallAns.charAt(0)){
            smallAns = str.charAt(x) + smallAns;
        }

        return smallAns;

    }
    public static void main(String[] args) {
        
        String str = remove("aaaaaaaabbbbbbbbbcccccccc", 0);
        System.out.println(str);

    }
}
