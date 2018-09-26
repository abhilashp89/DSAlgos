package com.abhi.test;

import com.abhi.ds.LinkedList;

public class TestCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list1=new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		
		LinkedList list2=(LinkedList) list1.clone();
		
		System.out.println("List 1 after cloning and not modifying on list2 :"+list1.toString());
		
		list2.add(6);
		System.out.println("List 2 after adding 6 :"+list2.toString());
		
		System.out.println("List 1 after adding 6 :"+list1.toString());
		
		

	}

}
