package com.abhi.test;

import java.util.Arrays;
import java.util.Scanner;

public class TestMedian {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[] arr=new int[n];
		
		int i=0;
		while(i < n){
		  
		  sortArray(arr,i,scanner.nextInt());
		  int m=i/2;
		  if((i+1)%2 == 0){			  
			  System.out.println((arr[m]+arr[m+1])/2);
		  }else{
			  
			  System.out.println(arr[m]);
		  }
		  
		  i++;
		  
		}
		
		}
		
		private static void sortArray(int[] arr,int count,int num){
		    
		    if(count == 0){
		      arr[count]=num;
		      return;
		    }
		      
		    
		    
		    int start=0;
		    int end=count;
		    
		    while(start < end){
		    	
		    	if(end - start == 1)
		    		break;
		    	
		    	int mid= (start+end)/2;
		    	
		    	if(num == arr[mid]){
		    		start=mid;
		    		break;
		    	}else if(num > arr[mid])
		    		start=mid;
		    	else
		    		end=mid;
		    	
		    }
		    	
		      
		   for(int i=start;i<count;i++){
			  
		       if(num < arr[i]){
		           
		           int temp=arr[i];
		           arr[i] = num;
		           
		           for(int j=i+1;j<=count;j++){
		               int k=arr[j];
		               arr[j]=temp;
		               temp=k;
		               
		           }
		           
		           return;
		       }
		   } 
		   
		   arr[count]=num;
		   
		}
		
	}


