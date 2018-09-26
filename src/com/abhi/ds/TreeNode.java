package com.abhi.ds;

public class TreeNode {
	
	private Integer data;
	public TreeNode leftChild;
	public TreeNode rightChild;

	public TreeNode(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}
	
	
	
	

}
