package Static;

public class E {
//	Non Static Block : can be called with the creation of constructor
	{
		System.out.println("This is Non Static Block");
	}
	
	// Static Block :It automatically called.No need of constructor and Object Creation
	static {
		System.out.println("This is a static block");
	}
	
	
	// Constructor

	E() {
		System.out.println("Hello This is a constructor");
	}
	
	// Method
	int ThreeSum(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("The Sum of Thee Number is :" + sum);
		return 0;
	}
	
	
	

	public static void main(String[] args) {

		E ss = new E();
		ss.ThreeSum(5, 6, 7);
		
		
//		See carefully how this things are calling 
//		1) static 2) non static 3) Constructor 4) Method
	}
}
