public class GetKthFromEnd {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        int count = 1;
        ListNode temp = head;
        int index = 1;
        while (true){
            System.out.println(temp.val);
            temp = temp.next;
            if(temp == null){
                break;
            }
            count += 1;
        }
        for (temp = head; index <= count - k; index++) {
            temp = temp.next;
        }
        System.out.println(count);

        return temp;
    }

    public static void main(String [] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(getKthFromEnd(node1, 2).val);
    }

}
