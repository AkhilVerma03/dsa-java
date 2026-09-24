/*
# Complexity

Time: O(n)
Space: O(1)
*/

class RotateListRight {

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0){
            return head;
        }

        int n = 1;
        ListNode last = head;

        while(last.next != null){
            last = last.next;
            n++;
        }

        k = k % n;

        if(k == 0){
            return head;
        }

        last.next = head;

        int steps = n - k;
        ListNode newTail = head;

        for(int i = 1; i < steps; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}