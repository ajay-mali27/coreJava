
package EncapPrograms;

public class hacker {
	public static void main(String[] args) {

		user a = new user();
		// Print The Getter Method
		System.out.println(a.getBalance());

		// // Print The Setter Method
		int SB = a.setBalance(95369);
		System.out.println("We change the User's Salary to :" + SB);
	}
}
