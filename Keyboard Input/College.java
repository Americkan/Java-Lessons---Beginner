import java.util.Scanner;

public class College {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String firstName, lastName, login, password;
        int grade, studentID;
        double GPA;

        System.out.println("CSU/UC Application Sign-Up");

        System.out.print("First name: ");
        firstName = input.next();

        System.out.print("Last name: ");
        lastName = input.next();

        System.out.print("Major: ");
        grade = input.nextInt();

        System.out.print("Student ID: ");
        studentID = input.nextInt();

        System.out.print("Login: ");
        login = input.next();

        System.out.print("Password: ")
        password = input.next();

        System.out.print("GPA: ");
        GPA = input.nextDouble();

        System.out.println();
        System.out.println();
        System.out.println("Your information:");
        System.out.println("\tLogin: " + login);
        System.out.println("\tPassword: " + login);
        System.out.println("\tID:    " + studentID);
        System.out.println("\tName:  " + lastName + ", " + firstName);
        System.out.println("\tGPA:   " + GPA);
    }
}