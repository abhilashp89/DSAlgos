package com.abhi.algos.kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Kruskal Algorithm helps us to find minimum spanning tree in the given graph.
 * Spanning tree is sub graph which can be formed using all vertices of given graph,but need not contain all the edges.
 * Minimum spanning tree is sub graph that can be formed using edges that have least weight.
 * We use disjoint sets in Kruskal Algorithm to decide if we should include an edge depending on the weight criteria.
 * @author Abhilash
 *
 */
public class KruskalAlgorithm {

	/**
	 * For given List of vertices and edges of graph,sorts edges in ascending order to pick edges with less weight,
	 * For each edge,checks if the vertices of given edge or disjoint(have no elements in common),if they are disjoint
	 * we consider that edge and add it to the list and as we have already considered the edge, 
	 * we join those vertices into one set (union) and keep finding other edge criteria of inclusion using updated 
	 *  disjoint sets 
	 * @param vertices
	 * @param edges
	 * @return List of edges using which minimum spanning tree can be formed.
	 */
	public List<Edge> findMinimumSpanningTree(List<Vertex> vertices,List<Edge> edges){
		
		DisjointSets disjointSet=new DisjointSets(vertices);
		List<Edge> minimumSpanningTree=new ArrayList<>(edges.size());
		Collections.sort(edges);
		
		 for(Edge edge:edges){
			
			Vertex sourceVertex=edge.getSourceVertex();
			Vertex targetVertex=edge.getTargetVertex();
			
			//If two vertices doesn't belong to same set,we can consider that edge for minimum spanning tree.
			if(disjointSet.find(sourceVertex.getNode()) != disjointSet.find(targetVertex.getNode())){
				
				minimumSpanningTree.add(edge);
				disjointSet.union(sourceVertex.getNode(), targetVertex.getNode());
			}
		 }
			
		return minimumSpanningTree;
	}
}
