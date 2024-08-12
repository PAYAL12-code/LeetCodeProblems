package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class FindLogenstSubString_3Program {

	public static void main(String[] args) {
		String s = "abcabcbb";
		//Input: s = "abcabcbb"
		//Output: 3
	//	Explanation: The answer is "abc", with the length of 3.
		System.out.println(lengthOfLongestSubstring(s));
		
		
	//	int lengthIs = getLogestSub(s);
		//System.out.println(lengthIs);
		
	}
	
	
	
	
	public static int lengthOfLongestSubstring(String s) {
        // Initialize a set to keep track of characters in the current window
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0, j = 0;
        
        // Use a sliding window approach
        while (i < s.length() && j < s.length()) {
            // Try to extend the range [i, j]
            if (!set.contains(s.charAt(j)) ) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                // If character at j is already in the set, remove character at i and move i forward
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return maxLength;
    }
	
	
	//this method created by me 
	public static int getLogestSub(String s1) {
		
		String newString = "";
		StringBuffer hold;
		int len =0;
		for(int i=1;i<s1.length();i++) {
			for(int j=i+1;j<s1.length()-1;j++) {
				
				
				
				newString = s1.substring(i,j);
			    hold =  new StringBuffer(newString);
			    
			    
			    if(hold.reverse().equals(hold) && hold.length()>len) {
			    
				len = hold.length();
				
			}
		}
    
		}
		return len;
		
	
		
	}
	
	
}
