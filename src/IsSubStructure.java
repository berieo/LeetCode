import java.util.ArrayList;
import java.util.List;

public class IsSubStructure {

    static List<List<Integer>> allList = new ArrayList<>();
    static int val = 0;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null){
            return false;
        }
        List<Integer> list = new ArrayList<Integer>();
        val = B.val;
        allList.clear();

        //找到第一个的位置
        findFirst(A, list);
        TreeNode temp = A;

        for(List<Integer> i : allList){
            temp = A;
            for(Integer j : i){
                if (j == 0)
                    temp = temp.left;
                else
                    temp = temp.right;
            }
            if(isEqual(temp, B))
                return true;
        }
        return false;
    }

    public static void findFirst(TreeNode A, List<Integer> list){
        if (A.val == val){
            //实现深拷贝
            List<Integer> temp = new ArrayList<>(list);
            allList.add(temp);
        }
        if (A.left != null){ //如果左边有
            list.add(0);
            findFirst(A.left, list);
            list.remove(list.size() - 1);
        }
        if (A.right != null){ //如果右边有
            list.add(1);
            findFirst(A.right, list);
        } else {
            return;
        }
        return;
    }

    public static boolean isEqual(TreeNode A, TreeNode B){
        if (A.val != B.val){
            return false;
        }
        boolean left = true;
        boolean right = true;
        if (B.left != null) { //如果B左边有
            if (A.left != null) {//如果A左边也有
                left = isEqual(A.left, B.left);
            }else
                return false;
        }
        if (B.right != null) {
            if(A.right != null) {
                right = isEqual(A.right, B.right);
            }else
                return false;
        }
        return left && right;
    }

    public static void main(String[] args){
        //System.out.println(isSubStructure(A, B));
    }
}
