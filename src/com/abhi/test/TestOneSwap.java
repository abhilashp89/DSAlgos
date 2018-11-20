package com.abhi.test;

import java.util.Arrays;

public class TestOneSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] arr={3,5,6,9,8,7};
		 
		 
		 int x = -1, y=0;
		 int prev=arr[0];
		 
		 for(int i=1;i<arr.length;i++){
			 
			 if(prev > arr[i])
			 {
				 if(x == -1){
					 
					 x=i-1;
					 y=i;
				 }else
				 {
					 y=i;
				 }
				 
			 }
			 
			 prev=arr[i];
			 
		 }
		 
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
		 
		System.out.println(Arrays.toString(arr));
 	}

}
