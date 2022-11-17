package com.te.collections;

public class ThreadByLambda {

	public static void main(String[] args) {
	Runnable runnable=()->{
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"--->"+Thread.currentThread().getName());
			
			
			
		}
		
		
	};
	
	Runnable runnable1=()->{
		for(char ch='a';ch<='z';ch++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ch+"--->"+Thread.currentThread().getName());
			
			
			
		}
		
		
	};
	
	Thread t=new Thread(runnable);
	Thread t1=new Thread(runnable);
	
	t.start();
	t1.start();
	
	
	
	

	}

}
