package BST2;

import BinaryTrees.TreeNode;

public class maxBstHeight {
    /*
            10
         7     13
       5  12   11  15  
    
    */
    
    public static void main(String[] args) {

        TreeNode<Integer> root = TreeNode.inputBetter(true, 0, false);
        System.out.println(maxBST(root));
        
    }
    public static int maxBST(TreeNode<Integer> root){
        MaxBstClass x = maxBstHelper(root);
        return x.height;
    }

    private static MaxBstClass maxBstHelper(TreeNode<Integer> root){

        if(root==null){
            return new MaxBstClass(Integer.MIN_VALUE, Integer.MAX_VALUE,0, true);
        }

        MaxBstClass leftSide = maxBstHelper(root.left);
        MaxBstClass rightSide = maxBstHelper(root.right);


        if(rightSide.isBST && rightSide.min<root.data){
            rightSide.isBST=false;
        }
        if(leftSide.isBST && leftSide.max > root.data){
            leftSide.isBST=false;
        }
        if(!leftSide.isBST || !rightSide.isBST){

            if(leftSide.height>rightSide.height){
                leftSide.isBST=false;
                return leftSide;
            }else{
                rightSide.isBST=false;
                return rightSide;
            }
        }
        int max = Math.max(leftSide.max, Math.max(rightSide.max, root.data));
        int min = Math.min(leftSide.min, Math.min(rightSide.min, root.data));
        int height = Math.max(leftSide.height, rightSide.height)+1;

        return new MaxBstClass(max, min ,height , true);

    }
}
