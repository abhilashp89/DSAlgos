package com.abhi.test;

public class LongestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2="abccdedfghqhdq";
		String s1="bedfghqh";
		
		int m=s1.length();
		int n=s2.length();
		int[][] a=new int[m+1][n+1];
		
		int max=0;
		int endIndex=0;
		for(int i=1;i<=m;i++){
			
			for(int j=1;j<=n;j++){
				
				
				if(s1.charAt(i-1) == s2.charAt(j-1))
					a[i][j]=a[i-1][j-1]+1;
				
				if(a[i][j] > max){
				 
					max=a[i][j];
					endIndex=i;
					
				}	
			}
		}
		
		System.out.println("Longest Substring lenght="+max);
		System.out.println("Substring="+s1.substring(endIndex-max, endIndex));

	}

}
