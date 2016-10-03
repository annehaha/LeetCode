import java.util.Arrays;
import java.util.HashMap;

/*
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 * */

public class LeetCode3 {
	public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        //two pointer to follow the length
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode3 t=new LeetCode3();
		String s="abdsfdrd";
		System.out.println(t.lengthOfLongestSubstring(s));
	}

}
