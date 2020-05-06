package lab3examplesandproblems;

import java.util.Scanner;

public class Lab3Problem1{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double m, d, n;
		
		m = d = 0;	

		System.out.print("Enter ten numbers: ");

		
		for (int i = 1; i <= 10; i++) {
			
			n = input.nextDouble();
			
			m += n;
			
			d += Math.pow(n, 2); 
		}
		d =  Math.sqrt((d - (Math.pow(m, 2) / 10)) / (10 - 1));
		
		m /= 10;

		System.out.println("The mean is " + m);
		
		System.out.println("Standard deviation is " + d);
	}
}