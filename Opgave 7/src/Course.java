public class Course {
    String courseName;
    int grade;

    public Course(String courseName, int grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    public String toString() {
        return courseName + ", " + grade;
    }
}
