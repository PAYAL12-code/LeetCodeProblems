package LeetCode;

public class ReverseInteger_7program {

	public static void main(String[] args) {
		int num = 123;
		int num1 = -123;
		int num3 = 120;
		int num4 = 121;
		int num5 = -121;
		System.out.println(reverse(num1));
		System.out.println(reverse(num3));
		System.out.println(isPalindrome(num4));
		System.out.println(isPalindrome(num5));
		
		
		int rem=0,sum=0;
		
		while(num>0) {
			rem = num%10;
			sum=(sum*10)+rem;
			num = num/10;
		
	}
		System.out.println(sum);
	}
	
	 public static int reverse(int num) {
	        int rem = 0, sum = 0;
	        while (num != 0) {
	            rem = num % 10;
	            num = num / 10;

	            // Check for overflow before updating sum
	            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && rem > 7)) {
	                return 0;
	            }
	            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && rem < -8)) {
	                return 0;
	            }
	            
	            sum = (sum * 10) + rem;
	        }
	        return sum;
	    }
		
	 
	 //is palidrom or not
	 public static boolean isPalindrome(int num) {
	        // Negative numbers are not palindromes
	        if (num < 0) {
	            return false;
	        }
	        
	        int rem = 0, sum = 0;
	        int tem = num;
	        
	        while (num != 0) {
	            rem = num % 10;
	            num = num / 10;
	            sum = (sum * 10) + rem;
	        }
	        
	        return sum == tem;
	    }
	
}