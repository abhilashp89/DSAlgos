package com.abhi.test;

public class TestSwap {

	static int[] a={6,77,1,4,90,234,2,9};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	     for(int i=1;i<a.length;i++) {
	    	 
	    	 /**
	    	  * 6,77,1,4,90,234,2,9
	    	  * Sort in asc 1,2,4,6,9,77,90,234
	    	  */
	    	 
	    			 swap(i);
	    	 }
	     
	     
	     for(int i=0;i<a.length;i++) {
	    	 System.out.print(a[i]+ " ");
	     }

	}

	private static void swap(int i) {
		// TODO Auto-generated method stub
		
		//6,77,1,4,90,234,2,9
		
	
		if(i< a.length && a[0] > a[i]) {
			
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
		}
		
			
		
		
		
	}
	
	

}
