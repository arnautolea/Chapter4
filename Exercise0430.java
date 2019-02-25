/*(Palindromes) A palindrome is a sequence of characters that reads the same backward as for-ward. 
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. 
Write an application that reads in a five-digit integer and determines whether it’s a palindrome. 
If the number is not five digits long, display an error message and allow the user to enter a new value.*/
package Chapter04;

import java.util.Scanner;

public class Exercise0430 {

	public static void main(String[] args) {
		
		int reversed = 0, remainder, original;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers with five digits: ");
		
		int num = input.nextInt();
		int length = String.valueOf(num).length();
			while (length != 5) {
				System.out.print("Number must have 5 digits! Try again! \n");
				System.out.print("\nEnter numbers with five digits: ");
				num = input.nextInt();
				length = String.valueOf(num).length();
				continue;
			}//end while			
	
			
			if(length == 5){
				original = num;
			while(num !=0) {
				remainder = num % 10;
				reversed = reversed * 10 + remainder;
				num = num / 10;
			}//end while
				
				if (original == reversed) {
				System.out.printf("Number %d is polindrome!", original);
				}//end if
				else {
					System.out.printf("Number %d is NOT a polindrome!", original);
				}//else
		 }//end if				
		
		input.close();
		
	}//main

}//class
