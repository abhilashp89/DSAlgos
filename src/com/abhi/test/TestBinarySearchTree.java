package com.abhi.test;

import com.abhi.ds.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.insert(5);
		binarySearchTree.insert(10);
		binarySearchTree.insert(34);
		binarySearchTree.insert(2);
		binarySearchTree.insert(848);
		binarySearchTree.insert(646);
		binarySearchTree.insert(44);
		
		//binarySearchTree.inOrder();
		
		
		BinarySearchTree tree=new BinarySearchTree();
		    tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	        tree.insert(10);
	        tree.insert(15);
	        tree.preOrder();
	        System.out.println(tree.height());
	        

			
	}

}
