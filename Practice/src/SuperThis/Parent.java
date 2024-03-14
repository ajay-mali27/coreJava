package SuperThis;

public class Parent {
	int value = 58; // => Cannot use in main method.

	Parent() {
		this(5);
		System.out.println("First Constructor "+value);
	}

	Parent(int value) {
		this.value = value;
//		System.out.println("Second Constructor " + value);
//		
	}

	public static void main(String[] args) {

		Parent ss = new Parent();
	}
}
