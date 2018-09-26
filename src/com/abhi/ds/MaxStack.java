package com.abhi.ds;

import java.util.Stack;

@SuppressWarnings("serial")
public class MaxStack<T extends Comparable> extends Stack {

	Stack<T> max=new Stack<T>();
	
	
	@SuppressWarnings( "unchecked")
	public void push(T item){
	
		if(max.isEmpty())
			max.push(item);
		else{
			 
			max.push(findCurrentMax(max.peek(),item));
		}
		
		super.push(item);
	}


	@SuppressWarnings("unchecked")
	private T findCurrentMax(T currMax, T item) {
		
		return currMax.compareTo(item) >= 0 ? currMax : item;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T pop(){
		
		max.pop();
		return (T) super.pop();
	}
	
	public T max(){
		
		return max.peek();
	}
	
}
