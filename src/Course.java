public abstract class Course implements Display {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public abstract String courseType();

    @Override
    public void displayDetails() {
        System.out.println(courseType() + ": " + code + "  " + title);
    }
}
