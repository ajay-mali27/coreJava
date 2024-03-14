package Static;

public class Ajay {
	
static int salary=6000;

void countSal(int spend) {
	int remAmount = salary - spend;
	System.out.println(remAmount);
}

public static void main(String[] args) {
	
	Ajay amz=new Ajay();
	amz.countSal(200);
	
	Ajay fk=new Ajay();
	amz.countSal(200);
	
	Ajay f5k=new Ajay();
	amz.countSal(2500);
}



}
