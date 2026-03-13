public class Lecturer extends Person {
    private String department;

    public Lecturer(String id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public void displayDetails() {
        System.out.println("Lecturer: " + getId() + "  " + getName() +
                "  " + getEmail() + "  Dept: " + department);
    }
}