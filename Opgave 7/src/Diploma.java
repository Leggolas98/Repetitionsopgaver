import java.util.ArrayList;

public class Diploma {
    String studentName;
    ArrayList<Course> courses = new ArrayList<>();

    public Diploma(String studentName) {
        this.studentName = studentName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String toString() {
        System.out.println(studentName + " " + courses);
        return studentName + " " + courses;
    }

    public int getAverageGrade() {
        int grade = 0;

        for (Course course : courses) {
            grade += course.grade;
        }

        int averageGrade = grade / courses.size();
        System.out.println("The average of the grades is: " + averageGrade);
        return averageGrade;
    }
}
