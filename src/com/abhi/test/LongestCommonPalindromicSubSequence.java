package com.abhi.test;

public class LongestCommonPalindromicSubSequence {

	public static void main(String[] args) {

		
		String s1="abcbcbdfjg";
		String s2=new StringBuilder().append(s1).reverse().toString();
		
		int n=s1.length();

		int a[][]=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					a[i][j]=a[i-1][j-1]+1;
				}else {
					a[i][j]=Integer.max(a[i-1][j],a[i][j-1]);
				}
				
			}
		}
		
		System.out.println("Length="+a[n][n]);
		
		String longestSPalindromicSubSequence=LPS(s1,s2,n,n,a);
		System.out.println(longestSPalindromicSubSequence);
		
		
	}

	private static String LPS(String s1, String s2, int m,int n, int[][] a) {
		
		if(m == 0 || n ==0)
			return "";
		
		if(s1.charAt(m-1) == s2.charAt(n-1)){
			
			return LPS(s1,s2,m-1,n-1,a) + s1.charAt(m-1);
			
		}
		
		if(a[m-1][n] > a[m][n-1])
			return LPS(s1,s2,m-1,n,a);
		
			return LPS(s1,s2,m,n-1,a);
			
	}

}
