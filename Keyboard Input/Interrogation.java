import java.util.Scanner;

public class Interrogation {
	public static void main(String[] args) {

		String name, favoriteShow, favoriteActivity, confession;
		int age;

		Scanner answer = new Scanner(System.in);

		System.out.print("Hey you. What do you go by? ");
		name = answer.next();

		System.out.print("So, " + name + "! How old are you?");
		age = answer.nextInt();

		System.out.println("So you're " + age + ". You're pretty old.");
		System.out.print("What is your favorite show, " + name + "?");
		favoriteShow = answer.next();

		System.out.println(favoriteShow + ". That show isn't that interesting...");
		System.out.print("What's your favorite thing to do, " + name + "? ");
		favoriteActivity = answer.next();

		System.out.print(favoriteActivity + "? That does not sound like fun at all.");
		System.out.println("Do you need to confess to anything, " + name + "?");
		confession = answer.next();
		
		System.out.println("YOU'RE A LIAR, " + name + "!");
	}
}