tion for singly-linked list.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                int sum = 0;
                int carry =0;
                int i =0;
                ListNode l = new ListNode(0);
                ListNode temp = new ListNode(0);
                while(l1!=null || l2!=null || carry!=0)
                {
                        sum = carry;
                        if(l1!=null)
                        {
                                sum += l1.val;
                                l1 = l1.next;
                        }
                        if(l2!=null)
                        {
                                sum += l2.val;
                                l2 = l2.next;
                        }
                        carry = sum/10;
                        sum = sum%10;
                        if(i==0)
                        {
                                temp = new ListNode(sum);
                                l = temp;
                                i++;
                        }
                        else
                        {
                                temp.next = new ListNode(sum);
                                temp = temp.next;
                        }

                }
                return l;
    }
}
