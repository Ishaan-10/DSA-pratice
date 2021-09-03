package Recursion2;

public class replaceCharacter {
    

    public static String replaceChar(String str , char a , char b,int x){

        if(str.length()==x){
            return new String();
        }

        String smallAns = replaceChar(str, a, b,x+1);
        char c;
        if(str.charAt(x)==a){
            c=b;
        }else{
            c=str.charAt(x);
        }
        smallAns = c + smallAns;    
        return smallAns;

    }
    public static void main(String[] args) {
        
        String str = "yes you are right";
        System.out.println(str + " " + str.length());
        String rs  = replaceChar(str, 'y', 'x', 0);
        System.out.println(rs + " " + rs.length());
    }
}
