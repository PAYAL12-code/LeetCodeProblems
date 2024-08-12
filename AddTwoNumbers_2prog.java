package LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
//in this programm we did 2,4,3 and 5,6,4 we reverse and add intpo coolection 342+465=708 
//2 example 342+32465=66665 in this we use carry variable ehich tacke like if two value sum is 10 so o is add in a3 collection and 1 is carry to another node;
public class AddTwoNumbers_2prog {
public static void main(String args[]) {
	int arr1[]= {2,4,3};
	int arr2[]= {5,6,4,2,3};
	Integer sum1=0;
	Integer sum2=0;
	int carry =0;
	int total=0;
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    ArrayList<Integer> a3=new ArrayList<Integer>();
     
    for(int i=arr1.length-1;i>=0;i--) {
    	a1.add(arr1[i]);
    	 }
    for(int i=arr2.length-1;i>=0;i--) {
    	a2.add(arr2[i]);
    }
    
       Iterator i1 = a1.iterator();
       Iterator i2 = a2.iterator();
        
       while (i1.hasNext() || i2.hasNext()) {
           int val1 = i1.hasNext() ? (int) i1.next() : 0;
           int val2 = i2.hasNext() ? (int) i2.next() : 0;
           int sum = val1 + val2 + carry;
           int rem = sum % 10;
           a3.add(rem);
           carry = sum / 10;
       }

       // If there's still a carry left, add it to the result
       if (carry != 0) {
           a3.add(carry);
       }
    for(int s:a3) {
    	System.out.print(s);    }
       
     
    
}


}
