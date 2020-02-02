import java.util.Scanner;

// This program provides output of a set of numbers using a specific Function
public class Application {
	
	public static void main(String[] args) {
		
		// Read in the number from the user
		try (Scanner integer = new Scanner(System.in)) {
			
			// Variable Declaration
			int n;
			
			System.out.println("Select Method: 1. Encryption or 2. Decryption");
			int choice = integer.nextInt();
			
			if (choice == 1 ) {
			// Prompt the user for a response
			System.out.println("\nEnter a four digit number:");	
			n = integer.nextInt();
			
			// Print out the encrypted value from the Encrypter class
			System.out.println("\nThe encrypted number is: " +Encrypter.encrypt(n));
			}
			
			if (choice == 2 ) {
				// Prompt the user for a response
				System.out.println("\nEnter a four digit number:");	
				n = integer.nextInt();
				
				// Print out the decrypted value from the Decrypter class
				System.out.println("\nThe decrypted number is: " +Decrypter.decrypt(n));
			}
		}
	}
}
