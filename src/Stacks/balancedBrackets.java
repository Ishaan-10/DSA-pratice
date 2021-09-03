
package Stacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class balancedBrackets {

    public static void main(String[] args) {

        String str = "((((((((";
        boolean ans = isBalanced(str);
        System.out.println(ans);

    }

    public static boolean isBalanced(String str) {

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char b = str.charAt(i);
            try {

                if (b == '(') {
                    brackets.push(b);
                } else if (b == ')') {

                    if (brackets.peek() == '(') {
                        brackets.pop();
                    } else {
                        return false;
                    }

                }
            } catch (EmptyStackException e) {
                return false;
            }
        }
        return brackets.empty();

    }
}
