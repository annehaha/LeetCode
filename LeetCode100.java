import java.util.*;

/* 100. Same Tree
 * Given two binary trees, write a function to check if they are equal or not.

	Two binary trees are considered equal if they are structurally identical and the nodes have the same value.


*/

public class LeetCode100 {
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 public boolean isSameTree(TreeNode p, TreeNode q) {
		 	if(p==null&&q==null) return true;
		    if(p==null||q==null)return false;
	        if(p.val!=q.val)return false;
	        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode100 t = new LeetCode100();
		TreeNode p=new TreeNode(1);
		TreeNode q=new TreeNode(2);
		System.out.println(t.isSameTree(p, q));
	}

}
