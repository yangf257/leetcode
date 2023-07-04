package leetcode.chainList;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 14:30
 **/
public class L_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = null;
        ListNode p = head, next = p.next;
        ListNode dummyP = dummyHead;
        int count = 0;

        while (p != null) {
            next = p.next;
            p.next = dummyP.next;
            dummyP.next = p;
            p = next;
            count++;
            if (count == 2) {
                dummyP = dummyP.next.next;
                count = 0;
            }
        }
        return dummyHead.next;
    }
}
