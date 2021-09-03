package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class reveseQueue {
    
    public static void main(String[] args) {
        
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        reverseQueue(q);

        System.out.println(q);

    }

    public static void reverseQueue(Queue<Integer> q){

        if(q.size()==0){
            return;
        }

        int front = q.poll();
        reverseQueue(q);
        q.add(front);
    }
}
