package algorithm;

class AddTwoNumbers {

    public static void main(String[] args) {
        //TODO 两数相加
//        addTwoNumbers();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // defined result
        ListNode result = new ListNode();

        // current node
        ListNode currentNode = result;

        // finish flag: l1.next is null and l2.next is null
        while (l1.next == null && l2.next == null) {
            int sumVal = l1.val + l2.val;
        }
        return result;
    }
	
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
