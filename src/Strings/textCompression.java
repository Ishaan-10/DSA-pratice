package Strings;

import java.util.Scanner;

public class textCompression{
    
    public static StringBuilder removeDuplicates1(String str){

        StringBuilder sb = new StringBuilder("");
        int i,j;
        for(i=0;i<str.length();i++){
            int charCount=0;
            for(j=i;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)){
                    charCount++;
                }else{
                    break;
                }
            }
            sb.append(str.charAt(i));
            if(charCount !=1){
                sb.append(charCount);
            }
            i=j-1;
        }
        return sb;
    }

    public static StringBuilder removeDuplicates2(String str){

        StringBuilder sb = new StringBuilder("");
        int i,j;
        for(i=0;i<str.length();i++){
            for(j=i;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)){
                    continue;
                }else{
                    break;
                }
            }
            sb.append(str.charAt(i));
            i=j-1;
        }

        return sb;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = sc.nextLine();

        sb1 = removeDuplicates1(str);
        sb2=removeDuplicates2(str);
        System.out.println(sb1 +"\n" + sb2);
        
        
    }
}
