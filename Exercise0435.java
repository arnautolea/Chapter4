/*(Sides of a Triangle) Write an application that reads three nonzero values entered by the
user and determines and prints whether they could represent the sides of a triangle.*/
package Chapter04;

import java.util.Scanner;

public class Exercise0435 {

	public static void main (String[] args) {
		
		int x, y, z;
		
	Scanner in = new Scanner(System.in);
	
		System.out.println("Enter three nonzero values! ");
		System.out.print("First value: ");
		x = in.nextInt();
		System.out.print("Second value: ");
		y = in.nextInt();
		System.out.print("Theard value: ");
		z = in.nextInt();
		if (x <= 0 || y <= 0 || z <= 0){
			System.out.println("Values must be nonzero");
		}
		if((x < (y+z)) && (y < (x+z)) && (z < (x+y))) {
			System.out.println("They could represent the sides of a triangle");
		}
		else {
			System.out.println("They couldn't represent the sides of a triangle");
		}
	in.close();	
	}//end main
}//end class

