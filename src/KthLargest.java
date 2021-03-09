import java.util.LinkedList;
import java.util.List;

public class KthLargest {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static List<Integer> list = new LinkedList<>();

    public static int kthLargest(TreeNode root, int k) {
        findKth(root);
        //list.toArray();
        return list.get(list.size() - k);
    }

    public static void findKth(TreeNode node){
        if(node == null)
            return;
        findKth(node.left);
        list.add(node.val);
        findKth(node.right);
        return;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        int k = 1;
        kthLargest(t1, k);
    }
}
