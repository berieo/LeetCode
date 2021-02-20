import java.util.LinkedList;
import java.util.List;

public class PathSum {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static List<List<Integer>> list = new LinkedList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        findSum(root, sum, 0, new LinkedList<Integer>());
        return list;
    }

    public static void findSum(TreeNode node, int sum, int count, LinkedList<Integer> path){
        if(node == null){
            return;
        }
        count += node.val;
        path.add(node.val);
        if(count == sum){
            if (node.right == null && node.left == null)
                list.add(new LinkedList(path));
        }
        findSum(node.left, sum, count, path);
        findSum(node.right, sum, count, path);
        path.removeLast();
        return;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.left = t9;
        t6.right = t10;
        TreeNode treeNode1 = new TreeNode(-2);
        TreeNode treeNode2 = new TreeNode(-3);
        treeNode1.left = treeNode2;
        int sum = -5;
        pathSum(treeNode1, sum);
    }
}
