package unit_03;
import java.util.InputMismatchException;
import java.util.Scanner;
class Exception{
	Scanner sc=new Scanner(System.in);
	void basicException() {
		int b=0;
		int a=200;
		//int c=a/b;
		//System.out.println(c);
		System.out.println("CODE DONE!.BUT PROGRAM BREAK DUE TO EXCEPTIONS IN LINE 6 ");
	}
	void handleException() {
		try {
			int b=0;
			int a=100;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("CODE DONE ! EXCEPTIONS RESOLVED");
	}
	void multipleCatch() {
		try {
			int a=100;
			int b;
			b=sc.nextInt();
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());		
		}
	}
	void inputMismatchException() {
		try {
			int a=100;
			int b;
			b=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());	//it will handle the exception and prints NULL.
		}
	}
	void stackOverFlowException() {
		try {
			int i=10;
			while(i>0) {
				i++; 
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class P14_ExceptionHandlingInJava {
	public static void main(String[]args) {
		Exception obj=new Exception();
		//obj.basicException();
		//obj.handleException();
		//obj.multipleCatch();
		//obj.inputMismatchException();
		obj.stackOverFlowException();
	}
}
