/*
 * Implement atoi to convert a string to an integer.
	Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
	Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 */

public class LeetCode8 {
	public int myAtoi(String str) {
		   if(str.equals(""))return 0;  //if ""
	        
			int start=0,end=str.length(),flag1=0,flag2=0;
			int max=Integer.MAX_VALUE;
			int min=Integer.MIN_VALUE;
			int result=0;
			double t=0;
			
			//str=str.trim();//delete blank space
			while(str.charAt(start)==' ')start++;
			
	        if(str.charAt(start)=='-'){  // if starts with -/+
	        	flag1++;
	        	start++;
	        }
	        else if (str.charAt(start)=='+'){
	        	flag2++;
	        	start++;
	        }
	        for(int i=start;i<str.length();){  
	        	if(str.charAt(i)<'0'||str.charAt(i)>'9'){//if NaN exist
	        		end=i;
	        		break;
	        	}else{      //if out of "-2147483648"&&"2147483647"
	        		t=t*10+(str.charAt(i)-'0');
	        		i++;
	        	}
	        }
	       
	        if(start==end  )return 0;
	        if(t>max && flag1!=1)return max;
	        if(t+min>=0 && flag1==1)return min;
	        result= Integer.parseInt(str.substring(start,end));
	       
	        if(flag1==1){
	            return -result;
	        }
	        else{
	            return result;
	        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode8 t=new LeetCode8();
		System.out.println(t.myAtoi("-2147483648"));
	}

}
