package Stacks;

import LinkedList.Node;

public class LinkedListStack<T> {
    
    private Node<T> head;
    private int size;

    LinkedListStack(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void push(T elem){

        if(head==null){
            head.data=elem;
        }else{
            Node<T> newNode = new Node<>(elem);
            newNode.next = head;
            head = newNode;
        }
        size++;

    }
    public T top(){
        return head.data;
    }
    public T pop(){
        T temp = head.data;
        head=head.next;
        size--;
        return temp;

    }
}
