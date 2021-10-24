public class LC21 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            ListNode rear = head;

            while(l1 != null && l2 != null) {
                if(l1.val < l2.val) {
                    rear.next = l1;
                    rear = l1;
                    l1 = l1.next;
                } else {
                    rear.next = l2;
                    rear = l2;
                    l2 = l2.next;
                }
            }

            if(l1 != null) {
                rear.next = l1;
            }

            if(l2 != null) {
                rear.next = l2;
            }

            return head.next;

        }
    }
}
