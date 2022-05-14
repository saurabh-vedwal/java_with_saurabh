package unit_03;
/*
 * keyword used::::::
 * try,catch,throw,throw,throws,finally;
 * try-sensitive code(code that can arise an issue in runtime) should be written their.
 * catch-in this we should write that code which is solution of try block.
 */

/*we use try to write sensitive code so code will not terminate.
 * we use different catches for single try block.
 * we cannot write catch of superclass first.
 * specific exception should be written first.
 * we should not write any catch block for an error.because their is no solution of an error.
 * compiler internally uses "throw" keyword for throwing an exception form try to catch block.
 * compiler automatically use throw keyword for certain amount of exception.if we want to create our own exception we should externally use throw keyword.
 * we should either use try catch or throws but not on same time 
 * 
 */
import java.util.*;
public class ExceptionInJava {
	public static void main(String[]args) {
		Scanner sr=new Scanner(System.in);
		//sensitive code-which can arise an issue.we put sensitive code in try block:
		try {
			int b=0;
			int a=0;
			a=100/b; //Deviding by zero.it will arise error and program will terminate.
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		//if we put catch block first and try block later then compile time error arrises.
		//rest of the code is.
		try {
			int a=sr.nextInt();
			System.out.println(a);
		}
		catch(InputMismatchException g) {
			System.out.println(g.getMessage());
		}
		//The finally statement lets you execute code,after try...catch
		//regardless of the results.
		finally {
			System.out.println("THE 'try catch' is finished");
		}
		System.out.println("code Done!");
	}
}
