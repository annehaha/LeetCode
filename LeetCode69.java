/*
 *Implement int sqrt(int x).

	Compute and return the square root of x.
 *  */

public class LeetCode69 {
	public int mySqrt(int x) {
        //return (int)Math.sqrt(x);
		
		//另一种解法，二分法
		double diff=0.001;
		int low=0;
		int high=x;
		double mid;
		while(low<=high){
			mid=low+(high-low)/2;
			if(Math.abs(mid*mid-x)<=diff)
				return (int)mid;
			else if(mid*mid-x>diff){
				high=(int)mid-1;
			}
			else if(x-mid*mid>diff){
				low=(int)mid+1;
			}
			
		}
		return high;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode69 t = new LeetCode69();
	    int num=10;
		System.out.println(t.mySqrt(num));
	}

}
