package Stacks;

public class ArrayStack{

    private int data[];
    private int topIndex;

    ArrayStack(){
        data = new int[10];
        topIndex=-1;
    }
    ArrayStack(int n){
        data = new int[n];
        topIndex=-1;
    }
    public void push(int elem){

        if(topIndex==data.length-1){
            doubleCapacity();
        }

        data[topIndex+1]=elem;
        topIndex++;

    }
    private void doubleCapacity() {

        int temp[] = new int[2*data.length];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public void pop() throws stackEmptyException{

        if(topIndex==-1){
            doubleCapacity();
        }

        data[topIndex]=0;
        topIndex--;

    }
    public int top() throws stackEmptyException{
        
        if(topIndex==-1){
            throw new stackEmptyException();
        }
        return data[topIndex];
    }
    public boolean isEmpty(){

        if(topIndex>-1){
            return false;
        }else{
            return true;
        }
    }
    public int size(){
        return topIndex+1;
    }
}