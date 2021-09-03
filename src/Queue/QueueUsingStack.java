package Queue;


public class QueueUsingStack{

    private int data[];
    private int front , rear;
    private int size;

    public QueueUsingStack(){
        data = new int[10];
        front =-1;
        rear=-1;
        size=0;
    }

    public void enqueue(int elem){

        if(front==-1) front++;
        data[rear+1]=elem;
        rear++;
        size++;
    }
    public int front() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }
    public int rear(){
        return data[rear];
    }
    public int dequeue() throws QueueEmptyException{

        if(size==0){
            throw new QueueEmptyException();
        }

        size--;
        return front++;
        
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

}