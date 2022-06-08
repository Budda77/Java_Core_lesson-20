package ua.lviv.homework;

import java.util.Scanner;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Enter a number to output the ascent quantity of the Fibonacci numbers:");
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int tmp = 0;
		
		System.out.print("Потік Thread: ");
		for (int i = 0; i <number; i++) {
			tmp = num1+num2;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(num2+ " ");
			num1 = num2;
			num2 = tmp;		
		}
	
		
	}

}
