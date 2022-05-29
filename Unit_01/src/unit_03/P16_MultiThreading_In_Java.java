package unit_03;
import java.util.Scanner;
/*
 * program counter:-	program counter holds the address of next instruction to be executed by one processing unit.	
 
 * multiprocessing:-	
  		-	parallel processing
  		-	sequential processing 
  		-	concurrent processing
 
 * Multitasking:-	
  		-	parallel multitasking
  		-	sequential multitasking 
  		-	concurrent multitasking
  		

 * multithreading task:-
   		-	it is the users job to find the independent task of that process.
   		-	your findings are T1,T2,T3,T4 task of process P1 out of 8 total task.
   		-	context switching between these tasks and the worst time is not decided by the user insted jvm will decide this .
  		-	multithreading is applied when concurrent multitasking occurs.
  		-	it is the users job to put these independent codes into there respected threads(T1,T2,T3,T4).
 		-	user have to start these thread by T1.start(),T2.start(),T3.start(),T4.start(). 
*/
public class P16_MultiThreading_In_Java {

	public static void main(String[] args) {
		
		
//		C1 obj1=new C1();
//		C2 obj2=new C2();
//		
//		obj1.show1();
//		obj2.show2();
		
		Thread obj3=new Thread(new T1(),"T1");
		Thread obj4=new Thread(new T2(),"T2");
		obj3.start();
		obj4.start();
		
		Thread obj5=new Thread(new T3(),"T3");
		Thread obj6=new Thread(new T4(),"T4");
		obj5.start();
		obj6.start();
	}

}


class C1
{
	void show1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_1");
		}
	}
}
class C2
{
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_2");
		}
	}
}

class T1 implements Runnable{

	
	public void run() {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_1");
		}
	}
	
}
class T2 implements Runnable{

	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_2");
		}
	}
	
}


class T3 extends Thread{

	public void run() {
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("T3 is done");
	}
	
}
class T4 implements Runnable{

	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("hey_3");
	}
	
}