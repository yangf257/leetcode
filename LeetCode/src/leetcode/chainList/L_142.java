package leetcode.chainList;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 16:16
 **/
public class L_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        if (head == null) {
            return null;
        }
        while (true) {
            slow = slow.next;
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        ListNode p = head;
        while (p != slow) {
            p = p.next;
            slow = slow.next;
        }

        return p;
    }
}
