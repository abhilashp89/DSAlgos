package com.abhi.test;

import java.util.ArrayList;
import java.util.List;

import com.abhi.algos.GraphCycleDetection;
import com.abhi.ds.Vertex;

public class TestGraphCycleDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vertex v1=new Vertex("1");
		Vertex v2=new Vertex("2");
		Vertex v3=new Vertex("3");
		Vertex v4=new Vertex("4");
		Vertex v5=new Vertex("5");
		
		v1.addNeighborVertex(v2);
		v2.addNeighborVertex(v3);
		v3.addNeighborVertex(v4);
		v3.addNeighborVertex(v5);
		v3.addNeighborVertex(v1);
		
		List<Vertex> graph=new ArrayList<>();
		graph.add(v1);
		graph.add(v2);
		graph.add(v3);
		graph.add(v4);
		graph.add(v5);
		
		GraphCycleDetection graphCycleDetection=new GraphCycleDetection();
		graphCycleDetection.detectCycle(graph.get(0));
		
	}

}
