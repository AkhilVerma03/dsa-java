/*
# Complexity

Time: O(n)
Space: O(1)
*/

class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        while(n > 0){
            second = second.next;
            n--;
        }

        while(second.next != null){
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;

        return dummy.next;
    }
}