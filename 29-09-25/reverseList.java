
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        //base case
        if (head == null || head.next == null) {
            return head;
        }

        //reverse the rest of the list
        ListNode newHead = reverseList(head.next);

        //fix current node's pointer
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    //main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        //example linked list: 1->2->3->null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode reversed = sol.reverseList(head);

        //print reversed list
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        // Expected output: 3 2 1
    }
}

