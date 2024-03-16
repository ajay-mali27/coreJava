package PracticeEncap;

public class c {
	
	int getAge(int age) {
		if (age > 0 && age <= 100) {
			System.out.println("Please Enter Your age: " + age);

		} else if (age <= 0) {
			System.out.println("Enter Valid Age");
		}

		return 0;
	}
	
	
	public static void main(String[] args) {
		c ageObj = new c();
		ageObj.getAge(-1);
	}
}
