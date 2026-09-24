/*
# Complexity

Time: O(n log n)
Space: O(log n)
*/

class SortList {

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    public ListNode merge(ListNode leftSorted, ListNode rightSorted) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(leftSorted != null && rightSorted != null){

            if(leftSorted.val <= rightSorted.val){
                temp.next = leftSorted;
                leftSorted = leftSorted.next;
            }
            else{
                temp.next = rightSorted;
                rightSorted = rightSorted.next;
            }

            temp = temp.next;
        }

        if(leftSorted != null){
            temp.next = leftSorted;
        }
        else{
            temp.next = rightSorted;
        }

        return dummy.next;
    }

    public ListNode mergeSort(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode right = slow.next;
        slow.next = null;

        ListNode leftSorted = mergeSort(head);
        ListNode rightSorted = mergeSort(right);

        return merge(leftSorted, rightSorted);
    }
}