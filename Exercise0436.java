/*(Sides of a Right Triangle) Write an application that reads three nonzero integers and determines 
and prints whether they could represent the sides of a right triangle.*/
package Chapter04;
import java.util.Scanner;

public class Exercise0436 {

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
		if((x*x == ((y*y)+(z*z)) || (y*y == ((x*x)+(z*z))) || (z*z == (x*x)+(y*y)))) {
			System.out.println("They could represent the sides of a right triangle");
		}
		else {
			System.out.println("They couldn't represent the sides of a right triangle");
		}
	in.close();	
	}//end main
}//end class
