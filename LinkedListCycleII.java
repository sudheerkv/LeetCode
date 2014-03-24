/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
	public ListNode detectCycle(ListNode head) {

		if (null == head)
			return null;
		if (head.next == head)
			return head;

		boolean hascycle = false;
		int nodesCycle = 0;

		ListNode slowptr = head, fastptr = head;
		while (fastptr.next != null && fastptr.next.next != null) {
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
			if (slowptr == fastptr) {
				hascycle = true;
				break;
			}
		}
		if (!hascycle)
			return null;
		slowptr = slowptr.next;
		while (slowptr != fastptr) {
			slowptr = slowptr.next;
			nodesCycle++;
		}
		nodesCycle++;

		fastptr = head;
		slowptr = head;
		while (nodesCycle != 0) {
			fastptr = fastptr.next;
			nodesCycle--;
		}

		while (slowptr != fastptr) {
			slowptr = slowptr.next;
			fastptr = fastptr.next;
		}
		return slowptr;

	}
}