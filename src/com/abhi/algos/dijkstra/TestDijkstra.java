package com.abhi.algos.dijkstra;

public class TestDijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vertex v0=new Vertex("A");
		Vertex v1=new Vertex("B");
		Vertex v2=new Vertex("C");
		Vertex v3=new Vertex("D");
		Vertex v4=new Vertex("E");
		
		v0.addneighbours(new Edge(v0,v1, 1.0));
		v1.addneighbours(new Edge(v1,v2, 1.0));
		v2.addneighbours(new Edge(v2,v3, 1.0));
		v3.addneighbours(new Edge(v3,v4, 1.0));
		v0.addneighbours(new Edge(v0,v4, 10.0));

		
		DijkstraAlgorithm dijkstraAlgorithm=new DijkstraAlgorithm();
		dijkstraAlgorithm.computePath(v0);
		System.out.println(dijkstraAlgorithm.getShortestPathTo(v4));


	}

}
