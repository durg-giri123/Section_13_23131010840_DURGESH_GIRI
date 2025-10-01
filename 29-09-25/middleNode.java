//public class middleNode {
//}

// Define ListNode class
class ListNode1 {
    int val;
    ListNode next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}
class middleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //move by 1
            fast= fast.next.next; //move by 2

        }

        return slow;  //middle node

    }

    // main method for testing
    public static void main(String[] args) {
        middleNode sol = new middleNode();

        // Example linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call middleNode
        ListNode middle = sol.middleNode(head);

        // Print the value of the middle node
        System.out.println("Middle node value: " + middle.val);
        // Expected output: 3
    }
}
