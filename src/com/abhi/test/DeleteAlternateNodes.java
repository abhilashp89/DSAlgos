package com.abhi.test;

import com.abhi.ds.LinkedList;
import com.abhi.ds.Node;

public class DeleteAlternateNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list1=new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		LinkedList list2=new LinkedList();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		Node head1=list1.getHead();
		Node head2=list2.getHead();
		
		Node prev1=head1;
		Node curr1=head1;
		Node curr2=head2;
		
		//1->2->3 
		//4->5->6->7
		
		//1->4->2->6->3
		
		//1->4->2->6
		while(curr1 != null && curr2 !=null){
			prev1=curr1;
			Node temp=curr2;
			
			if(list2.getHead() != null)
			list2.deleteAtHead();//list2.head=list2.head.getNextNode();
			temp.setNextNode(prev1.getNextNode());
			curr1.setNextNode(temp);
			
			int i=0;
			while(i != 2 && curr2 != null){
				curr2=curr2.getNextNode();
				i++;
			}
			
			int j=0;
			while(j != 2 && curr1 != null){
				curr1=curr1.getNextNode();
				j++;
			}
						
		}
		
		
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);

	}

}
