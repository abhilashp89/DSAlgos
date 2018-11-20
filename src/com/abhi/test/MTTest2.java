package com.abhi.test;

public class MTTest2 {

	public static class NewThread extends Thread {
		
		public NewThread(String name){
			super(name);
		}
		
		public void run(){
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 NewThread myThread=new NewThread("i am thread");
		 myThread.run();
	}

}
