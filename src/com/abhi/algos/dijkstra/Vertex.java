package com.abhi.algos.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

	private String name;
	private Vertex predecessor;
	private Double distanceFromSource=Double.MAX_VALUE;
	private List<Edge> neighbours;
	boolean visited;
	
	
	public Vertex(String name) {
		
		this.name = name;
		this.neighbours=new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public Vertex getPredecessor() {
		return predecessor;
	}
	public Double getDistanceFromSource() {
		return distanceFromSource;
	}
	public List<Edge> getneighbours() {
		return this.neighbours;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}
	public void setDistanceFromSource(Double distanceFromSource) {
		this.distanceFromSource = distanceFromSource;
	}
	public void addneighbours(Edge neigbour) {
		this.neighbours.add(neigbour);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		// TODO Auto-generated method stub
		return Double.compare(this.distanceFromSource,otherVertex.distanceFromSource);
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
	
}
