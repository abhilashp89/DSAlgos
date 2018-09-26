package com.abhi.ds;

public class Node {

	private Node nextNode;
	private Object data;
	
	
	
	
	public Node(Object data) {
		super();
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Object getData() {
		return data;
	}
	
	@Override
	public String toString() {
		return "Node [nextNode=" + nextNode + ", data=" + data + "]";
	}
	
	
	
	
}


