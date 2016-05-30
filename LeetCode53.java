/*
 *Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

	For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
	the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 *  */

public class LeetCode53 {
	//思路：最小子串的动规问题。
	//temp存下当前子串和，如果为负数，而下一位为正，则请空temp,存入当前数,重新开始累加。
	 public int maxSubArray(int[] nums) {
		 int result=Integer.MIN_VALUE;
		 int temp=0;      
	        for(int i=0;i<nums.length;i++){
	        	if(temp<=0){
	        		temp=nums[i];        
	        	}else{
	        		temp+=nums[i];
	        	}
	        	result=Math.max(result, temp);
	        }	        
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode53 t = new LeetCode53();
	    int num[]= {-1,-3,-2,-4,-3};
		System.out.println(t.maxSubArray(num));
	}

}
