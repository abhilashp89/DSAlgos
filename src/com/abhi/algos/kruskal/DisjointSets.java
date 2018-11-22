package com.abhi.algos.kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjointSets {

	private int nodeCount;
	private int setCount;
	private List<Node> rootNodes;
	
	public DisjointSets(List<Vertex> vertices){
		this.rootNodes=new ArrayList<>(vertices.size());
		makeSet(vertices);
	}
	
	/**
	 * For each vertex,builds a disjoint set with number of nodes equals to number of vertices.
	 * Initially, each node is disjoint to every other node
	 * @param vertices
	 */
	private void makeSet(List<Vertex> vertices){
		
		if(vertices.isEmpty())
			return;

		vertices.forEach(vertex -> makeSet(vertex));
		
	}

	private void makeSet(Vertex vertex) {
		
		Node node=new Node(0, this.rootNodes.size(), null);
		vertex.setNode(node);
		this.rootNodes.add(node);
		this.nodeCount++;
		this.setCount++;
		
	}
	
	/**
	 * Finds the representative/top most node in the hierarchy as parent node in given disjoint set for given node.
	 * Once found,we map update the parent node as root node for given node.
	 * @param node
	 * @return
	 */
	public int find(Node node){
		
		Node currentNode=node;
		Node rootNode=node;
		
		while(currentNode != null){
			 rootNode=currentNode;
			 currentNode=currentNode.getParent();
		}
		
		 currentNode=node;
		 while(currentNode != rootNode){
			 
			 Node temp=currentNode.getParent();
			 currentNode.setParent(rootNode);
			 currentNode=temp;
		 }
		
		return rootNode.getId();
	}
	
	/**
	 * Merges 2 nodes into one disjoint set.
	 * If both nodes belong to same parent, exits the method , 
	 * otherwise maps the node to the one of the parent node whichever 
	 * has higher rank(have more elements as children in the hierarchy)
	 * and reduce number of disjoint sets. 
	 * 
	 * Initially there will be disjoint sets equal to number of vertices,as union happens,
	 * those disjoint sets number is reduced.
	 * @param node1
	 * @param node2
	 */
	public void union(Node node1,Node node2){
		
		int index1=find(node1);
		int index2=find(node2);
		

		if(index1 == index2)
			return;
		
		Node parent1=this.rootNodes.get(index1);
		Node parent2=this.rootNodes.get(index2);

		
		
		if(parent1.getRank() < parent2.getRank()){
			parent1.setParent(parent2);
		}else if(parent1.getRank() > parent2.getRank()){
			parent2.setParent(parent1);
		}else {
			parent2.setParent(parent1);
			parent1.setRank(parent1.getRank()+1);
		}
		
		this.setCount--;

	}
	
}
