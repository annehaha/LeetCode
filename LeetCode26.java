import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

	Do not allocate extra space for another array, you must do this in place with constant memory.
	
	For example,
	Given input array nums = [1,1,2],
	
	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


 *  */

public class LeetCode26 {
		
	public int removeDuplicates(int[] nums) {
		if(nums.length==0)return 0;
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]!=nums[count-1]){
        		nums[count]=nums[i];
        		count++;
        	}
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode26 t = new LeetCode26();
		int[] arr={1,1,2};
		System.out.println(t.removeDuplicates(arr));
	}

}
