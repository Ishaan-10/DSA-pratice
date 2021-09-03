package BST;
import java.util.LinkedList;

import BinaryTrees.TreeNode;

public class searchBST{

    public static boolean searchNode(TreeNode<Integer> root,int x){

        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }else if(x>root.left.data){
          return searchNode(root.right, x);
        }else{
            return searchNode(root.left, x);
        }

    } 

    private static void BSTtoLLHelper(TreeNode<Integer> root,LinkedList<Integer> list){
        if(root==null){
            return;
        }

        BSTtoLLHelper(root.left, list);
        list.add(root.data);
        BSTtoLLHelper(root.right, list);
    }

    public static LinkedList<Integer> BSTtoLL(TreeNode<Integer> root){
        LinkedList<Integer> list = new LinkedList<>();
        BSTtoLLHelper(root,list);
        return list;
    }

    public static void main(String[] args) {
        
        TreeNode<Integer> root = TreeNode.inputBetter(true,0, false);
        System.out.println(searchBST.BSTtoLL(root));
    }
    
}