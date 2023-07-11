package leetcode;

import leetcode.chainList.ListNode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/11 14:32
 **/
public class L_328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode oddDummyHead = new ListNode(), evenDummyHead = new ListNode(), oddP = oddDummyHead, evenP = evenDummyHead;
        ListNode p = head, next;
        boolean isOdd = true;
        while (p != null) {
            next = p.next;
            if (isOdd) {
                isOdd = false;
                oddP.next = p;
                p.next = null;
                oddP = oddP.next;
            } else {
                isOdd = true;
                evenP.next = p;
                p.next = null;
                evenP = evenP.next;
            }
            p = next;
        }
        oddP.next = evenDummyHead.next;
        evenP.next = null;
        return oddDummyHead.next;
    }
}
