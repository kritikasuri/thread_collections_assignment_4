package com.acadgild.assignment.threadPriority;

public class threadPriority extends Thread{
	
	public void run() {
		
		String tName = Thread.currentThread().getName();
		Integer tPriority = Thread.currentThread().getPriority();
			 
		System.out.println(tName + " has priority " + tPriority);
	}

	public static void main(String[] args){
		                      
		threadPriority A = new threadPriority();
		threadPriority B = new threadPriority();
		threadPriority C = new threadPriority();

		A.setPriority(Thread.MIN_PRIORITY);	
		B.setPriority(Thread.NORM_PRIORITY);	
		C.setPriority(Thread.MAX_PRIORITY);
		  
		A.start();
		B.start();
		C.start();   
	}
}
