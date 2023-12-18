public class Main {
    public static void main(String[] args) {
Diploma diploma = new Diploma("Jonathan");

Course Biologi = new Course("Biologi", 12);
diploma.addCourse(Biologi);

Course Matematik = new Course("Matematik", 12);
diploma.addCourse(Matematik);

Course Engelsk = new Course("Engelsk", 12);
diploma.addCourse(Engelsk);

diploma.toString();
diploma.getAverageGrade();
    }
}
