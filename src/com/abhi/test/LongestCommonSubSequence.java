package com.abhi.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="abcdbgjfnb";
		String str2="acbjb";
		
		int m=str1.length();
		int n=str2.length();
		int[][] matrix=new int[m+1][n+1];
		
		
		for(int i=1;i<=m;i++){
			
			for(int j=1;j<=n;j++){
				
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					matrix[i][j]=matrix[i-1][j-1]+1;
				}else {
					
					matrix[i][j]=Integer.max(matrix[i-1][j], matrix[i][j-1]);
				}
				
			}
			
		}
		
		System.out.println(matrix[m][n]);
		
		List<String> longestCommonSubSequences=LCS(str1,str2,matrix,m,n);
		
		longestCommonSubSequences.forEach(str -> System.out.println(str));


	}

	private static List<String> LCS(String str1, String str2, int[][] matrix,int m,int n) {
		
		
		if(m==0 || n ==0)
			return new ArrayList<>(Collections.nCopies(1, ""));
		
		
		if(str1.charAt(m-1) == str2.charAt(n-1)){
			
			List<String> lcs=LCS(str1,str2,matrix,m-1,n-1);
				
			for(int i=0;i<lcs.size();i++){
			   lcs.set(i, lcs.get(i)+str1.charAt(m-1));	
			}
			
			return lcs;
		}

		   if(matrix[m-1][n] > matrix[m][n-1] )
			   return LCS(str1,str2,matrix,m-1,n);
		   
		   if(matrix[m][n-1] > matrix[m-1][n])
			   return LCS(str1,str2,matrix,m,n-1);
		   
		   List<String> top=LCS(str1,str2,matrix,m-1,n);
		   List<String> left=LCS(str1,str2,matrix,m,n-1);
		   
		   top.addAll(left);
		   
		
		return top;
	}

}
