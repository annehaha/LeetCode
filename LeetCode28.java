
/*
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 *  */

public class LeetCode28 {

public int strStr(String haystack, String needle) {
      
    	  return haystack.indexOf(needle);  //java is a great language
  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode28 t = new LeetCode28();
	
		System.out.println(t.strStr("578bjjk", "bj"));
	}

}
