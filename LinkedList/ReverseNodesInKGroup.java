/*
# Complexity

Time: O(n)
Space: O(1)
*/

class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while(true){

            ListNode kth = groupPrev;

            for(int i = 0; i < k; i++){
                kth = kth.next;

                if(kth == null){
                    return dummy.next;
                }
            }

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode current = groupPrev.next;

            while(current != groupNext){
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
    }
}