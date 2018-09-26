package com.abhi.algos;

public class FindSumFromExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expression="8+10-2+3";
		int sum=calculateSum(expression);
		
		System.out.println("sum="+sum);
	}
	
	public static int calculateSum(String expression){

		 char[] expressionArr=expression.toCharArray();
		 
		 int result=0; 
		 for(int i=0;i<expressionArr.length;i++) {
		  
		  if(expressionArr[i] == '+')
			  result=Integer.parseInt(String.valueOf(expressionArr[i-1]))+Integer.parseInt(String.valueOf(expressionArr[i-1]));
		 
		  if(expressionArr[i] == '-')
			  result=Integer.parseInt(String.valueOf(expressionArr[i-1]))-Integer.parseInt(String.valueOf(expressionArr[i-1]));
		 
		 
		 }
		 
		 return result;

		}

}
