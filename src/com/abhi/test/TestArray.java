package com.abhi.test;

import java.util.HashMap;
import java.util.Map;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] alphbetArray=new int[128];
		
		Map<Character,Integer> alphaIndex=new HashMap<>();
		
		String alphabet="abcdefghijklmnopqrstuvwxyzAABCDEGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0;i<alphabet.length();i++){
			alphaIndex.put(alphabet.charAt(i), ++alphbetArray[alphabet.charAt(i)]);
		}
		
		int[] alphbetArray1=new int[128];
		
		alphbetArray1['a']++;
		
		for(int i=0;i<alphbetArray1.length;i++) {
			
			System.out.println(i);
			if(alphbetArray1[i] == 1)
			System.out.println(i+" "+alphbetArray1[i]);
		}

		
	}

}
