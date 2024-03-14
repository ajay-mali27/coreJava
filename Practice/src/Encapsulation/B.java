package Encapsulation;

public class B {
	
	public static void main(String[] args) {

		A sal = new A();
		// Get Salary
		System.out.println("Your Salary is :" + sal.getSalary());
		;

		// Set Salary;
		 int SB = sal.setSalary = 9900;
//		int setSalary = 5000;
//		System.out.println(setSalary);
		 System.out.println("The New Salary is :"+SB);
	}
}
