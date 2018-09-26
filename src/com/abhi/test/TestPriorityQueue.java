package com.abhi.test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(12);
		pq.add(4);
		pq.add(1);
		pq.add(23);	
		pq.add(848);
		pq.add(42);
		pq.add(44);
		
		System.out.println(pq);
		
		int k=3;
		for(int i=0;i<k-1;i++){
			pq.poll();
		}

		System.out.println(pq.peek());
	}

}
