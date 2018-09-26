package com.abhi.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class TestCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="aabbbbbbbbccbcbcbcbcbcbcbcbccddde";
		int k=4;
		String longSubStr=longSubString(string,k);
		System.out.println(longSubStr);
	}

	private static String longSubString(String string, int k) {
		
		/**
		 * aabbcccd
		 * Possibilities : aabb , bbccc, cccd
		 */
		int beginIndex=0,endIndex=0,longSubStr=0,subBeginIndex=0,subEndIndex=0;
		Set<Character> set=new HashSet<>();
		Map<Character,Integer> charLastOccuredIndexMap=new HashMap<>();
		
		for(int i=0;i<string.length();i++)
			set.add(string.charAt(i));
		
		if(set.size() <= k)
			return string;
		else
			set.clear();
		
		for(int low=0,high=0;high < string.length() ; high++ ){
			/**
			 * aabbcccd
			 * Iterate as long as we encounter 3rd item in set.
			 * find beginIndex, endIndex 
			 * See if this difference comprises of long Sub String 
			 * Remove first character and point beginIndex to next first occurrence of character.
			 * Once 3rd element is encountered, repeat above steps.
			 */
			set.add(string.charAt(high));
			charLastOccuredIndexMap.put(string.charAt(high), high);
			if(set.size() > k) {

				set.remove(string.charAt(low));
				endIndex=high-1;
				if(longSubStr < endIndex-beginIndex+1) {
					longSubStr=endIndex-beginIndex+1;
					subEndIndex=endIndex;
					subBeginIndex=beginIndex;
				}
				
				beginIndex=charLastOccuredIndexMap.get(string.charAt(low))+1;
				charLastOccuredIndexMap.remove(string.charAt(low));
				low=beginIndex;
								
			}
				
		if(high == string.length()) {
					if(longSubStr < high- beginIndex+1){
						longSubStr=high- beginIndex+1;
						subEndIndex=high;
						subBeginIndex=beginIndex;
					}
				}
					
		}
		return string.substring(subBeginIndex, subEndIndex+1);
	}

}
