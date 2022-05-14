package unit_03;
import java.util.*;
class exception{
    void basicException() {
        int b=0;
        int a=10/b;
        System.out.println(a);
        System.out.println("Done!");
    }
    void handelException() {
        try {
            int b=0;
            int a=10/b;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("CODE DONE!");
        }
    }
    void multipleCatch() {

        try {
            int b=0;
            int a=10/b;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " Arithmeetic!!!!");
            System.out.println("CODE DONE!");
        }
        catch(Exception e) {
            System.out.println(e.getMessage() + " exception!!");
        }
    }
    void inputMinsmatchException() {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int number=sc.nextInt();
            System.out.println("You entered:" + number);
        } 
        catch (InputMismatchException e) {
            System.out.println(e + " Resolved");
        }

        System.out.println("Done!!!!!");
    }
    void stackOverFlowError(int i) {
    	//THIS IS AN ERROR NOT AN EXCEPTION.
    	try {
            while(i>0) {
                i++;
                stackOverFlowError(i);
            }
        } 
    	catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Other code execute!!");
    }
    void indexOutofBoundException() {
        try {
            int[] num= {5,4,23,2,54,3};
            System.out.println(num[10]);
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" EXCEPTION SOLVED!!");
    }
    void nullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } 
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    void useofThrow(int age) throws Exception{
        if(age<18){
            throw new Exception();
        }
        else{
            System.out.println("ONE IS ALLOWED FOR VOTING");
        }
    }
    void useofThrow_And_Finally() {
        try{
            useofThrow(17);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("this content is written inside finally block and will be shown definetly");
        }
    }
    void checkedAndUncheckedException() {
    	int a=0;
    	int b=100;
    	int c=b/a;
    	System.out.println(c);
    	try {
    		useofThrow(19);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    void manualExceptionThrow() {
    	try {
    		ageFinder(-1);
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
    void ageFinder(int x) throws ManualException{
    	if(x<0) {
    		throw new ManualException();
    	}
    	else {
    		System.out.println("age is"+x)
    	}
    }
}
class ManualException extends Exception{
	public String getMessage() {
		String detMessage="EXCEPTION OCCURED";
		return detMessage;
	}
}
public class P14_ExceptionHandlingInJava {


    public static void main(String args[]) {
    	exception obj=new exception();
 /*   	obj.basicException();
    	obj.handelException();
    	obj.multipleCatch();
    	obj.inputMinsmatchException();
    	obj.stackOverFlowError(2);
        obj.indexOutofBoundException();
        obj.nullPointerException();
        obj.useofThrow(17);
        obj.useofThrow_And_Finally();*/
    	
    }