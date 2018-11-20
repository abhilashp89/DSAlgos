package com.abhi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={2,7,4,0,9,5,1,3};
		int sum=20;
		int arrSize=a.length;
		
		Map<Integer,List<Pair>> map=new HashMap<>();
		
		
		for(int i=0;i<arrSize;i++){
			for(int j=i+1;j<arrSize;j++){
				
				map.computeIfAbsent(a[i]+a[j], listPair -> new ArrayList<>()).add(new Pair(i,j));

				int val=sum - (a[i] + a[j]);
				
				if(map.containsKey(val)){
					
				  for(Pair pair : map.get(val)){
					
					  Integer x=pair.p1;
					  Integer y=pair.p2;
					  
					  if(x != i && x != j && y !=i && y != j){
					  System.out.println("Elements :"+a[i]+","+a[j]+","+a[x]+","+a[y]);
					  return;
					  }
		
				  }
				  				
				}
				
			}
		}

	}
	
	
	private static class Pair {
		
		Integer p1;
		Integer p2;
		
		public Pair(int p1,int p2){
			this.p1=p1;
			this.p2=p2;
		}
		
		
	}

}
