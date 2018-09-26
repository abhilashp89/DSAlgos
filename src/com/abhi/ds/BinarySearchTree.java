package com.abhi.ds;

import java.util.Stack;

public class BinarySearchTree {
	
	private TreeNode root;
	
	
	public BinarySearchTree() {
		this.root = null;
	}
	public void insert(Integer data){
		root=addNode(root,data);
	}
	private TreeNode addNode(TreeNode root,Integer data) {
		
		if(root == null) {
			root=new TreeNode(data);
		}
		
		if(data < root.getData()) {
			root.leftChild=addNode(root.leftChild, data);
		}
		
		if(data > root.getData()) {
			root.rightChild=addNode(root.rightChild, data);
		}
		
		return root;
	}
	
	
	public void inOrder(){
		inOrderRec(root);
	}
	
	private void inOrderRec(TreeNode root) {
		
		if(root != null) {
			inOrderRec(root.leftChild);
			System.out.println(root);
			inOrderRec(root.rightChild);
			
		}
	}
	
	public void inOrderIterative(){
		inOrderIterative(root);
	}
	
	private void inOrderIterative(TreeNode root){
		Stack<TreeNode> stack=new Stack<>();
		
		TreeNode current=root;
		
		while(current != null || !stack.isEmpty()) {
			
			if(current != null) {
				stack.push(current);
				current = current.leftChild;
				
			}else {
				current=stack.pop();
				System.out.println(current);
				current=current.rightChild;
			}
		}
	}
	
	public void postOrder(){
		postOrderRec(root);
	}
	
	private void postOrderRec(TreeNode root) {
		
		if(root == null)
			return;
		
		postOrderRec(root.leftChild);
		postOrderRec(root.rightChild);
		System.out.println(root);
	}
	
	public void postOrderIterative() {
		postOrderIterative(root);
	}
	
	private void postOrderIterative(TreeNode root) {
		
		Stack<TreeNode> stack=new Stack<>();
		Stack<TreeNode> out=new Stack<>();

		stack.push(root);
		
		while(!stack.isEmpty()){
			
			TreeNode current=stack.pop();
			out.push(current);
			
			if(current.leftChild != null) {
				stack.push(current.leftChild);
			}
			if(current.rightChild != null) {
				stack.push(current.rightChild);
			}
			
		}
		
		while(!out.isEmpty()) {
			System.out.println(out.pop());
		}
		
	}
	
 	public void preOrder(){
	
 		preOrderRec(root);
	}
	
 	private void preOrderRec(TreeNode root) {
		// TODO Auto-generated method stub
 		
 		if(root == null)
 			return;
 		System.out.println(root);
 		
 		preOrderRec(root.leftChild);
 		preOrderRec(root.rightChild);
		
	}
 	
 	public void preOrderIterative(){
 		preOrderIterative(root);
 	}
	
 	
 	private void preOrderIterative(TreeNode root) {
		// TODO Auto-generated method stub
	
 		if(root == null)
 			return;
 		
 		Stack<TreeNode> stack=new Stack<>();
 		
 		stack.push(root);
 		 		
 		while(!stack.isEmpty()){
 		
 			TreeNode currentNode=stack.pop();
 			
 			System.out.println(currentNode);
 			
 			if(currentNode.rightChild != null)
 				stack.push(currentNode.rightChild);
 			
 			if(currentNode.leftChild != null)
 				stack.push(currentNode.leftChild);
 				
 		}	
	}
 	
 	public int height(){
 		return height(root);
 	}
	private int height(TreeNode root) {
		
		if(root == null)
		return 0;
		
		return Math.max(height(root.leftChild),height(root.rightChild)) +1;
			
	}
	
	
	public void delete(Integer data){
		
	}
}
