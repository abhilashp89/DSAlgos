package com.abhi.algos.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Dijkstra's Algorithm is used to find shortest path between 2 vertices in given graph.
 * Graph contains positive Edge weights
 * @author Abhilash
 *
 */
public class DijkstraAlgorithm {

	/**
	 * Provide starting vertex of the graph from which minimum distance needs to be calculated
	 * @param startVertex
	 */
	public void computePath(Vertex startVertex) {
     
		//For the source vertex, distance from itself is 0.
		startVertex.setDistanceFromSource(0.0);
		
		/**
		 * Add each neighboring vertices from source/current vertex to priorityQueue.
		 * Priority Queue fetches the vertex with minimum distance from Source in our algo
		 */
		Queue<Vertex> queue=new PriorityQueue<>();
		queue.add(startVertex);
		
		while(!queue.isEmpty()) {
			
			Vertex current=queue.poll();
			
			//Fetch neighboring edges and calculate minimum distance from source and update predecessor accordingly
			for(Edge edge : current.getneighbours()){
				
				Vertex endVertex=edge.getEndVertex();
				
				Double newDistance=current.getDistanceFromSource()+ edge.getWeight();
				
				if(newDistance < endVertex.getDistanceFromSource()){
					endVertex.setDistanceFromSource(newDistance);
					endVertex.setPredecessor(current);
					queue.add(endVertex);
				}
				
			}
		}
	}
	
	/**
	 * For given targetVertex, backtrack the given graph by using predecessor and reverse order of list is 
	 * shortest path from source to target vertex in given graph
	 * @param targetVertex
	 * @return
	 */
	public List<Vertex> getShortestPathTo(Vertex targetVertex){
		
		List<Vertex> shortestPathList=new ArrayList<>();
		
		for(Vertex v=targetVertex; v != null ; v=v.getPredecessor()){
			shortestPathList.add(v);
		}
		
		Collections.reverse(shortestPathList);
		
		return shortestPathList;
	}
}
