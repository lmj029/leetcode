import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC160 {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            Set<ListNode> set = new HashSet<>();
//            while(headA != null) {
//                set.add(headA);
//                headA = headA.next;
//            }
//
//            while (headB != null) {
//                if(set.contains(headB)) return headB;
//                headB = headB.next;
//            }
//
//            return null;

            //two point

            ListNode pa = headA;
            ListNode pb = headB;

            while (pa != pb) {
                pa = pa.next;
                pb = pb.next;
                if(pa == pb) return pa;
                if (pa == null) pa = headB;
                if (pb == null) pb = headA;
            }
            return pa;

        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode headA1 = new ListNode(2);
        ListNode headA2 = new ListNode(6);
        ListNode headA3 = new ListNode(4);
        headA1.next = headA2;
        headA2.next = headA3;
        ListNode headB1 = new ListNode(1);
        ListNode headB2 = new ListNode(5);
        headB1.next = headB2;
        s.getIntersectionNode(headA1, headB1);


    }

}
