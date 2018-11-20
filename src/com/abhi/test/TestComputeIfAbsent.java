package com.abhi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestComputeIfAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,ArrayList<Integer>> map=new HashMap<>();
		
		map.computeIfAbsent("Abc", list -> new ArrayList<>()).add(1);

	}

}
