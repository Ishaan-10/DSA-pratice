package Recursion3;

public class returnKeypad {
    
    public static String[] keypadPossible(int a){

        if(a==0){
            String smallAns[] = {""};
            return smallAns;
        }
        String smallAns[] = keypadPossible(a/10);
        int lastDigit = a%10;
        String arr[] = getChars(lastDigit);

        String finalAns[]=new String[smallAns.length*arr.length];

        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<smallAns.length;j++){
                finalAns[k]= arr[i] + smallAns[j];
                k++;
            }
        }
        return finalAns;
    }

    public static String[] getChars(int n){

        String arr[][] = {
            {".",","},
            {"a","b","c"},
            {"d","e","f"},
            {"g","h","i"},
            {"j","k","l"},
            {"m","n","o"},
            {"p","q","r","s"},
            {"t","u"},
            {"v","w","x"},
            {"y","z"}
        };

        return arr[n];
    }

    public static void main(String[] args) {
        
        int x = 23;
        String ans[]=keypadPossible(x);
        for (String string : ans) {
            System.out.print(string + " ");
        }
    }
}
