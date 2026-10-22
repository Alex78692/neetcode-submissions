
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode lnode = dummy;

        // Reach the node before left
        for (int i = 1; i < left; i++) {
            lnode = lnode.next;
        }

        ListNode temp = lnode.next;
        ListNode prev = null;

        // Reverse exactly right - left + 1 nodes
        for (int i = 0; i < right - left + 1; i++) {
            ListNode nNode = temp.next;

            temp.next = prev;
            prev = temp;
            temp = nNode;
        }

        // Connect the reversed section back
        lnode.next.next = temp;
        lnode.next = prev;

        return dummy.next;
    }
}
