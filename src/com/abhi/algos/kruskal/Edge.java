package com.abhi.algos.kruskal;

public class Edge implements Comparable<Edge> {

	double weight;
	Vertex sourceVertex;
	Vertex targetVertex;
	
	
	
	public Edge(double weight, Vertex sourceVertex, Vertex targetVertex) {
		this.weight = weight;
		this.sourceVertex = sourceVertex;
		this.targetVertex = targetVertex;
	}




	public double getWeight() {
		return weight;
	}




	public Vertex getSourceVertex() {
		return sourceVertex;
	}




	public Vertex getTargetVertex() {
		return targetVertex;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}




	public void setSourceVertex(Vertex sourceVertex) {
		this.sourceVertex = sourceVertex;
	}




	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}




	@Override
	public int compareTo(Edge otherEdge) {
		// TODO Auto-generated method stub
		return Double.compare(this.weight, otherEdge.weight);
	}
	
	
}
