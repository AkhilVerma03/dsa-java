/*
# Complexity

Time: O(n)
Space: O(1)
*/

class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp = head;
        curr = prev;

        while(temp != null && curr != null){
            if(temp.val != curr.val){
                return false;
            }

            temp = temp.next;
            curr = curr.next;
        }

        return true;
    }
}