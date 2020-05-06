package lab3examplesandproblems;

import java.util.Scanner;

public class Lab3Problem2 {
	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in); 
		
		

		System.out.print("Enter milliseconds: ");
		
		long millisecond = input.nextLong();
		System.out.println("hours:minuties:seconds: " + convertMillis(millisecond));
	}

	public static String convertMillis(long millisecond) {
		
		millisecond /= 1000;


		
		
		String total = "";
		for (int i = 0; i < 2; i++) {
			
			total = ":" + millisecond % 60 + total;
			
			
			millisecond /= 60;
			
		}
		
		return millisecond + total;
	}
}