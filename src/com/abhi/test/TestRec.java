package com.abhi.test;

public class TestRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rec(2);
		
	}

	
	public static void rec( int m) {
		
		if(m > 0 )
		{
			System.out.println("m1="+m);
			rec(m-1);
			rec(m-1);
			System.out.println("m="+m);
			System.out.println("a="+m);
			
		}
		
	}
}
