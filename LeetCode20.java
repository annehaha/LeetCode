import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

 *  */

public class LeetCode20 {
		
	public boolean isValid(String s) {
		Stack stack=new Stack();    //data structure for this problem
		Map<Character,Character> map= new HashMap<Character,Character>(); //for storage
		map.put('}','{');
		map.put(']','[');
		map.put(')','(');
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
        		stack.push(s.charAt(i));
        	}
        	else  if(s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']'){
        		char items=s.charAt(i);
        		char item_pair=(char)map.get(items);
        		if(!stack.isEmpty()){
	        		char c=(char) stack.pop();
	        		if(c==item_pair && i==s.length()-1 && stack.isEmpty())return true;
	        		if(c!=item_pair || i==s.length()-1)return false;
        		}
        	}    
        }
		return false;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode20 t = new LeetCode20();
		System.out.println(t.isValid("({}"));
	}

}
