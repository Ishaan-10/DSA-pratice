package Strings;


public class reverseWordWise{

    public static StringBuilder reverse(StringBuilder sb){

        StringBuilder ans = new StringBuilder("");
        int len = sb.length();
        int i,j=len-1;
        for(i=len-1;i>=0;i--){
            
            if(sb.charAt(i)==' '){
                int start=i+1;
                int end=j+1;
                ans.append(sb.substring(start, end));
                ans.append(" ");
                j=i-1;
            }
        }

        int start=i+1;
        int end=j+1;
        ans.append(sb.substring(start, end));
        return ans;

    }

    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("What is your name dear?");
        System.out.println(reverse(a));

    }
}