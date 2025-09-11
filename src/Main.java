package src;
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
            System.out.print("Type the course level: ");
            String courseLevel = scan.nextLine();
            CourseLevel courseLevelEnum;
            try {
                courseLevelEnum = CourseLevel.valueOf(courseLevel);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid course level. Try again.");
                continue;
            }
            System.out.print("Enter your grade: ");
            double courseGrade = scan.nextDouble();
            classes.add(new ClassInfo(courseName, courseLevelEnum, courseGrade));
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

        System.out.println("Calculating your GPA...");
        System.out.println(Calculator.calculateGPA(classes));

    }
}
