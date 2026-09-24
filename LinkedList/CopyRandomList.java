/*
# Complexity

Time: O(n)
Space: O(n)
*/

class CopyRandomList {

    public Node copyRandomList(Node head) {
        Node temp = head;
        Node dummy = new Node(0);
        Node temp2 = dummy;
        HashMap<Node,Node> map = new HashMap<>();

        while(temp != null){
            temp2.next = new Node(temp.val);
            map.put(temp, temp2.next);
            temp = temp.next;
            temp2 = temp2.next;
        }

        temp2 = dummy.next;
        temp = head;

        while(temp2 != null){
            temp2.random = map.get(temp.random);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return dummy.next;
    }
}