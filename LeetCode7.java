/*
 * Reverse digits of an integer.
	Example1: x = 123, return 321
	Example2: x = -123, return -321
*/

public class LeetCode7 {
	 public int reverse(int x) {
		 String t=x+"";
		 boolean neg=false;
		 int sym=0;
		 int min=Integer.MIN_VALUE;
		 int max=Integer.MAX_VALUE;
		 double c;
		 
		 if(x<0){    //如果是负数，截取符号翻转
			 neg=true;
			 t=t.substring(1);
			 sym=1;
		 }
		 else if(t.charAt(0)=='+'){
			 t=t.substring(1);
			 sym=1;
		 }
	     StringBuffer result=new StringBuffer(t);
		 result=result.reverse();
		 
		 c=Double.parseDouble(result.toString());  //如果翻转后超越了int范围，返回0
		 if(c>max ||c<min)return 0;
		 if(neg)return -Integer.parseInt(result.toString());
		 if(!neg && sym==1)return Integer.parseInt("+"+result.toString());
		 else return Integer.parseInt(result.toString());
		 
	 }
        
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode7 t=new LeetCode7();
		System.out.println(t.reverse(1534236469));
	}

}
