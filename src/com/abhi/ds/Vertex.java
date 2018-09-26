package com.abhi.ds;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	String data;
	boolean isVisited;
	boolean isBeingVisited;
	List<Vertex> neighborVertices;
	
	public Vertex(String data){
		this.data=data;
		this.neighborVertices=new ArrayList<>();
	}
	
	public void addNeighborVertex(Vertex vertex){
		this.neighborVertices.add(vertex);
	}

	public String getData() {
		return data;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public boolean isBeingVisited() {
		return isBeingVisited;
	}

	public List<Vertex> getNeighborVertices() {
		return neighborVertices;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public void setBeingVisited(boolean isBeingVisited) {
		this.isBeingVisited = isBeingVisited;
	}

	public void setNeighborVertices(List<Vertex> neighborVertices) {
		this.neighborVertices = neighborVertices;
	}

	@Override
	public String toString() {
		return data;
	}
	
	
}
