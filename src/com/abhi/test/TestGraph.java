package com.abhi.test;

import java.util.Arrays;
import java.util.List;

import com.abhi.ds.Edge;
import com.abhi.ds.Graph;

public class TestGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Edge> edges=Arrays.asList(new Edge(0,1),new Edge(1,2),new Edge(1,3),new Edge(3,4));
		Graph graph=new Graph(edges,5);
		
		graph.printGraph();
	}

}
