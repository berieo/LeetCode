import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public static int[] levelOrder(TreeNode root) {
         if(root == null)
             return new int[0];

         Queue<TreeNode> queue = new LinkedList<>();
         List<Integer> list = new LinkedList<Integer>();
         queue.add(root);
         while(queue.size() != 0){
            if(queue.peek().left != null)
                queue.add(queue.peek().left);
            if(queue.peek().right != null)
                queue.add(queue.peek().right);
            list.add(queue.poll().val);
         }
         int[] ans = new int[list.size()];
         int index = 0;
         for(int i : list){
            ans[index++] = i;
         }
         return ans;
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
         levelOrder(t1);
    }
}
