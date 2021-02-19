import sun.reflect.generics.tree.Tree;

import java.util.*;

public class LevelOrder3 {
    public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list = new LinkedList<>();
        if(root == null)
            return list;

        Stack<TreeNode> left = new Stack<>();  //从右往左
        Stack<TreeNode> right = new Stack<>(); //从左往右
        List<Integer> temp = new LinkedList<>();

        int tag = 2;  //tag == 1左栈 tag == 2 右栈
        right.push(root);
        while(!right.empty() || !left.empty()){
            if(tag == 1){
                if(left.peek().right != null)
                    right.push(left.peek().right);
                if(left.peek().left != null)
                    right.push(left.peek().left);
                temp.add(left.pop().val);
                if(left.empty()){
                    List<Integer> add = new ArrayList<>();
                    for(Integer i : temp)
                        add.add(i);
                    list.add(add);
                    temp.clear();
                    tag = 2;
                }

            }else if(tag == 2){
                if(right.peek().left != null)
                    left.push(right.peek().left);
                if(right.peek().right != null)
                    left.push(right.peek().right);
                temp.add(right.pop().val);
                if(right.empty()) {
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
