
public class ReorderList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        second = reverseList(second);
        ListNode c1 = head;
        ListNode c2 = second;
        ListNode n1;
        ListNode n2;
        while (c1 != null && c2 != null) {
            n1 = c1.next;
            c1.next = c2;
            c1 = n1;
            n2 = c2.next;
            c2.next = c1;
            c2 = n2;
        }
    }

}
