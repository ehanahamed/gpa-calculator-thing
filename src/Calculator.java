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
                        5.8 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
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
                            3.6 : 2.6
                )
            } else if (classInfo.getGrade() >= 74) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        3.8 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        3.3 : 2.3
            } else if (classInfo.getGrade() >= 70) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        3.5 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        3.0 : 2.0
            } else if (classInfo.getGrade() >= 67) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        3.1 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        2.6 : 1.6
            } else if (classInfo.getGrade() >= 65) {
                gradeWeight = classInfo.getCourseLevel() == CourseLevel.AP ?
                        2.8 : (classInfo.getCourseLevel() == CourseLevel.Honors ?
                        2.3 : 1.3
            } else {
                gradeWeight = 0;
            }
        }
    }
}