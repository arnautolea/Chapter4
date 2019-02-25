/*(Tabular Output) Write a Java application that uses looping to print the following table of
values:
N 10*N 100*N 1000*N

1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000
*/
package Chapter04;

public class Exercise0422 { //same think that we've done in chapter 2 exercise 31, now using loop

	public static void main(String[] args) {
		
		System.out.println("N\t10*N\t100*N\t1000*N\n");
		
		for (int num = 1; num <= 5; num++) {
		System.out.printf("%d\t%d\t%d\t%d\t%n", (num), (10 * num), (100 * num), (1000 * num));
		}//end for
	}//end main
}//end class
