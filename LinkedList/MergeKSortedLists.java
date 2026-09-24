/*
# Complexity

Time: O(N log k)
Space: O(1)
*/

class MergeKSortedLists {

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

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;

        if(n == 0){
            return null;
        }

        while(n > 1){
            int j = 0;

            for(int i = 1; i < n; i += 2){
                lists[j] = mergeTwoLists(lists[i - 1], lists[i]);
                j++;
            }

            if(n % 2 != 0){
                lists[j] = lists[n - 1];
            }

            n = (n + 1) / 2;
        }

        return lists[0];
    }
}