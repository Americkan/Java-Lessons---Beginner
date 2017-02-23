 import java.util.Scanner; //We grab a library that allows us to use new things. 
 
 public class Answers {
 	public static void main(String[] args) {
 		Scanner response = new Scanner(System.in); //Create a Scanner object with the name "response". It can be called anything other than response as well. 

 		System.out.println("What is your name?");
 		response.next(); // This will pause the program and wait for a human response. i.e type anything and press ENTER. The Scanner object will save the response as a String. 

 		System.out.println("Where were you born?");
 		response.next();

 		System.out.println("How old are you?");
 		response.nextInt(); // nextInt will allow the response to be an integer/number. 

 		System.out.println("What is your favorite movie quote of all time?");
 		response.next();
 	}
 }