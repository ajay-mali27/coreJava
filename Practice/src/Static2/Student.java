package Static2;

public class Student extends Parent{
	@Override
	int GenerationName(String father, String mother) {
		System.out.println("My Father is a :" + father);
		System.out.println("My Mother is a :" + mother);
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		Student ss = new Student();
		ss.GenerationName("ajay", "kalyani");

		System.out.println(RollNo);	
	}
}
