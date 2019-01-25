package lesson_4_set_map;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
        public ArrayList<Student> student(){
           ArrayList<Student> listOfStudents = new ArrayList<>();
           listOfStudents.add(new Student("Valya", "Boyko", 1996, 1, "FITKI", "5", "1PI-17m"));
           listOfStudents.add(new Student("Roman", "Varkov", 1998, 2, "FAKSU", "4", "2PI-17m"));
           listOfStudents.add(new Student("Roman", "Gavryliuk", 2005, 3, "FAKSU", "4", "1PI-17m"));
           listOfStudents.add(new Student("Serhii", "Demchuk", 2006, 4, "FITKI", "4", "1PI-17m"));
           listOfStudents.add(new Student("Iryna", "Samchuk", 1992, 5, "FITKI", "4", "2PI-17m"));

        return listOfStudents;

    }
}
