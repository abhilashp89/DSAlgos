package com.abhi.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1="XYSXXZYYXZSYZXYYZZXXXXY";
		String string2="XSYZ";
		Map<String,Integer> anagramPositionMap=getAnagram(string1,string2);
		System.out.println(anagramPositionMap);
	}

	private static Map<String, Integer> getAnagram(String string1, String string2) {
		// TODO Auto-generated method stub
		
		/**
		 * Iterate through each char and get next two
		 * If the sub string form anagram with string2,add the string and current index to map.
		 * if any of char contains something that is not part of string 2, 
		 * skip iteration to next char after that bad char
		 *  
		 */
		Map<String,Integer> outputMap=new HashMap<>();
		Set<Character> subStringSet=new HashSet<>();
		for(int i=0;i<string2.length();i++)
			subStringSet.add(string2.charAt(i));
			
			
		//XYXXZY
		Map<Character,Integer> charFreqMap=new HashMap<>();
		StringBuffer anagramWord=null;
		for(int i=0;i< string1.length() -string2.length();i++) {
			if(subStringSet.contains(string1.charAt(i))){
				anagramWord=new StringBuffer();
			for(int j=1; j<=string2.length();j++){
				
				if(!charFreqMap.containsKey(string1.charAt(i+j)))
				charFreqMap.put(string1.charAt(i+j),1);
				
				else{
					charFreqMap.put(string1.charAt(i+j),charFreqMap.get(string1.charAt(i+j))+1);
				}
				
				anagramWord.append(string1.charAt(i+j));
			}
		}else{
			continue;
		}			
			if(isAnagram(subStringSet,charFreqMap))
				outputMap.put(anagramWord.toString(),i+1);
			
			charFreqMap.clear();
			
	
	}
		return outputMap;
	}

	/**
	 * Return true if all elements in map occurred once that are present in set.
	 * @param subStringSet
	 * @param charFreqMap
	 * @return
	 */
	private static boolean isAnagram(Set<Character> subStringSet, Map<Character, Integer> charFreqMap) {
		
		boolean isAnagram=true;
		for(Character element:subStringSet){
			
			isAnagram=charFreqMap.containsKey(element) && charFreqMap.get(element) == 1 ? true : false;
			
			if(!isAnagram)
				return false;
			
		}
		return isAnagram;
	}

}
