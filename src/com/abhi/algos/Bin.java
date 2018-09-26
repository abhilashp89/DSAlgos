package com.abhi.algos;

import java.util.ArrayList;
import java.util.List;

public class Bin {
	
	int capacity;
	int currentSize;
	List<Integer> items=new ArrayList<>();
	
	
	public boolean put(Integer item){
		
		if(this.currentSize +item > this.capacity)
			return false;
		
		this.items.add(item);
		this.currentSize+=item;
		
		return true;
		
			
		
	}

}
