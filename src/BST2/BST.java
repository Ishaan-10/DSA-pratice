package BST2;

import BinaryTrees.TreeNode;

public class BST<T> {

    private TreeNode<Integer> root; 
    private int size;
    public boolean isPresent(int x){
        return isPresentHelper(root,x);
    }
    private static boolean isPresentHelper(TreeNode<Integer> root, int x) {
        
        if(root==null){
            return false;
        }

        if(root.data==x){
            return true;
        }else if(root.data>x){
            return isPresentHelper(root.left, x);
        }else{
            return isPresentHelper(root.right,x);
        }
    }
    public void insert(int x){
        root=insertHelper(root,x);
        size++;
    }
    private static TreeNode<Integer> insertHelper(TreeNode<Integer> root, int x) {

        if(root==null){
            TreeNode<Integer> newRoot = new TreeNode<Integer>(x);
            return newRoot;
        }
        if(x>=root.data){
            root.right=insertHelper(root.right, x);
        } else{
            root.left = insertHelper(root.left, x);
        }
        return root;
    }
    public boolean deleteData(int x){
        return false;
    }
    // private static TreeNode<Integer> deleteDataHelper(TreeNode<Integer> root, int x) {
        
    //     if(root==null){
    //         return null;
    //     }
        
    //     if(root.data>x){
    //         root.left=deleteDataHelper(root.left, x);
    //     }else if(root.data<x){
    //         root.right = deleteDataHelper(root.right, x);
    //     }else if(root.data==x){

    //         if(root.left==null && root.right==null){
    //             return null;
    //         }else if(root.left==null){
    //             return root.right;
    //         }else if(root.right==null){
    //             return root.left;
    //         }else{

    //         }
    //     }

    // }
    public int size(){
        return size;
    }
    public void printTree(){
         printTreeHelper(root);
    }
    private static void printTreeHelper(TreeNode<Integer> root) {
        
        if (root == null) {
            return;
        }

        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }
}
