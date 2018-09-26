package com.abhi.ds;

import java.util.ArrayList;
import java.util.List;


public class Graph {
		
		private List<List<Integer>> adjacencyList=null;
		
		public Graph(List<Edge> edges,int N){
		
			adjacencyList=new ArrayList<>(N);
			
			for(int i=0;i<N;i++)
				adjacencyList.add(i,new ArrayList<>());
				
			for(Edge edge:edges){
				
				adjacencyList.get(edge.source).add(edge.destination);
			}
			
				
			}
		
		public void printGraph(){
			
			int n=this.adjacencyList.size();
			
			for(int i=0;i<n;i++){
				for(int j=0;j<adjacencyList.get(i).size();j++) {
					System.out.println(i+" -> "+adjacencyList.get(i).get(j));
				}
			}
		}

		public List<List<Integer>> getAdjacencyList() {
			return adjacencyList;
		}
		
		
			
		}
		

