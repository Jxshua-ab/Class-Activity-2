import java.util.InputMismatchException;
import java.util.Scanner;

public class UniversityMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter student age: ");
                age = input.nextInt();      // may throw InputMismatchException
                if (age <= 0) {
                    System.out.println("Age must be positive. Try again.");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number, please enter an integer.");
                input.next(); // clear wrong token
            } finally {
                System.out.println("Age input attempt finished.\n");
            }
        }

        System.out.println("Student age recorded: " + age);
        input.close();
    }
}

