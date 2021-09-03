package Stacks;

import java.util.Stack;

public class minBracketReversal {

    public static void main(String[] args) {

        String str = "{{{{";
        System.out.println(reverseBrackets(str));

    }

    static int reverseBrackets(String str) {

        if (str.length() == 0) {
            return 0;
        }
        if (str.length() % 2 != 0) {
            return -1;
        }

        char opening = '{';
        char closing = '}';

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == opening) {
                stk.push(opening);

            } else if (str.charAt(i) == closing) {

                if (!stk.empty() && stk.peek() == opening) {
                    stk.pop();
                } else {
                    stk.push(closing);
                }
            }
        }

        int count=0;
        while (!stk.empty()) {

            char c1 = stk.pop();
            char c2 = stk.pop();

            if(c1==c2) count++;
            else count+=2;
        }

        return count;

    }

}
