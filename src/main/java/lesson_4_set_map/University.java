package lesson_4_set_map;

import java.util.ArrayList;
import java.util.Comparator;

public class University {

    private String universityName;
    private ArrayList<Student> students;

    public University(String universityName, ArrayList<Student> students) {
        this.universityName = universityName;
        this.students = students;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", students=" + students +
                '}';
    }

    public void checkStudentsFaculty(String faculty) {
        ArrayList<String> temp = new ArrayList<>();
        getStudents().stream().
                filter(student -> student.getFaculty().contentEquals(faculty)).
                forEach(student -> temp.add(student.getLastName()));
        System.out.println("Students of " + faculty + " are: " + temp);
    }

    public void checkFacultyAndCourse(String faculty, String course) {
        ArrayList<String> temp = new ArrayList<>();
        getStudents().stream().
                filter(student -> student.getFaculty().contentEquals(faculty)
                        && student.getCourse().contentEquals(course)).
                forEach(student -> temp.add(student.getLastName()));
        System.out.println("Students of " + faculty + " and " + course + " course are: " + temp);
    }

    public void checkBirthday() {
        ArrayList<String> temp = new ArrayList<>();
        getStudents().stream().
                filter(student -> student.getBirthday() > 1995).
                forEach(student -> temp.add(student.getLastName()));
        System.out.println("Students were born after 1995: " + temp);
    }

    public void checkGroup(String group) {
        ArrayList<String> temp = new ArrayList<>();
        getStudents().stream().
                filter(student -> student.getGroup().contains(group)).
                forEach(student -> temp.add(student.getLastName()));
        System.out.println("Students of " + group + " are: " + temp);
    }

    public void sortStudentsWithStream() {
        ArrayList<String> temp = new ArrayList<>();
        getStudents().stream().
                sorted(Comparator.comparing(Person::getFirstName)).
                forEach(s -> temp.add(s.getFirstName()));
        System.out.println("Sorted list of students: " + temp);
    }
}
