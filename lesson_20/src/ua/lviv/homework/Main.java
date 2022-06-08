/*
 * LOGOS It Academy home work 20
 * 
 * */

package ua.lviv.homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * This program demonstrates Threads in use.
 * @author Oleksandr
 * @param input parameters is int.
 * @exception InterruptedException
 * 
 */


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
	// The first task - using thread;
		
		MyThread t1 = new MyThread();
		t1.start();
		t1.join();
		
		Thread t2 = new Thread(new RunnableThread());
		t2.run();
		
		System.out.println();
		
		// The second task - using executors;
	    // option one:
		
		ExecutorService execut = Executors.newSingleThreadExecutor();
		execut.execute(new MyThread());
		execut.execute(new RunnableThread());
		execut.shutdown();
		
		System.out.println();
		
		// option two:
		
//		ExecutorService execut2 = Executors.newFixedThreadPool(1);
//		execut2.execute(new MyThread());
//		execut2.execute(new RunnableThread());
//		execut2.shutdown();
		
		
		
		
		
	}

}
