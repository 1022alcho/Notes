
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

class MergeLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode prev = temp;
        if(l1 == null && l2 == null) {
            return null;
        } else if(l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        }
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                prev.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                prev.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return temp.next;
    }
}