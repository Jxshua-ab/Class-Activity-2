public class Main {
    public static void main(String[] args) {
        Student s = new Student("S1", "Joshua", "joshua.abishua@strathmore.edu", "Diploma In Business Information Technology");
        Lecturer l = new Lecturer("L1", "Kelvin Ouma", "kouma@strathmore.edu", "Strathmore Institute");
        Course c = new SimpleCourse("1201", "Object Oriented Programming");

        Person personRef = s;
        personRef.displayDetails();

        l.displayDetails();
        c.displayDetails();
    }
}
