package SuperThis;

public class B extends A {

	void childMethod() {

		this.parentMethod();
	}

	public static void main(String[] args) {
		B cdclass = new B();
		cdclass.childMethod();
	}

}
