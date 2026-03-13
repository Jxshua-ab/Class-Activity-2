public class Student extends Person {
    private String course;

    public Student(String id, String name, String email, String course) {
        super(id, name, email);
        this.course = course;
    }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + getId() + "  " + getName() +
                "  " + getEmail() + "  Course: " + course);
    }
}