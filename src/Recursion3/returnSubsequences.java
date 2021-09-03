package Recursion3;

public class returnSubsequences {

    public static String[] findSubsequence(String str) {

        if(str.length()==0){
            String ans[] = {""};
            return ans;
        }

        String smallAns[] = findSubsequence(str.substring(1));

        String finalAns[] = new String[2*smallAns.length];
        int i;

        for(i=0;i<smallAns.length;i++){
            finalAns[i]=smallAns[i];
        }

        for(int k=0;k<smallAns.length;k++,i++){
            finalAns[i] = str.charAt(0) + smallAns[k];
        }

        return finalAns;

    }
    

    public static void main(String[] args) {

        String str = "xyz";
        String ans[] = findSubsequence(str);

        for(String i:ans){
            System.out.print(i + " ");
        }

        
    }
}

