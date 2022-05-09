//MADE BY SAURABH VEDWAL(57).
package Assignment_01;
public class Q4 {
	public static void main( String[] args ) {
		ClassThree obj = new ClassThree(1);
		System.out.println("\n");
		ClassThree obj1 = new ClassThree();
	}
}
class ClassOne{
	ClassOne( int x ){
		System.out.println("You are inside ClassOne's parameterized constructor.");
	}
}
class ClassTwo extends ClassOne{
	ClassTwo(){
		super(8);
		System.out.println("You are inside ClassTwo's default constructor.");
	}
}
class ClassThree extends ClassTwo{
	ClassThree(){
		System.out.println("You are inside ClassThree's default constructor.");
	}
	ClassThree( int x ){
		System.out.println("You are inside ClassThree's parameterized constructor.");
	}
}

