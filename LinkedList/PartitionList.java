/*
# Complexity

Time: O(n)
Space: O(1)
*/

class PartitionList {

    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }

        if(x < -100){
            return head;
        }

        ListNode dummys = new ListNode(0);
        ListNode small = dummys;
        ListNode dummyg = new ListNode(0);
        ListNode big = dummyg;
        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                small.next = temp;
                small = small.next;
            }
            else{
                big.next = temp;
                big = big.next;
            }

            temp = temp.next;
        }

        big.next = null;
        small.next = dummyg.next;

        return dummys.next;
    }
}