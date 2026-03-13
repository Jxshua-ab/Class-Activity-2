public class SimpleCourse extends Course {
    public SimpleCourse(String code, String title) {
        super(code, title);
    }

    @Override
    public String courseType() {
        return "Simple Course";
    }
}