import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReversePrint {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static int[] reversePrint(ListNode head) {
        List<Integer> list = new LinkedList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        int[] ans = new int[list.size()];
        int index = 0;
        for(int i : list){
            ans[index++] = i;
        }
        return ans;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        reversePrint(l1);
    }
}
