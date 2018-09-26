//package com.abhi.test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestBumpyNum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	
//	// Bumpy numbers: each neighboring digit differs at most by one
//
//	// Pos ex: 123456, 23432343456, 111111, 0, 1, 2, 
//	// Neg ex: 23459, 789324
//
//	// Write a routine given integer n -- the function will return list (or print list) of all bumpy numbers upto n
//
//	// don't need to consider negative numbers
//
//
//	public List<Integer> getBumpyNumber(int n){
//
//
//	  List<Integer> bumpyList=new ArrayList<>();
//	  
//	  for(int i=0;i<=n;i++){
//	  
//	    
//	    if(i< 12 ){
//	    
//	   
//	    bumpyList.add(Integer.valueOf(i));
//	    
//	    } 
//	    
//	            int current=bumpyList.get(bumpyList.size()-1);
//
//	         if(isBumpy(current,i)){
//	         
//	           bumpyList.add(Integer.valueOf(i));
//	         
//	         }
//
//	    return bumpyList;
//	  
//	  }
//	  
//	  private boolean isBumpy(int current, int next){
//	  
//	    //13 , 13 
//	    
//	    
//	    boolean isBumpy=true;
//	    
//	    int[] arr=new int[];
//	     Stack<Integer> stack=new Stack<>();    
//	    
//	    while(current != 0) {
//	    
//	      int digit=current%10;
//	      stack.push(digit);
//	      current=current/10;
//	    }
//	    
//	     while(next != 0) {
//	    
//	      Integer digit=current%10;
//	      stack.push(digit);
//	      next=next/10;
//	    }
//	    
//	    //1,2,2,1
//	    int i=0;
//	    while(!stack.isEmpty()){
//	    
//	      arr[i]=stack.pop();
//	      i++;
//	    
//	    }
//	    
//	    
//	    int n=arr.length;
//	    for(int i=0;i<n;i++) {
//	      
//	        if(i+1 < n &&  arr[i+1] - arr[i]  > 1 ) {
//	        
//	        isBumpy = false;
//	        break;
//	        }
//	        
//	    }
//	  
//	  
//	    return isBumpy;
//	  }
//
//	}
//
//}
