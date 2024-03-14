

public class A {
	int num = 69;

	void m1() {
		System.out.println("M1 Method of class A");
	}

	void m2() {
		this.num = 100; 
		this.m1();
		System.out.println(this.num);
	}

	public static void main(String[] args) {
		A ss = new A();
		ss.m2();
	}
}
