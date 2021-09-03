package Stacks;

public class stackUse {
    
    public static void main(String[] args) throws Exception {
        
        ArrayStack obj = new ArrayStack();
        obj.push(10);

        for(int i=0;i<20;i++){
            obj.push(i);
        }
        System.out.println(obj.top());
    }
}
