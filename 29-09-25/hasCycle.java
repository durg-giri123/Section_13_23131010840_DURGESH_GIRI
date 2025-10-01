//public class hasCycle {
//}

// Define ListNode
class ListNode2 {
    int val;
    ListNode next;
    ListNode2(int val) {
        this.val = val;
        this.next = null;
    }
}
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;  //move 1 step
            fast = fast.next.next;  //move 2 steps

            if (slow == fast) {  //cycle detected
                return true;
            }
        }

        return false;  //no cycle
    }

    public static void main(String[] args) {
        hasCycle sol = new hasCycle();

        // Example linked list: 3 -> 2 -> 0 -> -4, with a cycle at node 2
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;
        nodeNeg4.next = node2; // cycle here

        System.out.println("Has cycle? " + sol.hasCycle(head)); // Expected: true

        // Test without cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("Has cycle? " + sol.hasCycle(head2)); // Expected: false
    }
}
