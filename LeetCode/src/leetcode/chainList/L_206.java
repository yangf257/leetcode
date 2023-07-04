package leetcode.chainList;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 14:19
 **/
public class L_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = null;
        ListNode p = head, next = p.next;
        while (p != null) {
            next = p.next;
            p.next = dummyHead.next;
            dummyHead.next = p;
            p = next;
        }

        return dummyHead.next;
    }
}
