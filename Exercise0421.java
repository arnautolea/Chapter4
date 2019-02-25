/*(Find the Largest Number) The process of finding the largest value is used frequently in computer applications. 
 For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. 
 The salesperson who sells the most units wins the contest. 
 Write a pseudocode program, then a Java application that inputs a series of 10 integers and 
 determines and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.*/
package Chapter04;

import java.util.Scanner;

public class Exercise0421 {
	
	public static void main (String[] args) {
		
	int counter, number, largest;
	
	Scanner input = new Scanner(System.in);	
		
				System.out.println("Input 10 numbers, and program will determinate the largest one!");
				System.out.printf("Enter number %d: ", 1);
				largest = input.nextInt();
				System.out.println("Largest number found so far is: " + largest);
						
		for (counter = 2; counter<= 10; counter++) {
		System.out.printf("Enter number %d: ", counter);
		number = input.nextInt();
			
			if (largest < number) {
				largest = number;
				System.out.println("Largest number found so far is: " + largest);
			}//end if
			else {
				System.out.println("Largest number found so far is: " + largest);
			}//end else
		}//end for		
		System.out.println("\nLargest number after 10 inputs is: " + largest);
	input.close();
	}//end main
}// end class
