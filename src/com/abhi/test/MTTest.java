package com.abhi.test;

public class MTTest implements Runnable {

	int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MTTest run=new MTTest();
       Thread t1=new Thread(run);
       Thread t2=new Thread(run);
       
       t1.start();
       t2.start();
       
       
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			synchronized (this) {
				x=10;
				y=10;
			}
		System.out.print(x+ " "+ y+ " ");
	}

}
