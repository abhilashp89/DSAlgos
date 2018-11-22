package com.abhi.algos.kruskal;

import java.util.ArrayList;
import java.util.List;

public class TestKruskalAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vertex v1=new Vertex("A");
		Vertex v2=new Vertex("B");
		Vertex v3=new Vertex("C");
		
		List<Vertex> vertices=new ArrayList<>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		
		
		Edge e1=new Edge(0,v1,v2);
		Edge e2=new Edge(0,v2,v3);
		Edge e3=new Edge(0,v3,v1);
		
		List<Edge> edges=new ArrayList<>();
		edges.add(e1);
		edges.add(e2);
		edges.add(e3);
		
		KruskalAlgorithm kruskalAlgorithm=new KruskalAlgorithm();
		List<Edge> minimumSpanningTreeEdges=kruskalAlgorithm.findMinimumSpanningTree(vertices, edges);
		
		minimumSpanningTreeEdges.forEach(edge -> System.out.print(" "+edge.sourceVertex+"--"+edge.targetVertex));

	}

}
