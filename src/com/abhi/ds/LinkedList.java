package com.abhi.ds;


public class LinkedList  implements Cloneable {

	private Node head;
	
	public void addToHead(Object data) {
		/**
		 * 1.Create new node.
		 * 2.Point new node's nextNode to head of LinkedList
		 * 3.Point head to newNode
		 */
		
		Node newNode=new Node(data);
		newNode.setNextNode(this.head);
		this.head=newNode;
	}
	
	public int length() {
		int length=0;
		
		Node current=this.head;
		
		while(current != null){
			length+=1;
			current=current.getNextNode();
		}
		
		return length;
	}
	
	public void add(Object data) {
		
		/**
		 * 1.Iterate till end.
		 * 2.Point last node to current node
		 * 3.add new node's next node to null
		 */
		
		if(this.head == null)
		{
			this.head=new Node(data);
			return;
		}
		
		Node newNode=new Node(data);
		
		
      Node current=this.head;
		
		while(current.getNextNode() != null) 
			current=current.getNextNode();
	
		current.setNextNode(newNode);
		newNode.setNextNode(null);
		
	}
	
	 public void deleteAtHead() {
		 this.head= this.head.getNextNode();
	 }
	 
	 public void addAfter(Object prevElement,Object element) {
		 
		 if(this.head != null && this.head.getData() == prevElement) {
			 Node nextNode=this.head.getNextNode();
			 Node newNode=new Node(element);
			 newNode.setNextNode(nextNode);
			 this.head.setNextNode(nextNode);
			 return;
		 }
		 
		 Node currentNode=this.head;
		 
		 while(currentNode != null && currentNode.getNextNode() != null) {
			 
			 if(currentNode.getData() == prevElement) {
				 Node nextNode=currentNode.getNextNode();
				 Node newNode=new Node(element);
				 newNode.setNextNode(nextNode);
				 currentNode.setNextNode(newNode); 
				 
				 return;
			 }
			 
			 currentNode= currentNode.getNextNode();
			 
			 if(currentNode.getNextNode() == null && currentNode.getData() == prevElement){
				 currentNode.setNextNode(new Node(element));
				 return;
			 }
		 }
		 
		 System.out.println(prevElement +" not present in linked list");
	 }
	 
	 public void addAtPosition(Node head,int data,int position){
		 
		
		 Node newNode=new Node(data);
		 
		 if(this.head == null)
			 this.head=newNode;
		 
		 if(position ==0) {
			 
			 newNode.setNextNode(this.head);
				this.head=newNode;
				return;
			
		 }
			 
		 
		 Node currentNode=head;
		 Node prevNode=head;
		 int currentPosition=0;
		 
		 while(currentNode != null && currentPosition != position ) {
			 prevNode=currentNode;
			 currentNode=currentNode.getNextNode();
			 ++currentPosition;
		 }
			
		 Node nextNode=null;
		 if(currentNode != null) {
			 nextNode=currentNode.getNextNode();
			 currentNode.setNextNode(newNode);
			 newNode.setNextNode(nextNode);
		 }else {
			 prevNode.setNextNode(newNode);
		 }
		 
	 }
	 
	 public void deleteNodeAtPosition(Node head, int position) {
		 
		 if(head == null)
			 return;

		 if(position < 0){
			 System.out.println("No node exists at given position");
			 return;
		 }

		 
		 if(position == 0) {
			 this.head=head.getNextNode();
			 return;
		 }
		 
		 Node currentNode=head;
		 
		 /**
		  * Have 2 node pointers . one stores node at current position
		  * one stores node before position. 
		  * set prevNode with nextNode.
		  */
		 Node prevNode=head;
		 int currentPosition=0;
		 while(currentNode != null && currentPosition != position){
			 
			 prevNode=currentNode;
			 currentNode = currentNode.getNextNode();
			 ++currentPosition;
			 
		 }
		 System.out.println(" currentPosition ="+currentPosition);
		 if(currentPosition <= position){
			 System.out.println("No node exists at given position");
			 return;
		 }

		 prevNode.setNextNode(currentNode != null ? currentNode.getNextNode() : null);	
		 
	 }
	 
	 public Node reverseLinkedList(Node head){
		 
		 if(head == null){
			System.out.println("Linked List Empty"); 
			 return head;
		 }
		 
	
		 
		//[777 ->23 ->12 
		
		  
		 Node previousNode=null,nextNode=null;
		 Node currentNode=head;
		 while(currentNode != null) {
			nextNode=currentNode.getNextNode();
			currentNode.setNextNode(previousNode);
			previousNode=currentNode;
			currentNode=nextNode;
		 }
		 
		 this.head=previousNode;
		
		 return this.head;
		
	 }
	 
	 public void print(Node node){
		
		 while(node != null){
			 System.out.print(node.getData()+ " ->");
			 node=node.getNextNode();
		 }
	 }
	 
	 
	public Node mergeLists(Node headA, Node headB) {
		  	// This is a "method-only" submission. 
		  	// You only need to complete this method 
		    
		    //5 -> 6
		    //4-> 6->7
		    //4->5->6->6->7  
		    return mergeSortList(headA,headB);


		}

		private Node mergeSortList(Node headA,Node headB){
		    
		   Node sortedNode=mergeSort(headA,headB,null);
		    
		    return sortedNode;
		    
		}

		private Node mergeSort(Node headA,Node headB,Node sortedNode){
		    
		    Node currentNodeA=headA;
		    Node currentNodeB=headB; 
		    
		     
		    if(currentNodeA == null && currentNodeB == null)
		        return sortedNode;
		    
		    if(currentNodeA == null) {
		    	
		    	System.out.println("currentNodeA is null");
		        while(currentNodeB != null) {
		            sortedNode=addNewNode(sortedNode,currentNodeB);
		            currentNodeB=currentNodeB.getNextNode();
		        }
		        
		        return sortedNode;
		    }
		    
		    if(currentNodeB == null) {
		    	System.out.println("currentNodeB is null");

		    	while(currentNodeA != null) {
		            sortedNode=addNewNode(sortedNode,currentNodeA);
		            currentNodeA=currentNodeA.getNextNode();
		        }
		        
		        return sortedNode;
		    }
		        
		   
		    if((Integer)currentNodeA.getData() < (Integer)currentNodeB.getData()){
		      	sortedNode=addNewNode(sortedNode,currentNodeA);
		        sortedNode.setNextNode(currentNodeB);
		    }
		    else{
		        sortedNode=addNewNode(sortedNode,currentNodeB);
		        sortedNode.setNextNode(currentNodeA);
		    }
		        
		    currentNodeA=currentNodeA.getNextNode();
		    currentNodeB=currentNodeB.getNextNode();
		    
		    System.out.println("currentNodeA="+currentNodeA);
		    System.out.println("currentNodeB="+currentNodeB);
		    
		    return mergeSort(currentNodeA,currentNodeB,sortedNode);
		}

		private Node addNewNode(Node sortedNode,Node newNode){
		    
		    if(sortedNode == null) {
		    	
		        sortedNode=new Node(newNode != null ? newNode.getData() : null);
		    	System.out.println(sortedNode);

		         return sortedNode;
		    }
		    
		    Node currentNode=sortedNode;
		    Node lastNode=sortedNode;
		    
		    while(currentNode != null) {
		        lastNode=currentNode;
		        currentNode=currentNode.getNextNode();
		    }
		    
		    lastNode.setNextNode(newNode);
		    
		    return sortedNode;
		}

	public Node getHead() {
		return head;
	}

	@Override
	public String toString() {
		
		StringBuffer linkedList=new StringBuffer();
		linkedList.append("[");
		
		Node current=this.head;
		while(current != null) {
			linkedList.append(current.getData()).append(" ->");
			current=current.getNextNode();
		}
		linkedList.append("]");
		return linkedList.toString();
	}
	
	public Object clone(){
		Object o = null;
	    try {
	      o = super.clone();
	    } catch(CloneNotSupportedException e) {
	      System.err.println("MyClass  can't clone");
	    }
	    return o;
	}
	
	
}
