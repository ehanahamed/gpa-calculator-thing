public class ClassInfo {
    private String className;
    private CourseLevel courseLevel;
    private double grade;
    private double credits;

    public ClassInfo(String className2, CourseLevel courseLevel2, double grade2, double credits2) {
        className = className2;
        courseLevel = courseLevel2;
        grade = grade2;
        credits = credits2;
    }

    public String getClassName() {
        return className;
    }

    public CourseLevel getCourseLevel() {
        return courseLevel;
    }

    public double getGrade() {
        return grade;
    }

    public double getCredits() {
        return credits;
    }

    public void updateGrade(double g) {
        grade = g;
    }

    public void updateCredits(double c) {
        credits = c;
    }

    public void updateCourseName(String cn) {
        className = cn;
    }

    public void updateLevel(CourseLevel level) {
        courseLevel = level;
    }
}
