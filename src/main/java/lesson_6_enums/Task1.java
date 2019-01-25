package lesson_6_enums;

import java.util.ArrayList;

public class Task1 {
    public void task1() {
        Test objectTest = new Test();
        ArrayList<Student> students = objectTest.student();
        University company = new University("VNTU", students);
        company.setStudents(students);

        System.out.println("The university is: " + company.getUniversityName());
        System.out.println(" ");

        company.checkStudentsFaculty(Faculties.FITKI);
        System.out.println(" ");

        company.checkFacultyAndCourse(Faculties.FITKI, Course.Fourth);
        System.out.println(" ");

        company.checkBirthday( 1995 );
        System.out.println(" ");

        company.checkGroup(Groups.PI);
        System.out.println(" ");

        company.printFaculty();
        System.out.println(" ");

        company.printCourse();
        System.out.println(" ");

        company.printGroup();

    }
}
