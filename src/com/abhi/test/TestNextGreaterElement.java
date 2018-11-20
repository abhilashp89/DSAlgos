package com.abhi.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestNextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr=new int[]{9,67,19,6,32};
		Stack<Integer> stack=new Stack<>();
		int[] resultArr=new int[arr.length];
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=arr.length-1;i>=0;i--){
			
			int next=arr[i];
			map.put(arr[i],i);
			while(!stack.isEmpty() && stack.peek() <= next){
				stack.pop();
			}
			
			resultArr[i] = (stack.isEmpty() ? -1 : map.get(stack.peek()))+1;
			
			stack.push(arr[i]);
			
		}
		
		Arrays.stream(resultArr).forEach(i-> System.out.print(i+" "));
		map.clear();
	
		Stack<Integer> rStack=new Stack<>();
		int[] rResultArr=new int[arr.length];
		//9,67,19,6,32
		
		for(int i=arr.length-1;i>=0;i--){
			
			int next=arr[i];
			map.put(arr[i],i);
			
			
			if(!rStack.isEmpty() && rStack.peek() >= next)
				rResultArr[i]=map.get(rStack.peek())+1;
			else 
				rResultArr[i]=0;
			
			rStack.push(arr[i]);
			
		}
		System.out.println();
		Arrays.stream(rResultArr).forEach(i-> System.out.print(i+" "));

	}

}
