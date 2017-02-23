
public class BasicMath {
	public static void main(String[] args) {
		int a, b, c, d, e, f, g; // Here we are calling 7 'int' variables. 
		
		double x, y, z; // We make 3 double variables here. 
		
		String firstName, lastName, fullName; // 3 String variables

		a = 11;
		b = 7;

		System.out.println("a is " + a + ", b is " + b);

		c = a + b; // C becomes the value of 11+7 
		System.out.println("a + b is " + c); //This line should print the value of C. 18
		
		d = a - b; // D becomes the value of 11-7
		System.out.println("a-b is " + d); //This line should print out the value of D, or 4
		
		e = a+b*3; // E becomes the value of 11 + 7 * 3. (Be aware of PEMDAS, or the order of operations,)
		System.out.println("a+b*3 is " + e);
		
		f = b / 2; // F takes the value of 7/2. Be aware of the answer. 
		System.out.println("b/2 is " + f);
		
		g = b % 10; // % is the remainder symbol. In division sometimes you have a remainder. % gets that value. 
		System.out.println("b%10 is " + g);
		
		x = 1.1; // X is a double. 
		System.out.println( "\nx is " + x );
		
		y = x*x;
		System.out.println( "x*x is " + y );
		
		z = b / 2;
		System.out.println( "b/2 is " + z );
		System.out.println(); // This prints an empty lines. Used for readability. 

		firstName = "Erick";
		lastName = "Herrera";
		fullName = firstName + lastName;

		System.out.println(fullName);
	}
}