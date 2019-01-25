package lesson_6_enums;

import java.util.ArrayList;

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

    public void checkStudentsFaculty(Faculties faculty) {
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter : getStudents()) {
            if (counter.getFaculty().equals(faculty)) {
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students of " + faculty + " are: " + temp);
    }

    public void checkFacultyAndCourse(Faculties faculty, Course course) {
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter : getStudents()) {
            if (counter.getFaculty().equals(faculty) && counter.getCourse().equals(course)) {
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students of " + faculty + " and " + course + " course are: " + temp);
    }

    public void checkBirthday(int birthday) {
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter : getStudents()) {
            if (counter.getBirthday() > birthday) {
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students were born after 1995: " + temp);
    }

    public void checkGroup(Groups group) {
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter : getStudents()) {
            if (counter.getGroup().equals(group)) {
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students of " + group + " are: " + temp);
    }

    public void printFaculty() {
        System.out.println("All faculties: ");
        for (Faculties counter : Faculties.values()) {
            System.out.println(counter);
        }
    }

    public void printCourse() {
        System.out.println("All courses: ");
        for (Course counter:Course.values()) {
            System.out.println(counter);
        }
    }

    public void printGroup(){
        System.out.println("All groups: ");
        for (Groups counter : Groups.values()) {
            System.out.println(counter.toString());
        }
    }
}
