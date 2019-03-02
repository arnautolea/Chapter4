/*(Factorial) The factorial of a nonnegative integer n is written as n! (pronounced “n factori-
al”) and is defined as follows:
n! = n · (n – 1) · (n – 2) · ... · 1 (for values of n greater than or equal to 1)
and
n! = 1 (for n = 0)
For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.

a) Write an application that reads a nonnegative integer and computes and prints its factorial.

b) Write an application that estimates the value of the mathematical constant e by using
the following formula. Allow the user to enter the number of terms to calculate.

c) Write an application that computes the value of ex by using the following formula. 
Allow the user to enter the number of terms to calculate.
*/
package Chapter04;

import java.util.Scanner;

public class Exercise0437 {

	public static void main (String[] args) {
		
		int na, nb, nc; //counter for number of terms
		int x; //x for ex. c 
		int fa = 1; //factorial and result for ex. a, 
		int fb = 1; //factorial for ex. b
		double e = 1.0; //result for ex. b
		int fc = 1; //factorial for ex. c
		double ex = 1.0; //result for ex. c
		
	Scanner input = new Scanner(System.in);
	
/*a)*/	System.out.print("Enter value of n (greater than or equal to 1): ");
		na = input.nextInt();
		
		if (na > 0){
			for( int i = 1; i <= na; i++) {
				fa = fa * i;
			}	
		System.out.printf("%d! = %d", na, fa);
		}
		else {
			System.out.println("value is not greater than or equal to 1");
		}
		
/*b)*/  System.out.print("\nEnter the number of terms to calculate e: ");
        nb = input.nextInt();
        if (nb > 0) {
        	for( int r = 1; r <= nb; r++) {
        		fb = fb * r;
        		e += (1.0 / fb);
        	}
	    System.out.printf("value of the mathematical constant e: %f", e);
        }
        else {
			System.out.println("value is not greater than or equal to 1");
        }
        
/*c)*/  System.out.print("\nEnter the number of terms to calculate e^x: ");
		nc = input.nextInt();
		if (nc > 0) {
			System.out.print("Enter x to calculate e^x: ");
			x = input.nextInt();
			
			for( int k = 1; k <= nc; k++) {
				fc = fc * k;
				ex += (Math.pow(x, k) / fc);
			}
			
			// Function returns approximate value of e^x  
		    // using sum of first n terms of Taylor Series
			
//				for (int j = nc - 1; j > 0; --j ) {
//					ex = 1 + x * ex / j; 
//				}
		System.out.printf("value of the mathematical constant e^x: %f", ex);
		}
		else {
			System.out.println("value is not greater than or equal to 1");
		}
        input.close();
	}
}
/*
Enter value of n (greater than or equal to 1): 5
5! = 120
Enter the number of terms to calculate e: 10
value of the mathematical constant e: 2,718282
Enter the number of terms to calculate e^x: 10
Enter x to calculate e^x: 1
value of the mathematical constant e^x: 2,718282
*/
