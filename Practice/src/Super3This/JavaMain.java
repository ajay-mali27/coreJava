package Super3This;

public class JavaMain extends C {
//	int a = 40;

	void m1() {
//		int a = 50;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);

		B ss = new B();
		System.out.println(ss.a);

		A A = new A();
		System.out.println("A class is :" + A.a);
	}

	public static void main(String[] args) {
		JavaMain ss = new JavaMain();
		ss.m1();
	}
}

//1:20:00; <<------------ Video Resume Kar