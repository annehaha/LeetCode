import java.util.*;

/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

	For example,
	Given 1->2->3->3->4->4->5, return 1->2->5.
	Given 1->1->1->2->3, return 2->3.
*/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

public class LeetCode82 {
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
		      
	  public ListNode deleteDuplicates(ListNode head) {
		  if(head==null||head.next==null)return head;
		  ListNode p=new ListNode(0);
		  ListNode q=new ListNode(0);
		  q=p;
		  p.next=head;
		  while(head!=null&&head.next!=null){
			  if(head.val==head.next.val){
				  while(head.next!=null&&head.val==head.next.val){
					  head=head.next;
				  }
				  head=head.next;
				  q.next=head;
			  }else{
				  head=head.next;
				  q=q.next;
			  }
		  }
		  
	        return p.next;
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode82 t = new LeetCode82();
		ListNode list[]=new ListNode[5];
		ListNode t1=new ListNode(1);
		list[0]=new ListNode(1);
		list[1]=new ListNode(1);
		list[2]=new ListNode(1);
		list[3]=new ListNode(4);
		list[3]=new ListNode(5);
		list[0].next=list[1];
		list[1].next=list[2];
		list[2].next=list[3];
		list[3].next=list[4];
		System.out.println(t.deleteDuplicates(list[0]).val);
	}

}
