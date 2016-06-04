/*
 *You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


 *  */

public class LeetCode70 {
	//if using recursion, then timeout
	public int climbStairs(int n) {
        if(n==0||n==1)return 1;
        if(n==2)return 2;
        int result=0,a=1,b=2;
        for(int i=2;i<n;i++){
        	result=a+b;
        	a=b;
        	b=result;
        }
        return result;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode70 t = new LeetCode70();
	    int num=4;
		System.out.println(t.climbStairs(num));
	}

}
