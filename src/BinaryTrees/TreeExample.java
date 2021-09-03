package BinaryTrees;

public class TreeExample {

    public static void main(String[] args) {

        TreeNode<Integer> root = TreeNode.inputBetter(true, 0, false);
        TreeNode.levelOrderTreversal(root);
    }

}