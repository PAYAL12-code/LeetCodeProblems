package LeetCode;

public class LongestPalindromicSubString_5program {

	public static void main(String[] args) {
		String s = "babad";
		System.out.println(getLongestSub(s));
	}
	
	
	  public static String getLongestSub(String s) {
	        if (s == null || s.length() < 1) return "";

	        int start = 0, end = 0;
	        
	        for (int i = 0; i < s.length(); i++) {
	            int len1 = expandAroundCenter(s, i, i);   // Odd length palindromes
	            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
	            int len = Math.max(len1, len2);
	            if (len > end - start) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }
	        
	        return s.substring(start, end + 1);
	    }

	    private static int expandAroundCenter(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        return right - left - 1;
	    }
	
	
	
	
	
			//this method created by me 
			public static String getLogest(String s1) {
				
				String newString = "";
				String palidrom ="";
				StringBuffer hold;
				int len =0;
				for(int i=0;i<s1.length();i++) {
					for(int j=i+1;j<s1.length();j++) {
						
						newString = s1.substring(i,j);
					   // System.out.println(newString);
					    if(new StringBuffer(newString).reverse().toString().equals(newString) && newString.length()>len) {
					    palidrom=newString.toString();
					  //  System.out.println(palidrom);
						len = newString.length();
						
					}
				}
		    
				}
				return palidrom;
				
			
				
			}
			
			
			
			
		
}
