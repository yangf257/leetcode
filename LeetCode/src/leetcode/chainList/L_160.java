package leetcode.chainList;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 15:51
 **/
public class L_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode dummyHeadA = new ListNode(), dummyHeadB = new ListNode();
        dummyHeadA.next = headA;
        dummyHeadB.next = headB;
        ListNode pA = dummyHeadA, pB = dummyHeadB;
        while (pA != null) {
            pA = pA.next;
            lengthA++;
        }
        while (pB != null) {
            pB = pB.next;
            lengthB++;
        }

        pA = dummyHeadA;
        pB = dummyHeadB;
        while (lengthB > lengthA) {
            pB = pB.next;
            lengthB--;
        }
        while (lengthA > lengthB) {
            pA = pA.next;
            lengthA--;
        }

        while (pA != pB) {
            pA = pA.next;
            pB = pB.next;
        }

        return pA;
    }
}
