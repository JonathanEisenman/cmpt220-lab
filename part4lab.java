package Problem1;

import java.util.Scanner;


public class part4lab {
 
 public static void main(String[] args) {
	 
  System.out.print("Enter ten numbers: ");
  
  Scanner input = new Scanner(System.in);
  
  double[] n = new double[10];
 
  for (int i = 0; i < n.length; i++) {
	  

	  
	  
   n[i] = input.nextDouble();
  }
 
  System.out.println("The mean for the input is:  " + m(n));
  
  System.out.println("The standard deviation for the input is: " + deviation(n));
  
 
 }
 
 
 public static double deviation(double[] x) {
	 
  double m = m(x);
  
  double sumSq = 0;
  
  for (int i = 0; i < x.length; i++) {
	  
   sumSq += Math.pow((x[i] - m), 2);
   
  }
 
  return Math.sqrt(sumSq / (x.length - 1));
 
 }
 
 
 public static double m(double[] x) {
	 
  double s = 0;
  
  for (int i = 0; i < x.length; i++) {
	  
   s += x[i];
   
  }
 
  return s / x.length;
 
 }
 
}