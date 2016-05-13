/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 *  */

public class LeetCode14 {
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length==0)return "";
	        String result=strs[0];
	        for(int i=1;i<strs.length;i++){
	        	result=getCommon(result,strs[i]);
	     
	        }
	        return result;
	    }
	 
	 public String getCommon(String s1,String s2){
		 int i;
		 for(i=0;i<s1.length()&&i<s2.length();i++){
			 if(s1.charAt(i)!=s2.charAt(i)){
				 return s1.substring(0,i);
			 }
			 
		 }
		 if(i==s1.length())return s1;
		 if(i==s2.length())return s2;
		 return "";
			
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode14 t=new LeetCode14();
		String[] s={"12147nnn","12365c","122gj"};
		System.out.println(t.longestCommonPrefix(s));
	}

}
