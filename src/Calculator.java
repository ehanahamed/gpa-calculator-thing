public class Calculator {
    public static double calculateGPA(ArrayList<ClassInfo> classInfos) {
        double sum = 0.0;
        double creditsCount = 0.0;
        for (ClassInfo classInfo : classInfos) {
            double gradeWeight;
            if (classInfo.getGrade() >= 97) {
                gradeWeight = (classInfo.getCourseLevel() == CourseLevel.AP) ?
                    6.1 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        5.6 : 4.6
                   )
            } else if (classInfo.getGrade() >= 94) {

            } else if (classInfo.getGrade() >= 90) {

            } else if (classInfo.getGrade() >= 87) {

            } else if (classInfo.getGrade() >= 84) {

            } else if (classInfo.getGrade() >= 80) {

            } else if (classInfo.getGrade() >= 77) {

            } else if (classInfo.getGrade() >= 74) {

            } else if (classInfo.getGrade() >= 70) {
            } else if (classInfo.getGrade() >= 67) {

            } else if (classInfo.getGrade() >= 65) {

            } else {

            }
        }
    }
}