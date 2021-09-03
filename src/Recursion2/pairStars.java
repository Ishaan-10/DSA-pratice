package Recursion2;

public class pairStars {
    

    public static String pairStar(String str){

        if(str.length()==1){
            return str.substring(0);
        }
        String smallAns=pairStar(str.substring(1));
        char c1 = str.charAt(0);
        char c2 = smallAns.charAt(0);

        if(c1==c2){
            smallAns = "*" + smallAns;
        }
        smallAns= c1 + smallAns;
        return smallAns;
    } 

    public static void main(String[] args) {
        
        String str = "aaaa";
        System.out.println(pairStar(str));

    }
}
