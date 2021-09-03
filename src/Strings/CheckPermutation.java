

public class CheckPermutation {
    
    public static boolean isPermutation(String str1,String str2){

        if(str1.length() != str2.length()) return false;

        int count1=0,count2=0;
        for(int i=0;i<str1.length();i++){
            count1 += (int)str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            count2 += (int)str2.charAt(i);
        }

        if(count1==count2){
            return true;
        }else{
            return false;
        }


    }
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "ollehh";
        boolean result = isPermutation(str1, str2);
        System.out.println(result);
        
    }
}
