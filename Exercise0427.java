/*(Dangling-else Problem) Determine the output for each of the given sets of code when x
is 9 and y is 11 and when x is 11 and y is 9. The compiler ignores the indentation in a Java program.
Also, the Java compiler always associates an else with the immediately preceding if unless told to
do otherwise by the placement of braces ({}). On first glance, 
you may not be sure which if a particular else matches—this situation is referred to as the “dangling-else problem.
” We’ve eliminated the indentation from the following code to make the problem more challenging. 
[Hint: Apply the indentation conventions you’ve learned.]
a) if (x < 10)
if (y > 10)
System.out.println("*****");
else
System.out.println("#####");
System.out.println("$$$$$");
b) if (x < 10)
{
if (y > 10)
System.out.println("*****");
}
else
{
System.out.println("#####");
System.out.println("$$$$$");
}
*/
package Chapter04;

public class Exercise0427 {
	
	public static void main(String[] args) {
		
//		int x = 11;
//		int y = 9;
//		
//		if (x < 10)
//		if (y > 10)
//		System.out.println("*****");
//		else
//		System.out.println("#####");
//	System.out.println("$$$$$");
//			
			
			//x=9,y=11;
			//*****
			//$$$$$
	//if x(9) < 10 true, y(11) > 10 true...output if y, ignores else but print last line because it does not belong to else.
	//if x(11) < 10 false, ignores if y and else, output last line ($$$$$), last line is not a part of if..else 
	
		int x = 11;
		int y = 9;
		 
		if (x < 10){
			if (y > 10)
			System.out.println("*****");
		}
		else{
		System.out.println("#####");
		System.out.println("$$$$$"); 
		}
    //if x(9) and y(11) true, print only if y output (*****) and ignore else 	
	//if x(11) < 10  false...go to else and print bought outputs because there are in braces
		//#####
		//$$$$$
		
		
	}//end main
}//end class
