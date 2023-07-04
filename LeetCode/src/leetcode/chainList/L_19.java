package leetcode.chainList;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 14:57
 **/
public class L_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode targetPre = dummyHead, p = head, target = head;
        int count = 0;
        while (count < n) {
            count++;
            p = p.next;
        }
        while (p != null) {
            p = p.next;
            target = target.next;
            targetPre = targetPre.next;
        }
        targetPre.next = target.next;

        return dummyHead.next;
    }
}
