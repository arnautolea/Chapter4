/*(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]*/
package Chapter04;

import java.util.Scanner;

public class Exercise0423 {
	
	public static void main (String[] args) {
		
	int counter, number, largest1, largest2; 
		
	Scanner input = new Scanner(System.in);	
		
				System.out.println("Input 10 numbers, and program will determinate the largest two!");
		
				System.out.printf("Enter number %d: ", 1);
				largest1 = input.nextInt();
				System.out.println("Largest number found so far is: " + largest1);	
								
				System.out.printf("Enter number %d: ", 2);
				largest2 = input.nextInt();
				System.out.println("Largest two number found so far are: " + largest1 + " and " + largest2);
			
		for (counter = 3; counter<= 10; counter++) {
		
			System.out.printf("Enter number %d: ", counter);
		    number = input.nextInt();
	  		
			if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            } //end if
			else if (number < largest1 && number > largest2) {
                largest2 = number;
			}//end else if
			
			
			
	    System.out.println("Largest two numbers found so far are: " + largest1 + " and " + largest2);
		}//end for		
		System.out.println("\nLargest two numbers after 10 inputs are: " + largest1 + " and " + largest2);
	
		input.close();
	}//end main
}// end class