/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode temp = head, nthptr = head, prev = null;
		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
			if (count > n) {
				prev = nthptr;
				nthptr = nthptr.next;
			}
		}
		if (prev == null) {
			head = head.next;
		} else {
			prev.next = nthptr.next;
		}
		return head;

	}
}