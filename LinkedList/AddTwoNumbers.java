/*
# Complexity

Time: O(n + m)
Space: O(n + m)
*/

class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode temp3 = dummy;
        int carry = 0;
        int sum = 0;

        while(temp1 != null || temp2 != null){
            if(temp1 == null){
                sum = temp2.val + carry;
            }
            else if(temp2 == null){
                sum = temp1.val + carry;
            }
            else{
                sum = temp1.val + temp2.val + carry;
            }

            temp3.next = new ListNode(sum % 10);
            carry = sum / 10;

            if(temp1 != null)
                temp1 = temp1.next;

            if(temp2 != null)
                temp2 = temp2.next;

            temp3 = temp3.next;
        }

        if(carry != 0){
            temp3.next = new ListNode(carry);
        }

        return dummy.next;
    }
}