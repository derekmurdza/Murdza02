
// This program returns the original number to the main class
public class Decrypter {

	public static int decrypt( int n) 
	{
	   // Obtain individual digits from Application class
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	   
	   // Reverse the Encryption
	   a = a - 7;
	   	if (a < 0) {
	   		a += 10;
	   	}
	   
	   b = b - 7;
	   	if (b < 0) {
	   		b += 10;
		}
	   
	   c = c - 7;
	   	if (c < 0) {
	   		c += 10;
		}
	   
	   d = d - 7;
	   	if (d < 0) {
		    d += 10;
		}
	   
	   // Return the original number to the Application class  
	   return (c * 1000 + d * 100 + a * 10 + b);	
	}
}
