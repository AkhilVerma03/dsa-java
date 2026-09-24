/*
# Complexity

Time: O(n)
Space: O(1)
*/

class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        ListNode prev = temp.next;
        ListNode curr = temp.next.next;
        ListNode next = head;

        while(curr != null){
            next = curr.next;
            temp.next = curr;
            curr.next = prev;
            prev.next = next;

            if(next == null){
                curr = null;
            }
            else{
                curr = next.next;
            }

            temp = prev;
            prev = next;
        }

        return dummy.next;
    }
}