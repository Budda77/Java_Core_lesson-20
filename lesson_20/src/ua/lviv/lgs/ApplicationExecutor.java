package ua.lviv.lgs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {
	public static void main(String[] args) {
		
		ExecutorService executable = Executors.newFixedThreadPool(20);
		
		executable.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Asynchronyous task Hello world.");
			}
			
		});
		
		executable.shutdown();

	}
}
