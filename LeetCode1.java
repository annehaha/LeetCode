import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution.
	
	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 * */

public class LeetCode1 {
public int[] twoSum(int[] nums, int target) {
   //1.solved by force
	/*
	 for(int i=0;i<nums.length-1;i++){
    	 for(int j=i+1;j<nums.length;j++){
    		 if(nums[i]+nums[j]==target){
    			int [] r={i,j};
    	
    			 return r;
    		 }
    	 }
    }
    return null;
  */
	
    //2.use hashmap
	HashMap map=new HashMap();
	for(int i=0;i<nums.length;i++){
		map.put(nums[i],i);    //input num as index, i as value
	}
	for(int j=0;j<nums.length;j++){
		int gap=target-nums[j];
		if(map.get(gap)!=null&&(int)map.get(gap)!=j){
			int [] r={j,(int) map.get(gap)};
			return r;
		}
	}
	return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode1 t=new LeetCode1();
		int [] nums={1,2,3,4,4,7,9};
		System.out.println(t.twoSum(nums, 3));
	}

}
