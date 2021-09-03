package BST2;

import java.util.*;

import BinaryTrees.TreeNode;

public class levelWiseLinkedList {
    
    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNode.inputBetter(true, 0, false);
        ArrayList<LinkedList<Integer>> ll = TreeToLL(root);
        System.out.println(ll);
        
    }
    
    public static ArrayList<LinkedList<Integer>> TreeToLL(TreeNode<Integer> root){

        if(root==null){
            return new ArrayList<LinkedList<Integer>>();
        }

        ArrayList<LinkedList<Integer>> list = new ArrayList<>();
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        LinkedList<Integer> LL = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            TreeNode<Integer> node = q.poll();
            if(node==null){
                System.out.println();
                list.add(LL);
                LL = new LinkedList<>();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                System.out.print(node.data + " ");
                LL.add(node.data);

                if(node.left !=null){
                    q.add(node.left);
                }
                if(node.right !=null){
                    q.add(node.right);
                }
            }
        }

        return list;

    }
}
