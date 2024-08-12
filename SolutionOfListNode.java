package LeetCode;

public class SolutionOfListNode {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        // Initialize a dummy node to act as the head of the result list
	        ListNode dummyHead = new ListNode(0);
	        ListNode current = dummyHead;
	        int carry = 0;
	        
	        // Traverse both lists
	        while (l1 != null || l2 != null) {
	            // Get the values from the current nodes (or 0 if the node is null)
	            int x = (l1 != null) ? l1.val : 0;
	            int y = (l2 != null) ? l2.val : 0;
	            
	            // Calculate the sum and the carry
	            int sum = carry + x + y;
	            carry = sum / 10;
	            
	            // Create a new node with the digit value (sum % 10)
	            current.next = new ListNode(sum % 10);
	            current = current.next;
	            
	            // Move to the next nodes in the lists
	            if (l1 != null) l1 = l1.next;
	            if (l2 != null) l2 = l2.next;
	        }
	        
	        // If there's a carry left after the last addition, add a new node with carry value
	        if (carry > 0) {
	            current.next = new ListNode(carry);
	        }
	        
	        // Return the result list, skipping the dummy head
	        return dummyHead.next;
	    }

	    public static void main(String[] args) {
	    	SolutionOfListNode solution = new SolutionOfListNode();

	        // Example 1
	        ListNode l1 = new ListNode(2);
	        l1.next = new ListNode(4);
	        l1.next.next = new ListNode(3);

	        ListNode l2 = new ListNode(5);
	        l2.next = new ListNode(6);
	        l2.next.next = new ListNode(4);

	        ListNode result = solution.addTwoNumbers(l1, l2);
	        
	        // Print the result
	        while (result != null) {
	            System.out.print(result.val);
	            if (result.next != null) System.out.print(" -> ");
	            result = result.next;
	        }
	        // Output: 7 -> 0 -> 8
	    }
	}