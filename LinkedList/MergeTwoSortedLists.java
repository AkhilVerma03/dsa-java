
 /*
# Complexity

Time: O(n + m)
Space: O(1)
*/

class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
            }
            else{
                temp.next = p2;
                temp = temp.next;
                p2 = p2.next;
            }
        }

        if(p1 != null){
            temp.next = p1;
        }
        else if(p2 != null){
            temp.next = p2;
        }

        return dummy.next;
    }
} 
