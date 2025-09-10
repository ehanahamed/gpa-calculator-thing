package src;

enum CourseLevel {
    AP, HONORS, ACADEMIC
}

public class ClassInfo {
    private String className;
    private CourseLevel courseLevel;
    private double grade;

    public ClassInfo(String className2, CourseLevel courseLevel2, double grade2) {
        className = className2;
        courseLevel = courseLevel2;
        grade = grade2;
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

    public void updateGrade(double g) {
        grade = g;
    }

    public void updateCourseName(String cn) {
        className = cn;
    }

    public void updateLevel(CourseLevel level) {
        courseLevel = level;
    }
}
