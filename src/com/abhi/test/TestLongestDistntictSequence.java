package com.abhi.test;

import java.util.HashSet;
import java.util.Set;

public class TestLongestDistntictSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[128];
		
		String str="bbdbdbdbdmcbdbdbdbdbdbdbdbd";
		String longestSequence=getLongestDistinctSequence(str,4);
		System.out.println(longestSequence);

	}

	private static String getLongestDistinctSequence(String str, int k) {
		
		
		Set<Character> window=new HashSet<>();
		int[] freq=new int[128];
		
		int begin=0;
		int end=0;
		
		for(int low=0,high=0;high<str.length();high++){
			
			window.add(str.charAt(high));
			freq[str.charAt(high)]++;
			
			
				
				while(window.size() > k){
				
				if(--freq[str.charAt(low)] == 0)
					window.remove(str.charAt(low));
				
				low++;
			}
			
			
				if(end - begin < high - low)
				{
					end = high;
					begin = low;
				}
			
				
			
		}
		
		
		
		
		return str.substring(begin, end);
	}

}
