/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		if (null == head || null == head.next)
			return head;
		ListNode ptr;

		ListNode temp_head = new ListNode(0);
		temp_head.next = head;
		head = temp_head;

		ptr = temp_head.next;

		while (ptr.next != null) {
			ListNode temp = ptr.next;
			ptr.next = temp.next;
			temp.next = temp_head.next;
			temp_head.next = temp;
		}
		head = temp_head.next;
		return head;
	}

	public void reorderList(ListNode head) {

		if (null == head)
			return;
		ListNode slowptr = head, fastptr = head, temps, tempf;

		while (fastptr.next != null && fastptr.next.next != null) {
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
		}
		fastptr = slowptr.next;

		slowptr.next = null;
		slowptr = head;

		fastptr = reverseList(fastptr);

		while (fastptr != null) {
			temps = slowptr.next;
			tempf = fastptr.next;
			slowptr.next = fastptr;
			fastptr.next = temps;
			slowptr = fastptr.next;
			fastptr = tempf;
		}

	}
}