package com.abhi.test;

import java.util.Arrays;

public class TestPairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] A = { 8, 7, 2, 5, 3, 1 };
		 int[] B = { 1,2,3,5,7,8 };

	        int sum = 10;
	        
	        
	       
	        
	        Arrays.sort(A);
	        int low=0;
	        int high=A.length-1;
	       
	         
	        while(low < high) {
	        	
	        	if(A[low]+ A[high] == sum) {
	        		
	        		System.out.println("Pair found at ("+low+","+high+")");
	        		return;
	        	}
	        	
	        	else if (sum > A[low] + A[high]) {

	        		low++;
	        	}else {
	        		high--;
	        	}
	        		        	
	        }

	}

}
