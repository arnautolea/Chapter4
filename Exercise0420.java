/*(Salary Calculator) Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information for each employee,
then determine and display the employee’s gross pay. Use class Scanner to input the data*/
package Chapter04;

import java.util.Scanner;

public class Exercise0420 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
			String employee;
			int hour;
			double pay = 0.0; 
			double overtime = 0.0; 
			double payweek = 0.0;
			
			int emp = 1;
			
            do {
            	System.out.printf("Employee %s name: ", emp);
            	employee = input.nextLine();
            	System.out.print("Payment per hour: ");
            	pay = input.nextDouble();
            	System.out.print("Hours worked last week: ");
            	hour = input.nextInt();
						
            		if (hour > 40) {
            			overtime = (hour - 40) * (pay * 1.5);
            		} // end if
			
            		pay = pay * hour;
			
            		payweek = (double)pay + overtime;
			
            	System.out.printf("%nEmployye's %s name %s gross pay is: %.2f%n%n", emp, employee, payweek);
            emp++;
		    input.nextLine();
		    } while (emp <= 3); // end do...while
           
		input.close();
	}//end main
}//end class
