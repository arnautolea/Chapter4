package Chapter04;

public class Exercise0426 {
	
	
	public static void main(String[] args){
		int row = 10;
	
	 	while (row >= 1){
	 		int column = 1;
	
	 		while (column <= 10){
	 		System.out.print(row % 2 == 1 ? "1" : "0"); // ("<" : ">")
	 		++column;
	 		}//end of nested while
	 	--row;
	 	System.out.println(); //next line
	 	}//end while
	}
	 
}//class
/*
to see more clearly what output has this program, I replaced ("<" : ">") with values of true(1) and false(0)
output is:

0000000000
1111111111
..
before program enter in a nested while loop, row gets value of 10 and column is 1,
row(10) % 2 == 1 is false and while ++column <= 10 (10 times) repeat false(0)
next line at the second iteration --row is (10-1), row(9) % 2 == 1 is true, print ten times value of true(1)
next line --row is (9-1), row(8) % 2 == 1 is false, print ten times value of false(0)
...repeat while row >= 1
 */