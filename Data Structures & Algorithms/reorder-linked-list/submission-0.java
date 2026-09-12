class Solution {
    public void reorderList(ListNode head) {

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode curr = slow.next;
        slow.next = null;

        ListNode mid = null;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = mid;
            mid = curr;

            curr = next;
        }

        // Merge
        ListNode n2 = head;

        while (mid != null) {

            ListNode next1 = n2.next;
            ListNode next2 = mid.next;

            n2.next = mid;
            mid.next = next1;

            n2 = next1;
            mid = next2;
        }
    }
}