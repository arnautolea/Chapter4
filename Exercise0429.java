	/*(Square of Asterisks) Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.*/

package Chapter04;

import java.util.Scanner;

public class Exercise0429 {
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
//my first experience with label)))I have just find out how it works, and tried to put it in practice.
//Uncomment next line and last part of program)))
//		restart: while(true){ 
	int size;
	
	    System.out.print("Enter size of the side of square (between 1 and 20): ");
		size = input.nextInt();
					
	while (size < 1 || size > 20) {
		System.out.print("\nNumber must be between 1 and 20, try againg: "); 
		size = input.nextInt();
	continue;
	}		
		
	if (size == 1) {
		System.out.println("*");
	}
	else {
	//first line	
		int x = 0;
		while (x++ < size) {  
		System.out.print("* "); 
		}	
	System.out.println();
		
	//middle part
		x = 0;
		while (x++ < size - 2) { 
		System.out.print("*");
		int y = 0;
			while (y++ < size - 2) {
				System.out.print("  ");
			}
		System.out.println(" *");
		}
	
	//last line
		x = 0;
		while (x++ < size) {
		System.out.print("* "); 
		}		
	}//end else
	
/*	System.out.print("\nOne more? enter 1 to continue or 0 to break: ");
	size = input.nextInt();
	loop: while(true) {
	if (size == 0){ //sentinel control
		break restart;
	}
	if (size ==1) { //sentinel control
		continue restart;
	}
	else {
		System.out.print("\nWhaaat? no such option, 1 to continue or 0 to stop, try again: ");
		size = input.nextInt();
		continue loop;
		}//end label loop
	}//end else
	}//end label restart
	System.out.println("Goood Bye!"); 
*/
	input.close();
	}//end main
}//end class
