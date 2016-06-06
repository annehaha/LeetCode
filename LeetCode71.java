import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/*
 *Given an absolute path for a file (Unix-style), simplify it.

	For example,
	path = "/home/", => "/home"
	path = "/a/./b/../../c/", => "/c"
 *  */

public class LeetCode71 {
	  public String simplifyPath(String path) {
		   if(path.length()==0) return null;
	        String arr[]=path.split("/");     
	        Stack<String> stack=new Stack<String>();
	        for(int i=1;i<arr.length;i++){
	        	if(arr[i].equals("..")&&!stack.isEmpty()){
	        		stack.pop();
	        	}
	        	else if(!arr[i].equals(".")&&arr[i].length()!=0&&!arr[i].equals("..")){ //if "/a//b"->"/a/b"
	        		stack.push(arr[i]);
	        	}
	        }
	        if(stack.isEmpty()){
	        	return "/";
	        }
	        List<String> de=new ArrayList<String>(stack); //here I use Deque 
	        StringBuilder res=new StringBuilder();
	        for(int i=0;i<de.size();i++)
	        	res.append("/").append(de.get(i));
	        
	        return res.toString();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode71 t = new LeetCode71();
	    String str="/..";
		System.out.println(t.simplifyPath(str));
	}

}
