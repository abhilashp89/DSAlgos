package com.abhi.algos;

import java.util.ArrayDeque;
import java.util.Deque;

import com.abhi.ds.Graph;

public class BFS {

	public void doBFS(Graph graph,int vertex,boolean[] discovered){
		
		Deque<Integer> q=new ArrayDeque<>();
		
		discovered[vertex]=true;
		q.add(vertex);
		
		System.out.println(vertex);
		
		while(!q.isEmpty()){
			
			vertex=q.pop();
			for(int otherVertex:graph.getAdjacencyList().get(vertex)){
				if(discovered[otherVertex] == false)
				{
					discovered[otherVertex] = true;
					q.add(otherVertex);
				}
			}
		}
		
	}
}
