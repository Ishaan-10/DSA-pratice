package BinaryTrees;

import java.util.*;

public class TreeNode<T> {

    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T data) {
        this.data = data;
    }

    public static <T> void printDetailed(TreeNode<T> root) {

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
        printDetailed(root.left);
        printDetailed(root.right);

    }

    public static TreeNode<Integer> input() {

        System.out.println("Enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }
        TreeNode<Integer> root = new TreeNode<>(rootData);
        TreeNode<Integer> leftSide = input();
        TreeNode<Integer> rightSide = input();
        root.left = leftSide;
        root.right = rightSide;

        return root;
    }

    public static TreeNode<Integer> inputBetter(boolean isRoot, int Parentdata, boolean isLeft) {

        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            System.out.print("Enter ");
            if (isLeft)
                System.out.print("left child");
            else
                System.out.print("right child");
            System.out.print(" of " + Parentdata);
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }
        TreeNode<Integer> root = new TreeNode<>(rootData);
        TreeNode<Integer> leftSide = inputBetter(false, rootData, true);
        TreeNode<Integer> rightSide = inputBetter(false, rootData, false);
        root.left = leftSide;
        root.right = rightSide;

        return root;
    }

    public static int numNodes(TreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }
        int left = numNodes(root.left);
        int right = numNodes(root.right);
        return 1 + left + right;
    }

    public static int nodeSum(TreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }

        int leftSum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);

        return (root.data + leftSum + rightSum);
    }

    public static void printPreOrder(TreeNode<Integer> root) {

        if (root == null)
            return;
        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);

    }

    public static void printPostOrder(TreeNode<Integer> root) {

        if (root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.data);

    }

    public static void printInOrder(TreeNode<Integer> root) {

        if (root == null)
            return;

        printInOrder(root.left);
        System.out.println(root.data);
        printInOrder(root.right);
    }

    static int largestNode(TreeNode<Integer> root) {

        if (root == null)
            return -1;

        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    static int nodesLargerThan(TreeNode<Integer> root, int x) {

        if (root == null)
            return 0;
        int leftSide = nodesLargerThan(root.left, x);
        int rightSide = nodesLargerThan(root.right, x);

        if (root.data > x) {
            return 1 + leftSide + rightSide;
        } else {
            return leftSide + rightSide;
        }

    }

    static int heightOfTree(TreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    static int leafCount(TreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }
        int leftCount = leafCount(root.left);
        int rightCount = leafCount(root.right);

        if (root.left == null && root.right == null) {
            return leftCount + rightCount + 1;
        } else {
            return leftCount + rightCount;
        }

    }

    static void printAtDepth(TreeNode<Integer> root, int k) {

        if (root == null) {
            return;
        }

        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        printAtDepth(root.left, k - 1);
        printAtDepth(root.right, k - 1);
    }

    private static void replaceByDepthHelper(TreeNode<Integer> root, int k) {

        if (root == null)
            return;

        root.data = k;
        replaceByDepthHelper(root.left, k + 1);
        replaceByDepthHelper(root.right, k + 1);

    }

    public static void replaceByDepth(TreeNode<Integer> root) {
        replaceByDepthHelper(root, 0);
    }

    public static boolean isNodePresent(TreeNode<Integer> root, int x) {

        if (root == null)
            return false;

        boolean ansLeft = isNodePresent(root.left, x);
        boolean ansRight = isNodePresent(root.right, x);

        if (ansLeft || ansRight) {
            return true;
        } else {

            if (root.data == x)
                return true;
            else
                return false;
        }

    }

    public static void printNodesWithoutSiblings(TreeNode<Integer> root) {

        if (root == null) {
            return;
        }
        boolean isLeft = root.left == null ? false : true;
        boolean isRight = root.right == null ? false : true;

        if (!(isLeft && isRight)) {
            if (isLeft)
                System.out.println(root.left.data);
            if (isRight)
                System.out.println(root.right.data);
        }

        printNodesWithoutSiblings(root.left);
        printNodesWithoutSiblings(root.right);

    }

    public static TreeNode<Integer> removeLeaves(TreeNode<Integer> root) {

        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);

        return root;
    }

    public static void mirrorTree(TreeNode<Integer> root) {

        if (root == null) {
            return;
        }

        TreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);

    }

    public static boolean isBalanced(TreeNode<Integer> root) {

        if (root == null) {
            return true;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        } else {

            boolean isLeftBalanced = isBalanced(root.left);
            boolean isRightBalanced = isBalanced(root.right);

            return isLeftBalanced && isRightBalanced;
        }
    }

    public static balanceNodeClass isBalancedBetter(TreeNode<Integer> root) {

        if (root == null) {
            return new balanceNodeClass(0, true);
        }

        balanceNodeClass left = isBalancedBetter(root.left);
        balanceNodeClass right = isBalancedBetter(root.right);
        boolean ans = true;

        if (!(left.isBalanced && right.isBalanced)) {
            ans = false;
        }
        if (Math.abs(left.height - right.height) > 1) {
            ans = false;
        }
        int height = 1 + Math.max(left.height, right.height);

        return new balanceNodeClass(height, ans);
    }

    private static Pair treeDiameterHelper(TreeNode<Integer> root) {

        if (root == null) {
            return new Pair(0, 0);
        }

        Pair leftTree = treeDiameterHelper(root.left);
        Pair rightTree = treeDiameterHelper(root.right);

        int dist = leftTree.height + rightTree.height + 1;
        int diameter = Math.max(dist, Math.max(leftTree.diameter, rightTree.diameter));
        int height = Math.min(leftTree.height, rightTree.height) + 1;

        return new Pair(height, diameter);

    }

    public static int treeDiameter(TreeNode<Integer> root) {

        Pair ans = treeDiameterHelper(root);
        return ans.diameter;
    }

    public static TreeNode<Integer> inputLevelWise() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if (rootData == -1)
            return null;

        TreeNode<Integer> root = new TreeNode<>(rootData);
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode<Integer> front = q.poll();

            System.out.println("Enter left child of " + front.data);
            int left = sc.nextInt();
            if (left != -1) {
                TreeNode<Integer> leftchild = new TreeNode<>(left);
                front.left = leftchild;
                q.add(leftchild);
            }

            System.out.println("Enter right child of " + front.data);
            int right = sc.nextInt();
            if (right != -1) {
                TreeNode<Integer> rightchild = new TreeNode<>(right);
                front.right = rightchild;
                q.add(rightchild);
            }
        }

        return root;

    }

    public static void printLevelWise(TreeNode<Integer> root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode<Integer> node = q.poll();

            System.out.print(node.data + ":");
            if (node.left != null) {
                System.out.print("L" + node.left.data + ",");
            }
            if (node.right != null) {
                System.out.print("R" + node.right.data);
            }
            System.out.println();

            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);

        }

    }



    public static TreeNode<Integer> buildTreeFromPreIn(int pre[],int in[]){

        TreeNode<Integer> root=buildTreeFromPreInHelper(pre, in, 0, pre.length-1, 0, in.length-1);
        return root;
        
    }
    private static TreeNode<Integer> buildTreeFromPreInHelper(int pre[],int in[],int sPre,int ePre,int sIn,int eIn){

        if(sPre>ePre){
            return null;
        }
        int rootData = pre[sPre];
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);

        int rootIndex=-1;
        for(int i=sIn;i<=eIn;i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }


        int sPreLeft= sPre+1;
        int sInLeft = sIn;
        int eInLeft = rootIndex-1;



        int sInRight = rootIndex+1;
        int ePreRight =ePre;
        int eInRight =eIn;

        int lengthOfLeftTree = eInLeft - sInLeft + 1;

 
        int ePreLeft = sPreLeft + lengthOfLeftTree-1;
        int sPreRight = ePreLeft + 1;


        root.left = buildTreeFromPreInHelper(pre, in, sPreLeft, ePreLeft, sInLeft, eInLeft);
        root.right = buildTreeFromPreInHelper(pre, in, sPreRight, ePreRight, sInRight, eInRight);

        return root;
    }

    public static TreeNode<Integer> duplicate(TreeNode<Integer> root){

        if(root==null){
            return null;
        }
        TreeNode<Integer> left = duplicate(root.left);
        TreeNode<Integer> right = duplicate(root.right);
        TreeNode<Integer> duplicate = new TreeNode<Integer>(root.data);

        duplicate.left=left;
        root.left=duplicate;
        root.right=right;

        return root;
    }
    public static minMax MinMax(TreeNode<Integer> root){

        if(root==null){
            return new minMax(Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        minMax leftSide = MinMax(root.left);
        minMax rightSide = MinMax(root.right);

        int min = Math.min(leftSide.min, Math.min(rightSide.min, root.data));
        int max = Math.max(leftSide.max, Math.max(rightSide.max, root.data));

        return new minMax(min, max);
    } 

    public static void levelOrderTreversal(TreeNode<Integer> root){

        if(root==null){
            return;
        }

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            TreeNode<Integer> data = q.poll();

            if(data==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                System.out.print(data.data + " ");

                if(data.left !=null){
                    q.add(data.left);
                }
                if(data.right !=null){
                    q.add(data.right);
                }

            }


        }

    }
}
