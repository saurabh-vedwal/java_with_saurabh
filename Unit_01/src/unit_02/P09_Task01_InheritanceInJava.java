package unit_02;
public class P09_Task01_InheritanceInJava {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.i = 10;
		obj1.j = 20;
		obj1.show();
		System.out.println();

		obj2.i = 40;
		obj2.j = 50;		
		
		obj2.k = 30;
		obj2.show();
		obj2.showb();
		obj2.sum();		
		
	}
}


class A{                            // Creating superclass
	int i, j;
	void show() {
		System.out.println("i and j : " + i + " and " + j );
	}
}

class B extends A{                  // Creating subclass
	int k;
	void showb() {
		System.out.println("k : " + k);
	}
	
	void sum() {
		System.out.println("i + j + k : " + (i+j+k));
	}
}