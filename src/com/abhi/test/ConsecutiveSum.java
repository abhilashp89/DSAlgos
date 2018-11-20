package com.abhi.test;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numOfPairs=getNumOfPairsWithConsecutiveSum(21);
		Map<Integer,Integer> map=new HashMap<>();
		Integer a=5;
		map.put(4, a);
		
		map.merge(7, 1,Integer::sum );
		map.merge(7, 0,Integer::sum );

		System.out.println(map);

		printA(5);
	}

	private static void printA(Integer a) {
		
		System.out.println(++a);
	}

	private static int getNumOfPairsWithConsecutiveSum(int num) {
		
		
		
		return 0;
	}

}
