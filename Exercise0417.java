/*(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.*/

package Chapter04;

import java.util.Scanner;

public class Exercise0417 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int totalm = 0;
		int totalg = 0;
		double totalmg = 0;
		int counter = 0;
		
		System.out.print("Enter driven miles ( or -1 to quit): ");
        int miles = input.nextInt();
        
        while (miles > 0) {
        
        	System.out.print("Enter gallons used: ");
        	int gallon = input.nextInt();
        	if (gallon < 0)
        		break;
            ++counter; //trips counter
            
            totalm += miles; //miles sum
        	totalg += gallon; // gallons sum
            double mg = (double)miles/gallon;
            totalmg = (double)totalm/totalg;
            
            System.out.printf("%nMiles per gallons for trip %d: %.2f%n", counter, mg);
        	
        	System.out.println("Total driven miles: " + totalm + "; Total gallons used: " + totalg);
        	
        	System.out.printf("%nMiles per gallons for %d trip(s): %.2f%n", counter, totalmg);
        	System.out.println("---------");
        	System.out.print("Enter driven miles: ");
        	miles = input.nextInt();
        }//end while
        //final statements
        System.out.println("-------------number of trips------: " + counter);
        System.out.printf("%nAverage miles per gallons for all trips: %.2f", totalmg);
		
        input.close(); // close scanner
	} // end main
} //end class		
