package com.abhi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestLargestDistinctSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="abbcde";
		
		List<String> longestDistinctSubStr=longestDistinctSubString(string);
		System.out.println(longestDistinctSubStr);
	}

	private static List<String> longestDistinctSubString(String string) {

		/**
		 * findLongestSubString
		 * iterate through char.. add each char to map..if map contains char already,
		 * find begin index and endIndex.. if longest sub str ever, add to list.
		 * set begin index to curr endindex=high.
		 * 
		 * 
		 * 
		 * 
		 */
		//abbcdedddbxyz
		Set<Character> set=new HashSet<>();
		int beginIndex=0,endIndex=0,longSubStrLen=0;
		Map<Integer,List<String>> resultMap=new HashMap<>();
		for(int low=0,high=0;high<string.length();high++){
		if(!set.contains(string.charAt(high)))
		{
		  set.add(string.charAt(high));	
		  
		  if(high==string.length() && longSubStrLen <= endIndex - beginIndex) 
		  {
			  if(!resultMap.containsKey(longSubStrLen)){
					
					List<String> resultArrayList=new ArrayList<>();
					resultArrayList.add(string.substring(beginIndex, endIndex+1));
					resultMap.put(longSubStrLen, resultArrayList);
				}
				else
				{
					List<String> resultArrayList=resultMap.get(longSubStrLen);
					resultArrayList.add(string.substring(beginIndex, endIndex+1));
					resultMap.put(longSubStrLen, resultArrayList);
				}
		  }
		}
		else
		{
			endIndex=high-1;
			
			if(longSubStrLen < endIndex - beginIndex+1) 
			{
				longSubStrLen = endIndex - beginIndex+1;
				
				if(!resultMap.containsKey(longSubStrLen)){
					
					List<String> resultArrayList=new ArrayList<>();
					resultArrayList.add(string.substring(beginIndex, endIndex+1));
					resultMap.put(longSubStrLen, resultArrayList);
				}
				else
				{
					List<String> resultArrayList=resultMap.get(longSubStrLen);
					resultArrayList.add(string.substring(beginIndex, endIndex+1));
					resultMap.put(longSubStrLen, resultArrayList);
				}
				
				beginIndex=high;
		}
		
		
			
			
			
		}
		
		} //for loop end
		
		
		return resultMap.get(longSubStrLen);
	}

}
