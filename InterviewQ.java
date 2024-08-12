package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class InterviewQ {
	public int minOperations(int[] nums, int k) {
        // Initialize a set to keep track of collected elements
        Set<Integer> collected = new HashSet<>();
        
        // Initialize the number of operations to 0
        int operations = 0;
        
        // Iterate from the end of the array to the beginning
        for (int i = nums.length - 1; i >= 0; i--) {
            // Add the current element to the collected set
            collected.add(nums[i]);
            
            // Increment the number of operations
            operations++;
           
          
            // Check if we have collected all elements from 1 to k
            boolean allCollected = true;
            for (int j = 1; j <= k; j++) {
            
                if (!collected.contains(j)) {
                    allCollected = false;
                    break;
                }
            }
            
            // If all elements are collected, return the number of operations
            if (allCollected) {
                return operations;
            }
        }
        
        // If we exit the loop without collecting all elements, return -1 (which should not happen in this problem)
        return -1;
    }

    public static void main(String[] args) {
    	InterviewQ solution = new InterviewQ();
        int[] nums = {3, 1, 5, 4, 2};
        int k = 5;
        System.out.println(solution.minOperations(nums, k));  // Output: 4
    }
}