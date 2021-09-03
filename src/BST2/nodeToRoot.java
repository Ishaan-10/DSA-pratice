package BST2;
import java.util.*;
import BinaryTrees.TreeNode;

public class nodeToRoot {


    public static ArrayList<Integer> nodeToRootPath(TreeNode<Integer> root,int x){

        if(root==null){
            return null;
        }

        if(root.data==x){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> left = nodeToRootPath(root.left, x);
        if(left !=null){
            left.add(root.data);
            return left;
        }
        ArrayList<Integer> right = nodeToRootPath(root.right, x);
        if(right !=null){
            right.add(root.data);
            return right;
        }

        return null;

    }

    public static ArrayList<Integer> nodeToArrayPathBST(TreeNode<Integer> root,int x){

        if(root==null){
            return null;
        }
        if(root.data==x){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(root.data);
            return list;
        }

        if(root.data>x){
            ArrayList<Integer> left = nodeToArrayPathBST(root.left, x);
            if(left!=null){
                left.add(root.data);
                return left;
            }
        }else if(root.data<=x){
            ArrayList<Integer> right = nodeToArrayPathBST(root.right, x);
            if(right!=null){
                right.add(root.data);
                return right;
            }
        }

        return null;

    }

    public static void main(String[] args) {
         
        TreeNode<Integer> root = TreeNode.inputBetter(true,0,false);
        System.out.println(nodeToArrayPathBST(root, 2));
        
        
    }
}
