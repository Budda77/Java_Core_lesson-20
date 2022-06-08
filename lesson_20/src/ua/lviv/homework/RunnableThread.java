package ua.lviv.homework;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	@Override
	public void run() {	

		System.out.println("\nEnter a number to output the descent quantity of the Fibonacci numbers:");
		Scanner sc = new Scanner(System.in);
		int power= sc.nextInt();
		int power2=power-1;
		int tmp =0;

		//Calculate the Fibonacci sum according to the number entered.
		
		double root = Math.sqrt(5);
		double x = (1 + root)/2;
		double y = (1 - root)/2;
		int fibonacci1 =  (int) ((Math.pow(x, power) - Math.pow(y, power)) /root);
		int fibonacci2 =  (int) ((Math.pow(x, power2) - Math.pow(y, power2)) /root);
		
		System.out.print("Потік Runnable: ");
		for (int i = 0; i <power; i++) {		
			tmp = fibonacci1-fibonacci2;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(fibonacci1+ " ");
			fibonacci1 = fibonacci2;
			fibonacci2 = tmp;	
		}

	}

}
