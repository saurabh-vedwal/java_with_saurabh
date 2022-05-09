//SAURABH VEDWAL OF SECTION E(57).
package Assignment_01;
public class Q2 {
	public static void main(String[] args) {
		Call obj1 = new Call();
		Call obj2 = new Call();
		Call obj3 = new Call();
		
		obj1.function_call(23);
		obj1.function_call(34);
		obj2.function_call(76);
		obj3.function_call(-12);
		
		System.out.println("The number of call to the function are : "+Call.count);
	}
}

class Call{
	static int count=0;
	void function_call( int num ) {
		count++;
		if( num < 0 ) {
			System.out.println("Number is negative.");
		}
		else if( num > 0 ) {
			System.out.println("Number is positive.");
		}
		else {
			System.out.println("Number is neutral.");
		}
		return;}
}
