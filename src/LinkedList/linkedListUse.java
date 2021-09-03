package LinkedList;

import java.util.*;


public class linkedListUse {

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        return n1;
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void increment(Node<Integer> head){
        head.data++;
    }

    public static void printAt(Node <Integer> head,int pos){

        for(int i=0;i<pos;i++){

            if(head==null){
                return;
            }
            head=head.next;
        }
        System.out.println(head.data);
    }

    public static Node<Integer> takeInput(){

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head=null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);

            if(head==null){
                head=currentNode;
            }else{
                Node<Integer> tail = head;

                while(tail.next != null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }

            data = sc.nextInt();
        }
    sc.close();
    return head;
    }

    public static int findNodeIndex(Node <Integer> head,int x){

        Node<Integer> temp = head;
        int currPos=0;

        while( temp != null){
            
            if(temp.data==x) return currPos;
            currPos++;
            temp=temp.next;
        }
        return -1;
    }

    public static Node<Integer> appendLastNtoStart(Node<Integer> head,int n){

        // 1,2,3,4,5 
        // n=3
        // 3,4,5-1,2,


        Node<Integer> temp1 = head;
        Node<Integer> temp2 = head;
        Node<Integer> temp3 = null;

        int size=0;
        while(temp1 != null){
            size++;
            temp1=temp1.next;
        }
        n=n%size;

        if(n==0){
            return head;
        }
        temp1=head;

        for(int i=0;i<size-n-1;i++){
            temp1=temp1.next;
        }

        temp2=temp1.next;
        temp3=temp2;
        temp1.next=null;

        while(temp3.next != null){
            temp3=temp3.next;
        }
        temp3.next=head;
        return temp2;

    }

    public static void removeDuplicates(Node <Integer> head){

        if(head==null){
            return;
        }

        Node<Integer> temp1 = head;
        Node<Integer> temp2 = head.next;

        while(temp2 !=null){

            if(temp1.data==temp2.data){
                temp1.next = temp2.next;
                temp2=temp1.next;
                System.out.println("was duplicate");
            }else{
                temp1=temp1.next;
                temp2=temp2.next;
                System.out.println();
            }
        }

    }

    public static void printReverseLinkedList(Node<Integer> head ){

        if(head==null){
            return;
        }
        printReverseLinkedList(head.next);
        System.out.print(head.data + " ");
    }

    public static Node<Integer> reverseLinkedList(Node<Integer> head){

        Node<Integer> curr = head;
        Node<Integer> fwd = null;
        Node<Integer> prev = null;

        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }

        return prev;

    }
    
    public static boolean isPalindrome(Node<Integer> head){

        if(head == null || head.next == null){
            return true;
        }

        Node<Integer> slowPtr = head;
        Node<Integer> fastPtr = head;
        Node<Integer> midNode = null;
        Node<Integer> prev = null;

        // 1 2 3 4 5 

        // 1 2 3 4 5 6

        while(fastPtr != null && fastPtr.next !=null){
            fastPtr = fastPtr.next.next;
            prev=slowPtr;
            slowPtr = slowPtr.next;
        }
        
        if(fastPtr != null){
            midNode= slowPtr;
            prev=slowPtr;
            slowPtr = slowPtr.next;
        }
        prev.next=null;

        print(head);
        slowPtr = reverseLinkedList(slowPtr);
        print(slowPtr);

        boolean ans = compareLinkedLists(head,slowPtr);


        return ans;
    }
    private static boolean compareLinkedLists(Node<Integer> head, Node<Integer> slowPtr) {

        boolean ans=true;
        while(head != null && slowPtr != null){
            if(!(head.data==slowPtr.data)){
                return false;
            }
            head = head.next;
            slowPtr = slowPtr.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        

        Node<Integer> head1=takeInput();
        print(head1);
        Node<Integer> head2=takeInput();
        print(head2);

    }

    // LinkedList part 2 

    public static Node<Integer> insertNodeRecursively(Node<Integer> head,int pos,int num){

        if(head == null){
            return head;
        }
        if(pos==0){
            Node<Integer> updatedHead= new Node<>(num);
            updatedHead.next=head;
            return updatedHead;
        }else{
            Node<Integer> newHead = insertNodeRecursively(head.next, pos-1, num);
            head.next=newHead;
            return head;
        }


    }

    public static Node<Integer> deleteNodeRecursively(Node<Integer> head,int pos){

        if(head==null){
            return head;
        }

        if(pos==0){
            head=head.next;
            return head;
        }else{
            Node<Integer> updatedHead = deleteNodeRecursively(head.next, pos-1);
            head.next=updatedHead;
            return head;
        }

    }

    public static Node<Integer> reverseLinkedListRecursively(Node <Integer> head){

        if(head==null || head.next==null){
            return head;
        }

        // 1>2>3>4>5

        // 1>2<3<4<5

        Node<Integer> reversedList = reverseLinkedList(head.next);

        head.next.next=head;
        head.next=null;
        return reversedList;
    }

    public static Node<Integer> midNode(Node<Integer> head){


        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> slowPtr = head;
        Node<Integer> fastPtr = head.next;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }

        return slowPtr;
    }

    public static Node<Integer> mergeSortedLinkedLists(Node<Integer> head1,Node<Integer> head2){

        if(head1==null && head2==null){
            return head1;
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node<Integer> newHead = null;
        Node<Integer> temp = null;

        while(head1 !=null && head2 !=null){

            if(head1.data > head2.data){

                if(newHead==null){
                    newHead= head2;
                    temp=newHead;
                }
                temp.next= head2;
                temp=temp.next;
                head2=head2.next;

            }else{
                if(newHead==null){
                    newHead= head1;
                    temp=newHead;
                }
                temp.next= head1;
                temp=temp.next;
                head1=head1.next;
                
            }

        }
    return newHead;

    }

    public static Node<Integer> mergeSortLinkedList(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> mid = midNode(head);
        Node<Integer> head2 = mid.next;
        mid.next=null;

        head = mergeSortLinkedList(head);
        head2 = mergeSortLinkedList(head2);
        Node<Integer> ans = mergeSortedLinkedLists(head, head2);

        return ans;

    }
}



