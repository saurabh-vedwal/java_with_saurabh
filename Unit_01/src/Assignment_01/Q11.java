//SAURABH VEDWAL OF SECTION E(57).
package Assignment_01;

import java.util.Scanner;

public class Q11 {
	public static void main( String[] args ) {
		System.out.println("SAURABH VEDWAL OF SECTION E.");
		Scanner obj = new Scanner( System.in );
		
		System.out.print("Enter the first number         : ");
		int a = obj.nextInt();
		
		System.out.print("Enter the second number        : ");
		int b = obj.nextInt();
		
		test1 obj1 = new test1( a , b );
		
		int result = ( a > b ) ? obj1.first() : obj1.second();
		
		System.out.println("The result of the operation is : "+result);
		obj.close();
	}
}

class test1{
	int a , b;
	test1(){		
	}
	
	test1( int a , int b ){
		this.a = a;
		this.b = b;
	}
	
	int first() {
		return ( a + b );
	}
	
	int second() {
		return ( ( a - b ) < 0 ) ? 0 : ( a - b );
	}
}
