package com.abhi.test;

import com.abhi.ds.LinkedList;
import com.abhi.ds.Node;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList linkedList=new LinkedList();
		linkedList.addToHead(12);
		linkedList.addToHead(3);
		linkedList.addToHead(7);
		linkedList.addToHead(4);
		linkedList.addToHead(9);
		
		System.out.println(linkedList.toString());
		System.out.println("LinkedListLength="+linkedList.length());
		
		linkedList.deleteAtHead();
		linkedList.deleteAtHead();
		

		System.out.println(linkedList.toString());
		
		
		//add at the end
		LinkedList linkedListAdd=new LinkedList();
		linkedListAdd.add(3);
		linkedListAdd.add(10);
		linkedListAdd.add(1);
		linkedListAdd.add(4);
		
		System.out.println(linkedListAdd.toString());
		
		//Add after n after m.
		
		System.out.println("addAfter");
		linkedListAdd.addAfter(4, 12);
		
		System.out.println(linkedListAdd.toString());

		
		
		LinkedList list=new LinkedList();
		list.add(23);
		list.add(12);
		list.add(2);
		list.add(37);
		list.add(94);
		list.add(345);
		list.addAtPosition(list.getHead(), 777, 0);
		
		System.out.println(list.toString());

	//	list.deleteNodeAtPosition(list.getHead(),7);
		
		System.out.println(list.toString());
		
		
		System.out.println("Reverse");

		
		//TODO : Fix reversing linkedList
		Node node=list.reverseLinkedList(list.getHead());
		list.print(node);
		
		LinkedList sortedList1=new LinkedList();
		sortedList1.add(2);
		sortedList1.add(4);
		
		LinkedList sortedList2=new LinkedList();
		sortedList2.add(3);
		sortedList2.add(5);
		
		Node sortedNode=sortedList1.mergeLists(sortedList1.getHead(),sortedList2.getHead());
		sortedList1.print(sortedNode);
		
		



		


	}

}
