/*
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

	P   A   H   N
	A P L S I I G
	Y   I   R
	And then read line by line: "PAHNAPLSIIGYIR"
	Write the code that will take a string and make this conversion given a number of rows:
	
	string convert(string text, int nRows);
	convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class LeetCode6 {
	 public String convert(String s, int numRows) {
	        int len=s.length();
	        int acc=2*numRows-2;  //循环周期
	        String result="";  
	        
	        if(acc==0){
	        	return s;
	        }
	        for(int i=0;i<numRows;i++)
	        	for(int j=i;j<len;j+=acc){
	        		result+=s.charAt(j);

	        		if(i>0&&i<numRows-1){    //中间部分需要多加一次
	        			 int temp=j+2*(numRows-i-1);
		        			if(temp<len)
		        				result+=s.charAt(temp);
	        		}
	        	}
	       
	       return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode6 t=new LeetCode6();
		System.out.println(t.convert("abcd", 3));
	}

}
