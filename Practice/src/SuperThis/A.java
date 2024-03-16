package SuperThis;

public class A {

	int value = 60;

	A() {
		this(20);
		System.out.println("Cons");

	};

	A(int Z) {

	};

//	Method 1
	void m1() {

		System.out.println(this.value = 59);
		m2();

	}

//	Method 2
	void m2() {
		System.out.println("This is a m2 method");
	}
	
	
//	Important of this keyword with reference to inheritance

	 void parentMethod() {
		System.out.println("This is a parent Class's Method.");
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		A ss = new A();
		ss.m1();
	}
}
