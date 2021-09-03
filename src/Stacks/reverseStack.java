package Stacks;
import java.util.*;
public class reverseStack {
    
    public static void main(String[] args) {

        int arr[]={1,2,4,3,5};
        Stack<Integer> main = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        for(int i:arr){
            main.push(i);
        }
        stackReverse(main, helper);

        while(!main.empty()){
            System.out.print(main.pop() + " ");
        }

        
    }
    
    static void stackReverse(Stack<Integer> main,Stack<Integer> helper){

        if(main.size()<=1){
            return;
        }

        int topElement = main.pop();

        stackReverse(main, helper);

        while(!main.empty()){
            helper.push(main.pop());
        }
        main.push(topElement);

        while(!helper.empty()){
            main.push(helper.pop());
        }


    }
}
