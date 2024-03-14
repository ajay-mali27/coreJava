package Polymorphism;

public class B {

	int addsum(int a, int b) {
		int sum = a + b;
		System.out.println("The Sum is :" + sum);

		return 0;
	}

	public static void main(String[] args) {
		B ss = new B();
		ss.addsum(5, 9);

		A sss = new A();
		System.out.println(sss.a);
	}
}
