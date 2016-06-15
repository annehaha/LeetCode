import java.util.*;

/*
 * 89. Gray Code
	
	The gray code is a binary numeral system where two successive values differ in only one bit.

	Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
	
	For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
	
	00 - 0
	01 - 1
	11 - 3
	10 - 2
	Note:
	For a given n, a gray code sequence is not uniquely defined.
	
	For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
	
	For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.

*/

public class LeetCode89 {
	public List<Integer> grayCode(int n) {
		List<Integer> res=new ArrayList<Integer>();
		int count = (int)Math.pow(2,n);	
		for(int i = 0; i < count; i++){
		    res.add((i) ^ (i >> 1));
		}
		return res;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode89 t = new LeetCode89();
		int num = 3;
		System.out.println(t.grayCode(num));
	}

}
