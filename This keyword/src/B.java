
public class B extends A {
	
	B() {
		this(10);
	}
	
	B(int a) {
		
	}
	
	
	void m1(){
		System.out.println("m1 method.");
	}
	
	
	
	void m2() {
		this.m1();
	}
	
	
	public static void main(String[] args) {
		B ss = new B();
		ss.m2();
	}
}
