/*(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/
package Chapter04;

import java.util.Scanner;

public class Exercise0419 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		double total = 0.0; 
		double value = 0.0;
		int item;
		
		System.out.print("Enter items sold number (1,2,3,4), or enter \"0\" when list finished: ");
		item = input.nextInt();
		
		while (item !=0) {
						
			if (item == 1){
				value = 239.99; 	
			}//end if 1
			else if (item == 2){ 
				value = 129.75;
			}//end if 2
			else if (item == 3){  
				value = 99.95;
			}//end if 3
			else if (item == 4){ 
				value = 350.89;
			}//end if 4
			else {
			System.out.println("No such item");
				value = 0.0;
			}//end else for not corresponding item
			
			double erning = value / 100 * 9;
			System.out.printf("Erning: $%.2f%n", erning);
			
		    total += erning;
			
			System.out.print("Enter items sold number (1,2,3,4), or enter \"0\" when list finished: ");
			item = input.nextInt();
		} //end while
		 
		System.out.printf("%nSalesperson’s earnings this week: $%.2f", (total + 200));
		 		
		input.close(); //close scanner
	} //end main
} //end class
