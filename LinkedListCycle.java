/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
	public boolean hasCycle(ListNode head) {

		if (null == head)
			return false;
		ListNode slowptr = head, fastptr = head;

		while (fastptr.next != null && fastptr.next.next != null) {
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
			if (slowptr == fastptr) {
				return true;
			}
		}
		return false;

	}
}