
/*
 * Given a sorted array of integers, find the starting and ending position of a given target value.

	Your algorithm's runtime complexity must be in the order of O(log n).
	
	If the target is not found in the array, return [-1, -1].
	
	For example,
	Given [5, 7, 7, 8, 8, 10] and target value 8,
	return [3, 4].
 *  */

public class LeetCode34 {

	 public int[] searchRange(int[] nums, int target) {
	        int start=-1;
	        int end=-1;
	        for(int i=0;i<nums.length;i++){
	        	if(start<0&&nums[i]==target){
	        		start=i;
	        	}
	        	if(nums[i]==target&&start>=0){
	        		end=i;
	        	}
	        	if(nums[i]!=target&&start>0&&end>0)
	        		break;
	        }
	        
	        int[] result={start,end};
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode34 t = new LeetCode34();
	    int num[]={1,2,2,4,5};
		System.out.println(t.searchRange(num, 2));
	}

}
