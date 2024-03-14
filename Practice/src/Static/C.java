package Static;

public class C {
//	Static variable
	static int carPrice = 90000;

	
	// Static Method

	public static void car(int remnBal) {
		carPrice = carPrice - remnBal;
		System.out.println("Your Remaining Balance is :" + carPrice);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// we can call static things by 2 ways :
		// 1) By class Name : ClassName.variableName
//			2) By Object 

		System.out.println(C.carPrice);

		// Call Static Method

		C.car(5000);

		// NOTE: Please ensure that your method is static and you are calling a
		// method not variable

	}
	
	
	
	
	
	
}
