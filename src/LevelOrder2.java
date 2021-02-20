import java.awt.geom.QuadCurve2D;
import java.util.*;

public class LevelOrder2 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null)
            return list;

        Queue<TreeNode> left = new LinkedList<>();  //从右往左
        Queue<TreeNode> right = new LinkedList<>(); //从左往右
        List<Integer> temp = new LinkedList<>();

        int tag = 1;  //tag == 1左栈 tag == 2 右栈
        left.add(root);
        while(!right.isEmpty() || !left.isEmpty()){
            if(tag == 1){
                if(left.peek().left != null)
                    right.add(left.peek().left);
                if(left.peek().right != null)
                    right.add(left.peek().right);
                temp.add(left.poll().val);
                if(left.isEmpty()){
                    List<Integer> add = new ArrayList<>();
                    for(Integer i : temp)
                        add.add(i);
                    list.add(add);
                    temp.clear();
                    tag = 2;
                }

            }else if(tag == 2){
                if(right.peek().left != null)
                    left.add(right.peek().left);
                if(right.peek().right != null)
                    left.add(right.peek().right);
                temp.add(right.poll().val);
                if(right.isEmpty()) {
                    List<Integer> add = new ArrayList<>();
                    for(Integer i : temp)
                        add.add(i);
                    list.add(add);
                    temp.clear();
                    tag = 1;
                }
            }else{
                break;
            }
        }

        return list;
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
