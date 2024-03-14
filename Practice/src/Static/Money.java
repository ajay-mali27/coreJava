package Static;

public class Money {
	static int salary = 90000;

	
	static void spendSal(int spend) {
		salary = salary - spend;
		System.out.println("Your Remaining Balance is =>" + salary);
	}
	
	public static void main(String[] args) {
		// Done Shopping from Amzon
		Money AZ = new Money();
		AZ.spendSal(500);

		// Done Shopping from Flipkart
		Money FK = new Money();
		FK.spendSal(500);

		// Done Shopping from Lenskart
		Money LC = new Money();
		LC.spendSal(500);
	}
	
}
