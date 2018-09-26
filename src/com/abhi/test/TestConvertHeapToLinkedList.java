package com.abhi.test;

import java.util.PriorityQueue;

import com.abhi.ds.LinkedList;

public class TestConvertHeapToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(10);
		queue.add(3);
		queue.add(293);
		queue.add(37);
		queue.add(81);
		queue.add(12);
		
		LinkedList list=new LinkedList();
		while(queue.size() > 0){
			
			list.add(queue.poll());
		}
		
		System.out.println(list);
	}

}
