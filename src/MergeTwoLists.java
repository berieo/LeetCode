
public class MergeTwoLists {

     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null || l2 != null){
            if(l1.val < l2.val){
                ListNode temp = new ListNode(l1.val);
                cur.next = temp;
                cur = cur.next;
                l1 = l1.next;
            } else if(l1.val > l2.val){
                ListNode temp = new ListNode(l2.val);
                cur.next = temp;
                cur = cur.next;
                l2 = l2.next;
            } else {
                ListNode temp1 = new ListNode(l1.val);
                ListNode temp2 = new ListNode(l2.val);
                cur.next = temp1;
                cur = cur.next;
                cur.next = temp2;
                cur = cur.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return head.next;
    }

    public static void main(String[] args){
        ListNode l1_1 = new ListNode(1);
        ListNode l1_2 = new ListNode(2);
        ListNode l1_3 = new ListNode(4);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2_1 = new ListNode(1);
        ListNode l2_2 = new ListNode(3);
        ListNode l2_3 = new ListNode(4);
        l2_1.next = l2_2;
//        l2_2.next = l2_3;

        mergeTwoLists(l1_1, l2_1);
    }
}
