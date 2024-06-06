package tools;

import java.util.*;
public class Fibonacci {
	
	  public static int fibonacciRecursion(int count) {
	    if (count == 0) {
	      return 0;
	    } // Fibonacci of 0  is 0

	    if (count == 1 || count == 2) {
	      return 1;
	    } 
	    return fibonacciRecursion(count - 1) + fibonacciRecursion(count - 2);
	  }

	  public static void main(String args[]) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter the number:");
	    int fibLength = input.nextInt();

	    System.out.println("Fibonacci Series of " + fibLength + " numbers is: \n");
	    for (int i = 0; i < fibLength; i++) {
	    	System.out.print(fibonacciRecursion(i) + " ");
	    }
	    
	  }
	}