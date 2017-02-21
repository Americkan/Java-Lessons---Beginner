public class Variables {
	public static void main( String[] args ) {
		int a, b, c; // The variables can be called in one line. They are seperated by ',' but the ending is still with a ';'

		int life; // The variables can also be indivdually called on seperate lines. 
		int year;

		double pace, pie; 
		String firstName, lastName; // variables cannot have spaces in them. If you wanted to add a space it would be as first_Name. 

		String title;

		a = 22;
		b = 23;
		c = 24;

		pace = 56.54; //Notice how these values have decimal values. They can only be held by a double variable. 
		pi = 3.14;

		firstName = "Erick"; //String values must be in "___________". Another example. firstName = Apple; would be incorrect. firstName = "Apple"; is correct. 
		lastName = "Herrera";
		title = "Commander";

		life = 42;
		year = 2017;

		System.out.println( "The variable a contains " + a );
		System.out.println( "The value " + b + " is stored in the variable b." );
		System.out.println( "This is the year " + year);
		System.out.println( "My name is " + firstName + " " + lastName + " and my title is " + title);
		System.out.println( "I am currently " + a + " and next year I will be " + b + " and the year after that I will be " + c );
		System.out.println( "I do not run very fast, it takes me " + pace + " seconds to run a lap." );
		System.out.println( "I like pi, and it is represented in math as " + pi);
		System.out.println( "The meaning of life is " + life);
	}
}