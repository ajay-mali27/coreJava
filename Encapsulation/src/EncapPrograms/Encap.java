package EncapPrograms;

public class Encap {
	
	
	
	void myAge(int a){
		int age=a;
		
		if(age>30){
			System.out.println("My age is: "+age);	
		}
		 if (age <0){
			
			System.out.println("Age cannot be less than zero");
		}
		else if (age ==0){
			System.out.println("Age should be Greater Than zero");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
Encap getAge=new Encap();
getAge.myAge(150);
	}
}
