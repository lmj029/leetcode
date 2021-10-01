import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC2 {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode rear = head;
        boolean overflow = false;
        while(l1 != null || l2 != null) {
            int l1Value = l1 != null ? l1.val : 0;
            int l2Value = l2 != null ? l2.val : 0;
            int suffix = overflow ? 1 : 0;
            int tmpSum = l1Value + l2Value + suffix;
            overflow = tmpSum > 9 ? true : false;
            tmpSum = tmpSum > 9 ? tmpSum - 10 : tmpSum;
            ListNode tmpNode = new ListNode(tmpSum);
            rear.next = tmpNode;
            rear = tmpNode;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if(overflow) {
            ListNode tmp = new ListNode(1);
            rear.next = tmp;
        }
        return head.next;
    }


}
