
// This program encrypts a given set of four integers
public class Encrypter {
	
	public static int encrypt(int n)
	{
	   // Obtain individual digits using the Application class
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	   
	   // Add seven to each digit and take the remainder after dividing by ten
	   a = (a + 7) % 10;
	   b = (b + 7) % 10;
	   c = (c + 7) % 10;
	   d = (d + 7) % 10;
	   
	   // Return the encrypted value while swapping A <-> C, B <-> D
	   return (c * 1000 + d * 100 + a * 10 + b);
	}
}



