
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode Next;
        while (current != null) {
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        return prev;
    }
}
