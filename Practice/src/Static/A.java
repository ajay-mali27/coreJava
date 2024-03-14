package Static;

public class A {

	// A Person whose Salary is 6000
	int Salary = 6000;

	void SpendSalary(int amtOfSpnd) {

		Salary = Salary - amtOfSpnd;
		System.out.println("Your Salary is :" + Salary);
	}

	public static void main(String[] args) {
		// We create an object to call the method

		A ss = new A();
		ss.SpendSalary(2000); // our remainging salary will be : 4000;

		// ********** Problem ********

		// If we create another Object Then Se what Happends
		// our remaining Salary is 4000 ,now we are spending 1000 again

		A SP = new A();
		SP.SpendSalary(1000);
		// It is showing 5000 but our remaming salary expected to 3000.
		// So this problem we can solve with Static keyword
	}

}

