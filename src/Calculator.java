package src;
import java.util.ArrayList;

public class Calculator {
    public static double calculateGPA(ArrayList<ClassInfo> classInfos) {
        double sum = 0.0;
        double creditsCount = 0.0;
        for (ClassInfo classInfo : classInfos) {
            double gradeWeight;
            if (classInfo.getGrade() >= 97) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                    6.1 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        5.6 : 4.6
                   )
            } else if (classInfo.getGrade() >= 94) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        5.8 : (classInfo.getCourseLevel() == CourseLevel.HONORS ?
                        5.3 : 4.3
                )
            } else if (classInfo.getGrade() >= 90) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        5.5 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        5.0 : 4.0
                )
            } else if (classInfo.getGrade() >= 87) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        5.1 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        4.6 : 3.6
                )
            } else if (classInfo.getGrade() >= 84) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        4.8 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        4.3 : 3.3
                )
            } else if (classInfo.getGrade() >= 80) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        4.5 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        4.0 : 3.0
                )
            } else if (classInfo.getGrade() >= 77) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        4.1 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        4.0 : 3.0
                )
            } else if (classInfo.getGrade() >= 74) {

            } else if (classInfo.getGrade() >= 70) {
            } else if (classInfo.getGrade() >= 67) {

            } else if (classInfo.getGrade() >= 65) {

            } else {

            }
        }
    }
}