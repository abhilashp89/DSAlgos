package com.abhi.algos.kruskal;

public class Vertex {

	String name;
	Node node;
	
	public Vertex(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public Node getNode() {
		return node;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
}
