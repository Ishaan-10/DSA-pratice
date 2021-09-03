

public class reverseEachWord {



    public static StringBuilder reverse(StringBuilder sb){

        StringBuilder ans = new StringBuilder("");
        int i=0,j=0;
        for(int z=0;z<sb.length();z++){

            if(sb.charAt(j)==' '){
                int start=i;
                int end=j-1;

                for(int k=end;k>=start;k--){

                    ans.append(sb.charAt(k));
                }
                
            ans.append(" ");
            i=j+1;
            }
        j++;
        }

        int start=i;
        int end=j-1;

        for(int k=end;k>=start;k--){

            ans.append(sb.charAt(k));
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("My name is Ishaan");
        System.out.println(reverse(sb));
    }
}
