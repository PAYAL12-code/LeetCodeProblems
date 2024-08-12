package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Dem {
	 public static void main(String[] args) {
	        int num[] = {2,7,11,15};
	        int target1 = 9;
	        int output=0;

	        for(int i =0;i<num.length;i++){
	              for(int j= i+1;j<num.length;j++){
	               output=num[i]+num[j];
	               if(output==target1)
	            	   System.out.println("["+i+","+j+"]"+"out put="+output);
	               break;
	              }
	        }
	        
	    }
}
