package com.abhi.test;

import com.abhi.ds.MaxStack;

public class TestMaxStack {

	public static void main(String[] args) {

		
		MaxStack<Integer> maxStack=new MaxStack<>();
		maxStack.push(19);
		maxStack.push(33);
		maxStack.push(13);
		maxStack.push(90);
		maxStack.push(11);
		maxStack.push(23);
		maxStack.push(44);
		
			System.out.println(maxStack.max());
			
			maxStack.pop();
			maxStack.pop();
			maxStack.pop();
			maxStack.pop();

			System.out.println(maxStack.max());




	}

}
