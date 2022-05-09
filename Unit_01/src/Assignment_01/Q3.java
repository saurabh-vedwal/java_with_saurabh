package Assignment_01;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		
		testClass obj = new testClass();
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("ENTER THE NUMBER TO BE CHECKED");
		x=sc.nextInt();
		obj.display(x);
	}
}

interface In1{
	void display(int p);
}
class testClass implements In1{
	public void display( int p ) {
		int x = 0;
		for( int i=2 ; i<=Math.sqrt(p) ; i++ ) {
			if( p%i == 0 ) {
				x++;
				break;
			}
		}
		if( x == 0 ) {
			System.out.println(p+" is a prime number.");
		}
		else {
			System.out.println(p+" is not a prime number.");
		}
		return;
	}	
}
