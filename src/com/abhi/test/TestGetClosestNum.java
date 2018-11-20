package com.abhi.test;

public class TestGetClosestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={-4,-1,2,2,3,4,6};
		
		int target=2;
		
		int start=0;
		int end=a.length-1;
		
		while(start < end) {
			
			
			if(end - start == 1)
				break;
			
			int mid=(start + end) / 2; 
			
			if(target == a[mid]){
				end=mid;
				break;
			}
			else if( target > a[mid])
				start=mid;
			else 
				end=mid;
			
		}
		
		System.out.println("Closest number is"+a[end]);

	}

}
