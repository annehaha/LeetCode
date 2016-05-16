import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

	Note:
	Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
	The solution set must not contain duplicate triplets.
	    For example, given array S = {-1 0 1 2 -1 -4},
	
	    A solution set is:
	    (-1, 0, 1)
	    (-1, -1, 2)
 *  */

public class LeetCode15 {
	private List<List<Integer>> result =new ArrayList<List<Integer>>();
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);;
		for(int i=0;i<nums.length-2;i++){
			if (i != 0 && nums[i] == nums[i - 1]) {  //skip duplicated elements to short time!
                continue;  
            }  
			find(i,i+1,nums.length-1,nums);
		}
		return result;
        
    }
	
	public void find(int i,int start,int end, int[] nums){
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(start<end){
			if(nums[start]+nums[end]>-nums[i]){
				end--;
			}else if(nums[start]+nums[end]<-nums[i]){
				start++;
			}else if(nums[start]+nums[end]==-nums[i]){
			
				list.add(nums[i]);
				list.add(nums[start]);
				list.add(nums[end]);
				
				result.add(list);
				list=new ArrayList<Integer>();
				start++;
				end--;
				
				while (start < end && nums[start] == nums[start - 1]) {  //skip duplicated elements
					start++;  
                }  
                while (start < end && nums[end] == nums[end + 1]) {  
                	end--;  
                }  
			}
			
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode15 t=new LeetCode15();
		int[] s={7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		System.out.println(t.threeSum(s));
	}

}
