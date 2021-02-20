import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode mirrorTree(TreeNode root) {
        if(root == null || (root.right == null && root.left == null))
            return root;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() != 0){
            if(queue.peek().left != null){
                queue.add(queue.peek().left);
            }
            if(queue.peek().right != null)
                queue.add(queue.peek().right);
            //左右子树替换
            TreeNode temp = queue.peek().right;
            queue.peek().right = queue.peek().left;
            queue.peek().left = temp;
            queue.poll();
        }

        return root;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(19);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        mirrorTree(t1);
    }
}
