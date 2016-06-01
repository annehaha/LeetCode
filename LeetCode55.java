/*
 *Given an array of non-negative integers, you are initially positioned at the first index of the array.

	Each element in the array represents your maximum jump length at that position.
	
	Determine if you are able to reach the last index.
	
	For example:
	A = [2,3,1,1,4], return true.
	
	A = [3,2,1,0,4], return false.
 *  */

public class LeetCode55 {
	 public boolean canJump(int[] nums) {
	        int step=1;   //当前可走步数
	        int max=0;    //当前所在位置可到达的最远处
	        if(nums.length==0)return true;
	        if(nums.length==1 && nums[0]==0)return true;
	        for(int i=0;i<nums.length;i++){
	        	step--;
	        	if(nums[i]+i>max){
	        		max=nums[i]+i;
	        		step=nums[i];
	        	}
	        	if(nums.length-1>i&&step==0){
	        		return false;
	        	}
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode55 t = new LeetCode55();
	    int num[]= {2,3,1,1,4};
		System.out.println(t.canJump(num));
	}

}
