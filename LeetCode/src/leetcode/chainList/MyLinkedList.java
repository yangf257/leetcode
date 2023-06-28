package leetcode.chainList;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/28 19:09
 **/
public class MyLinkedList {
    private ListNode node;

    public MyLinkedList() {
        this.node = new ListNode();
    }

    public int get(int index) {
        int count = -1;
        ListNode p = this.node;
        while (count < index) {
            if (p == null) {
                return -1;
            }
            p = p.next;
            count++;
        }
        if (p == null) {
            return -1;
        }
        return p.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.node.next;
        this.node.next = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode p = this.node;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        newNode.next = null;
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);
        int count = -1;
        ListNode p = this.node;
        while (count < index - 1) {
            if (p == null) {
                return;
            }
            p = p.next;
            count++;
        }
        if (p == null) {
            return;
        } else {
            newNode.next = p.next;
            p.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        int count = -1;
        ListNode p = this.node;
        while (count < index - 1) {
            if (p == null) {
                return;
            }
            p = p.next;
            count++;
        }
        if (p == null || p.next == null) {
            return;
        }
        p.next = p.next.next;
    }

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

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(3, 1);
        myLinkedList.deleteAtIndex(2);
    }
}

