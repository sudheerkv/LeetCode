/**
 * Defition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int i=0,val=-1;
        ListNode l = new ListNode(0);
        ListNode l3 = new ListNode(0);
        
        if(l1==null && l2==null)
            return null;
            
        while(l1!=null && l2!=null) {
            if(l1.val<l2.val) {
                val = l1.val;
                l1 = l1.next;
            }
            else {
                val = l2.val;
                l2 = l2.next;
            }
            if(i==0) {
                l = new ListNode(val);
                l3 =l;
            }
            else {
                l.next=new ListNode(val);
                l=l.next;
            }
            i++;
        }
        while(l1!=null) {
            if(i==0) {
                l = new ListNode(l1.val);
                l3 =l;
            }
            else {
                l.next =new ListNode(l1.val);
                l=l.next;
            }
            l1 =l1.next;
            i++;
        }
        while(l2!=null) {
            if(i==0) {
                l = new ListNode(l2.val);
                l3 =l;
            }
            else {
                l.next =new ListNode(l2.val);
                l=l.next;
            }
            l2 =l2.next;
            i++;
        }
        return l3;
    }
}
