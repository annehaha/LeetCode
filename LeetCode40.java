import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 *Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

	Each number in C may only be used once in the combination.
	
	Note:
	All numbers (including target) will be positive integers.
	Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
	The solution set must not contain duplicate combinations.
	For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
	A solution set is: 
	[1, 7] 
	[1, 2, 5] 
	[2, 6] 
	[1, 1, 6] 
 *  */

public class LeetCode40 {
		List<List<Integer>> list =new ArrayList<List<Integer>>();
	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		 Arrays.sort(candidates);
		 List<Integer> item=new ArrayList<Integer>();
		 find(target,candidates,0,item);
			
		 //delete the duplicated lists
		 HashSet<List<Integer>> set=new HashSet<List<Integer>>(list);
		 list.clear();
		 list.addAll(set);
		 return list;
	    }
	 
	 public void find(int target,int[] candidates,int i, List<Integer> item){
		 if(target==0){
			 List<Integer> it=new ArrayList<Integer>(item);//add to the list, or else it won't be added.
			 list.add(it);
			 return ;
			}		
	
		 for(int j=i;j<candidates.length;j++){
			 if(candidates[i]>target){
				 return;
			 }
			 item.add(candidates[j]);
			 find(target-candidates[j],candidates,j+1,item);
			//delete
			 item.remove(item.size()-1);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode40 t = new LeetCode40();
	    int num[]={1,2,2,4,5};
		System.out.println(t.combinationSum2(num, 7));
	}

}
