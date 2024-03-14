package Static2;

public class Parent {
	
	final int GenerationName(String father, String mother) {
		System.out.println("Father Name is :" + father);
		System.out.println("Father Name is :" + mother);
		return 0;
	}
	
	
	

	
	
	public static void main(String[] args) {
		Parent ss = new Parent();
		ss.GenerationName("Ravindra", "Shobha");
	}
}
