import java.util.*;

/*
 * Given a set of distinct integers, nums, return all possible subsets.

	Note: The solution set must not contain duplicate subsets.
	
	For example,
	If nums = [1,2,3], a solution is:
	
	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
]
*/

public class LeetCode78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		List<Integer> item=new ArrayList<Integer>();	
		res.add(item);
		for(int num:nums){		
			int size=res.size();
			for(int i=0;i<size;i++){
				item=new ArrayList<Integer>(res.get(i));  //it is a clever method
				item.add(num);
				res.add(item);
			}
		}
		return res;
    }
        
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode78 t=new LeetCode78();
		int[] nums={1,2,12};
		System.out.println(t.subsets(nums));
	}

}
