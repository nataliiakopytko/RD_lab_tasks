package lesson_4_set_map;

import java.util.ArrayList;

public class Task1 {
    public void task1() {
        Test objectTest = new Test();
        ArrayList<Student> students = objectTest.student();
        University company = new University("VNTU", students);
        company.setStudents(students);

        System.out.println("The university is: " + company.getUniversityName());
        System.out.println(" ");

        company.checkStudentsFaculty("FITKI");
        System.out.println(" ");

        company.checkFacultyAndCourse("FITKI", "5");
        System.out.println(" ");

        company.checkBirthday();
        System.out.println(" ");

        company.checkGroup("1PI-17m");
    }
}
