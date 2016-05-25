import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Given a digit string, return all possible letter combinations that the number could represent.

	A mapping of digit to letters (just like on the telephone buttons) is given below.
	
	Input:Digit string "23"
	Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *  */

public class LeetCode17 {
	 HashMap map=new HashMap();
     List<String> result=new ArrayList<String>();
	  public List<String> letterCombinations(String digits) {
		  	if(digits.length()==0)
		  		return result;
		  	 map.put('0',"");
			 map.put('1',"");
		     map.put('2',"abc");
		     map.put('3',"def");
		     map.put('4',"ghi");
		     map.put('5',"jkl");
		     map.put('6',"mno");
		     map.put('7',"pqrs");
		     map.put('8',"tuv");
		     map.put('9',"wxyz");
	        
	        char[] ch=new char[digits.length()];
	        getList(0,map,result,digits,ch);  //backtracking
	        return result;
	    }
	  
	    public void getList(int index,HashMap map,List<String> result,String digits,char[] ch){
	    	if(index==digits.length()){
	    		result.add(new String(ch));
	    		return;
	    	}
	    	String s=(String) map.get(digits.charAt(index));
	    	for(int i=0;i<s.length();i++){
	    		ch[index]=s.charAt(i);
	    		getList(index+1,map,result,digits,ch);
	    	}
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode17 t = new LeetCode17();
		System.out.println(t.letterCombinations("23"));
	}

}
