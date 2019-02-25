/*(Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message 
"Credit limit exceeded".*/
package Chapter04;

import java.util.Scanner;

public class Exercise0418 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int accnum, balance, charge, credit, limit;
		
		System.out.print("Enter account number (or -1 to quit): ");
		accnum = input.nextInt();
		
			while (accnum != -1) { 
		
				System.out.print("Enter balance at the beginning of the month: ");		
				balance = input.nextInt();
				
				System.out.print("Enter total charges: ");		
				charge = input.nextInt();
								
				System.out.print("Enter total credits: ");		
				credit = input.nextInt();
				
				System.out.print("Enter credit limit: ");		
				limit = input.nextInt();
				
				balance = balance + charge - credit;
								
				System.out.println("Account: " + accnum);
				System.out.println("Credit limit: " + limit);
				System.out.println("Balance for end of month: " + balance + ("\n")); 
				
				if (balance < limit) {
					System.out.println("Credit limit exceeded\n");					
				} //end if
				System.out.print("Enter account number (or -1 to quit): ");
				accnum = input.nextInt();
			} //end while
		System.out.println("No customer number was entered or limit calculator is finished");
		input.close(); //close scanner
	} //end main 
} //end class
