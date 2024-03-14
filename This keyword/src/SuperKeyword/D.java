package SuperKeyword;

public class D extends C {

	@Override
	void m1() {
		System.out.println("m1 Method of D class");

	}

	void m2() {
		this.m1();
		super.m1();      //  <<<=====
	}
	
	

	public static void main(String[] args) {

		D obj = new D();
		obj.m2();
	}
}
