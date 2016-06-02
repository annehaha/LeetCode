import java.util.ArrayList;
import java.util.List;

/*
 *Given a sorted integer array without duplicates, return the summary of its ranges.

	For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
	
 *  */

public class LeetCode228 {
	public List<String> summaryRanges(int[] nums) {
		//if use StringBuilder, it will be better.
		List<String> result=new ArrayList<String>();
		int begin=0;
        for(int i=1;i<=nums.length;i++){
        	if(i==nums.length||nums[i-1]!=nums[i]-1){  //put i==nums.length ahead
        		StringBuilder sb=new StringBuilder();
        		sb.append(nums[begin]);
        		if(i>begin+1){
	        		sb.append("->");
	        		sb.append(nums[i-1]);
        		}
        		result.add(sb.toString());
        		begin=i;
        	}
        }
       
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode228 t = new LeetCode228();
	    int num[] = {2,3,4,9,13,14};
		System.out.println(t.summaryRanges(num));
	}

}
