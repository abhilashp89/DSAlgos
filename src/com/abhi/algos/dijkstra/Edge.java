package com.abhi.algos.dijkstra;

public class Edge {

	private Vertex startVertex;
	private Vertex endVertex;
	private Double weight;
	
	
	public Edge(Vertex startVertex, Vertex endVertex, Double weight) {
		this.startVertex = startVertex;
		this.endVertex = endVertex;
		this.weight = weight;
	}
	public Vertex getStartVertex() {
		return startVertex;
	}
	public Vertex getEndVertex() {
		return endVertex;
	}
	public Double getWeight() {
		return weight;
	}
	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}
	public void setEndVertex(Vertex endVertex) {
		this.endVertex = endVertex;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	
}
