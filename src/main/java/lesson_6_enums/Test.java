package lesson_6_enums;

import java.util.ArrayList;

public class Test {
        public ArrayList<Student> student(){
           ArrayList<Student> listOfStudents = new ArrayList<>();
           listOfStudents.add(new Student("Valya", "Boyko", 1996, 1, Faculties.FITKI, Course.Fourth, Groups.PI));
           listOfStudents.add(new Student("Tanya", "Panasyuk", 1996, 2, Faculties.FITKI, Course.Fourth, Groups.PI));
           listOfStudents.add(new Student("Nataliia", "Kopytko", 1996, 3, Faculties.FITKI, Course.Fourth, Groups.PI));
           listOfStudents.add(new Student("Roman", "Varkov", 1998, 4, Faculties.FBTG, Course.Fourth, Groups.BI));
           listOfStudents.add(new Student("Roman", "Gavryliuk", 2005, 5, Faculties.FIRN, Course.Fifth, Groups.RT));
           listOfStudents.add(new Student("Serhii", "Demchuk", 2006, 6, Faculties.FAKSU, Course.Fifth, Groups.OT));
           listOfStudents.add(new Student("Iryna", "Samchuk", 1992, 7, Faculties.FITKI, Course.Fifth, Groups.VM));
        return listOfStudents;
    }
}
