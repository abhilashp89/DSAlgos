package com.abhi.algos;

import java.util.List;

import com.abhi.ds.Vertex;

public class GraphCycleDetection {
	
	public void detectCycle(Vertex root){
		dfs(root);
	}

	public void dfs(Vertex root){

		if(!root.isVisited()) 
			root.setVisited(true);
			

			for(Vertex neighborVertex:root.getNeighborVertices()){
				
				if(neighborVertex.isVisited()){
					System.out.println("Cycle Detected at "+root+" ->" +neighborVertex);
					return;
				}
					
				dfs(neighborVertex);
			}
		}

	}

