public class DeleteNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode deleteNode(ListNode head, int val) {
        if(head.val == val)
            return head.next;

        ListNode cur = head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                break;
            }else{
                cur = cur.next;
                pre = pre.next;
            }
        }

        return head;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        int value = 4;
        deleteNode(l1, value);
    }
}
