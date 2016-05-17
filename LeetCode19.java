/*
 * Given a linked list, remove the nth node from the end of list and return its head.

	For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

 *  */

public class LeetCode15 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		ListNode p = head, q = head;
		// one pass: p runs n times earlier then run p&q
		for (int i = 0; i < n; i++)
			p = p.next;

		if (p == null) { // delete first node
			head = head.next;
			return head;
		}
		while (p.next != null) {
			q = q.next;
			p = p.next;
		}
		q.next = q.next.next;
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode15 t = new LeetCode15();
	}

}
