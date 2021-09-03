package Stacks;

import java.util.*;

public class checkRedundantBrackets {

    public static void main(String[] args) {

        String str = "(a+d)+c";
        boolean ans = isRedundant(str);
        System.out.println(ans);

    }

    static boolean isRedundant(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);


            if(c=='(' || c=='+' || c=='-' || c=='/' || c=='*' ){
                stack.push(c);

            }else if(c==')'){

                boolean hasOperator = false;

                while(!stack.empty() &&  stack.peek() != '('){
                    stack.pop();
                    hasOperator=true;
                }

                if(hasOperator==false){
                    return true;
                }
                if(!stack.empty()){
                    stack.pop();
                }
            }

        }
        return false;
    }
}
