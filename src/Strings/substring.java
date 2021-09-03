package Strings;

public class substring{

    public static void printSubstring(String str){

        for(int i=1;i<=str.length();i++){

            for(int j=0;j<=str.length()-i;j++){
                int start= j;
                int end = j+i-1;
                System.out.println(str.substring(start,end+1));
            }
        }

    }

    public static void main(String[] args) {

        String str = "Ishaan";
        printSubstring(str);
        

    }
}