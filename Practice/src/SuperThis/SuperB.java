package SuperThis;

public class SuperB extends SuperA {
// Work - Call Parent class method as well as child class method m1() simultanously;

	SuperB() {
//		super();   //Super constructor (Parent) will be called.
		
//		super();  => if we dont write super keyword then java bydefault write it.
//		and our work will be done
	}
	
//	SuperB() {} => apan jari ha constructor nahi takla ani tyacha madhe super(); 
//	nhi write kela tari pn java tyala print karel. becoz java bydefault kaun deto
	
	
	
	
	@Override

	void m1() {
//		SuperA oo = new SuperA();
		super.m1();
//		oo.m1();
		System.out.println("I am Groot."); // WAY -1 but wastage of memory
	};
	
	void m2() {
		
		m1();
	}
	
	
	public static void main(String[] args) {
		SuperB ss = new SuperB();
		ss.m2();
	}
}
