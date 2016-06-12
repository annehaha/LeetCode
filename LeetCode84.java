import java.util.*;

/*
 * 84. Largest Rectangle in Histogram
	
	Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.


	Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
	
	The largest rectangle is shown in the shaded area, which has area = 10 unit.
	
	For example,
	Given heights = [2,1,5,6,2,3],
	return 10.

*/

public class LeetCode84 {
	 public int largestRectangleArea(int[] heights) {
	        Stack<Integer> s=new Stack<Integer>();
	        int area=0;
	        for(int i=0;i<heights.length;i++){
	        	if(s.isEmpty()||heights[s.peek()]<heights[i]){
	        		s.push(i);
	        	}else{
	        		int start=s.pop();
	        		int width=s.empty()?i:i-s.peek()-1;
	        		area=Math.max(area, heights[start]*width);
	        		i--;
	        	}
	        }
	        while(!s.empty()){
	        	int start=s.pop();
	        	int width=s.empty()?heights.length:heights.length-s.peek()-1;
        		area=Math.max(area, heights[start]*width);
	        }
	        return area;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode84 t = new LeetCode84();
		int[] nums = { 1,2,3,4,2};
		System.out.println(t.largestRectangleArea(nums));
	}

}
