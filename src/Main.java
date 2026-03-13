import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String studentId = null;
        String studentName = null;
        String studentEmail = null;
        String studentCourse = null;

        String lecturerId = null;
        String lecturerName = null;
        String lecturerEmail = null;
        String lecturerDept = null;

        String courseCode = null;
        String courseName = null;

        try {
            System.out.println("Create Student");
            System.out.print("Enter student ID: ");
            studentId = input.nextLine();

            System.out.print("Enter student name: ");
            studentName = input.nextLine();

            System.out.print("Enter student email: ");
            studentEmail = input.nextLine();

            System.out.print("Enter student course: ");
            studentCourse = input.nextLine();

            System.out.println("\nCreate Lecturer");
            System.out.print("Enter lecturer ID: ");
            lecturerId = input.nextLine();

            System.out.print("Enter lecturer name: ");
            lecturerName = input.nextLine();

            System.out.print("Enter lecturer email: ");
            lecturerEmail = input.nextLine();

            System.out.print("Enter lecturer department: ");
            lecturerDept = input.nextLine();

            System.out.println("\nCreate Course");
            System.out.print("Enter course code: ");
            courseCode = input.nextLine();

            System.out.print("Enter course name: ");
            courseName = input.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input detected. Please restart and enter text correctly.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("\nAttempted to read all user details.");
        }

        if (studentId != null && studentName != null &&
                lecturerId != null && lecturerName != null &&
                courseCode != null && courseName != null) {

            Student s = new Student(studentId, studentName, studentEmail, studentCourse);
            Lecturer l = new Lecturer(lecturerId, lecturerName, lecturerEmail, lecturerDept);
            Course c = new SimpleCourse(courseCode, courseName);

            students.add(s);

            Person personRef = s;
            personRef.displayDetails();

            l.displayDetails();
            c.displayDetails();

            System.out.println("All Students in Collection");
            for(Student st : students)
            {
                st.displayDetails();
            }

            StudentsFileStorage.saveStudents(students, "students.txt");

            List<Student> loadedStudents = StudentsFileStorage.loadStudents("students.txt");

            System.out.println("Students Loaded From File");
            for (Student st : loadedStudents)
            {
                st.displayDetails();
            }

        } else {
            System.out.println("Could not create objects because some input was invalid or missing.");
        }

        input.close();
    }
}

