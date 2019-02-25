/*What does the following program print?*/
package Chapter04;

public class Exercise0425 {
		public static void main(String[] args) {

		int count = 1;
	
			while (count <= 10){
			System.out.println(count % 2 == 1 ? "****" : "++++++++");
			++count;
			}//end while
		}//end main	 
}//end class

/*
remainder after division 1/2 is 1, program print **** (true), 
at second loop count get value of 2, so 2/2 remainder is 0 and program print ++++++++ (false)
 3/2 % = 1 print **** as true
 4/2 % = 0 print ++++++++ as false
and so on 10 times
ternary operator(?) result can be true :(or) false
equal expression is:
if (count % 2 == 1){ 
 print  "****"
else print "++++++++"
}
*/