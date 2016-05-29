import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 *Given an array of strings, group anagrams together.

	For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
	Return:
	
	[
	  ["ate", "eat","tea"],
	  ["nat","tan"],
	  ["bat"]
	]
	Note:
	For the return value, each inner list's elements must follow the lexicographic order.
	All inputs will be in lower-case.
 *  */

public class LeetCode49 {
	 public List<List<String>> groupAnagrams(String[] strs) {
		 List<List<String>> result=new ArrayList<List<String>>(); 
		
		 ArrayList<String> set=new ArrayList<String>();
		//data structure,hashSet contains no duplicated element, so I choose List to store
		 HashMap<String,List<String>> map=new HashMap<String,List<String>>(); 
		 for(int i=0;i<strs.length;i++){
		
			 char[] ele=strs[i].toCharArray();
			 Arrays.sort(ele);
			 String ele_str=new String(ele);
		
			 if(map.containsKey(ele_str)){		
				map.get(ele_str).add(strs[i]);	
				
			 }else{
				 set=new ArrayList<String>();
				 set.add(strs[i]);
				 map.put(ele_str,set);
			 } 
		 }
		 Iterator iter=map.entrySet().iterator();  //get list in map
		 while(iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			ArrayList<String> s= (ArrayList<String>) entry.getValue();
			Collections.sort(s);  //sort
			result.add(s);
		 }
		 return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode49 t = new LeetCode49();
	    String num[]= {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(t.groupAnagrams(num));
	}

}
