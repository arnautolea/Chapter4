/*(Another Dangling-else Problem) Modify the given code to produce the output shown in
each part of the problem. Use proper indentation techniques. Make no changes other than inserting
braces and changing the indentation of the code. The compiler ignores indentation in a Java pro-
gram. We’ve eliminated the indentation from the given code to make the problem more challeng-
ing. [Note: It’s possible that no modification is necessary for some of the parts.]

if (y == 8)
if (x == 5)
System.out.println("@@@@@");
else
System.out.println("#####");
System.out.println("$$$$$");
System.out.println("&&&&&");
a) Assuming that x = 5 and y = 8, the following output is produced:
@@@@@
$$$$$
&&&&&
b) Assuming that x = 5 and y = 8, the following output is produced:
@@@@@
c) Assuming that x = 5 and y = 8, the following output is produced:
@@@@@
d) Assuming that x = 5 and y = 7, the following output is produced. [Note: The last three
output statements after the else are all part of a block.]
#####
$$$$$
&&&&&
*/
package Chapter04;

public class Exercise0428 {
	
	public static void main(String[] args) {
		
///*a*/	int x = 5; 
//		int y = 8;
//		
//		if (y == 8){//true
//			if (x == 5)//true
//			System.out.println("@@@@@");//execute
//		}//end if
//		else{//ignore
//		System.out.println("#####");
//		}//end else
//		System.out.println("$$$$$"); //execute
//		System.out.println("&&&&&"); //execute
//@@@@@
//$$$$$
//&&&&&		

///*b*/	int x = 5; 
//		int y = 8;
//		
//		if (y == 8)//true
//		if (x == 5)//true
//		System.out.println("@@@@@"); //execute
//		
//		else{//ignore
//		System.out.println("#####");
//		System.out.println("$$$$$");
//		System.out.println("&&&&&");
//		}//end else
//@@@@@
		
///*c*/	int x = 5; 
//		int y = 8;
//
//		if (y == 8){ //true
//			if (x == 5)//true
//			System.out.println("@@@@@");//execute
//		}//end if
//		else{//ignore
//		System.out.println("#####");
//		System.out.println("$$$$$");
//		System.out.println("&&&&&");
//		}//end else
//@@@@@
		
/*d*/   int x = 5; 
		int y = 7;
		
		if (y == 8){ //false
			if (x == 5) //ignore
			System.out.println("@@@@@");
		}//end if
		else { //execute
		System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		}//end else
//#####
//$$$$$
//&&&&&


	}//end main
}//end class
