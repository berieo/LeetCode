public class MaxDepth {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int count = 1;
        findMax(root, count);
        return max;
    }

    static int max = Integer.MIN_VALUE;

    public static void findMax(TreeNode node, int count){
        if(count > max)
            max = count;
        if(node.left != null){
            findMax(node.left, ++count);
            count--;
        }
        if(node.right != null){
            findMax(node.right, ++count);
        }
        else
            return;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        maxDepth(t1);
    }
}
