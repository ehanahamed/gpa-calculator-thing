import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ClassInfo> classes = new ArrayList<ClassInfo>();
        System.out.println("GPA Calculator");
        boolean continueLooping = true;

        /* allows user to add courses */
        while (continueLooping) {
            System.out.print("Course name: ");
            String courseName = scan.nextLine();
            System.out.print("Type the course level (AP, Honors) or leave blank: ");
            String courseLevel = scan.nextLine();
            CourseLevel courseLevelEnum;
            try {
                courseLevelEnum = CourseLevel.valueOf(courseLevel.toUpperCase());
            } catch (IllegalArgumentException e) {
                if (courseLevel.isEmpty()) {
                    courseLevelEnum = CourseLevel.ACADEMIC;
                } else {
                    System.out.println("Invalid course level. Try again.");
                    continue;
                }
            }
            System.out.print("Enter your grade (0-100): ");
            double courseGrade = scan.nextDouble();
            System.out.print("Credits for this course: ");
            double courseCredits = scan.nextDouble();
            classes.add(new ClassInfo(courseName, courseLevelEnum, courseGrade, courseCredits));
            scan.nextLine();
            System.out.print("Add another course? (type 'yes' or 'no'): ");
            String addCourse = scan.nextLine();
            if (addCourse.equalsIgnoreCase("no")) {
                continueLooping = false;
            }
        }

        /* clears screen */
        for(int i = 0; i < 11; i++) {
            System.out.println(" ");
        }

        /* gives user their GPA */
        System.out.println("Calculating your GPA...");
        System.out.println(Calculator.calculateGPA(classes));

    }
}
