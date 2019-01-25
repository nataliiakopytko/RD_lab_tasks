package lesson_4_set_map;

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

    public void checkStudentsFaculty( String faculty){
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter: getStudents()) {
            if (counter.getFaculty().contains(faculty)){
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students of " +  faculty + " are: " + temp);
    }

    public void checkFacultyAndCourse(String faculty, String course) {
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter : getStudents()) {
            if (counter.getFaculty().contains(faculty) && counter.getCourse().contains(course)) {
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students of " + faculty + " and " + course + " course are: "+ temp);


    }

    public void checkBirthday(){
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter:getStudents()) {
            if(counter.getBirthday() > 1995){
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students were born after 1995: " + temp);
    }

    public void checkGroup( String group ){
        ArrayList<String> temp = new ArrayList<>();
        for (Student counter:getStudents()) {
            if(counter.getGroup().contains(group)){
                temp.add(counter.getLastName());
            }
        }
        System.out.println("Students of " + group + " are: " + temp);
    }
}
