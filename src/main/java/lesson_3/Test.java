package lesson_3;

import java.util.ArrayList;

public class Test {
    public ArrayList<Person> people() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Andy", "Marchenko", 20));
        personArrayList.add(new Person("Oleksandr", "Yaroslavtsev", 21));
        personArrayList.add(new Person("Oleksandr", "Antonkin", 22));
        personArrayList.add(new Person("Oleksandr", "Shevchenko", 23));
        personArrayList.add(new Person("Nataliia", "Kopytko", 22));
        personArrayList.add(new Person("Anastasiia", "Yarova", 24));
        personArrayList.add(new Person("Zarina", "Bozhyk", 25));
        personArrayList.add(new Person("Lesya", "Parypsa", 26));
        personArrayList.add(new Person("Oleksandra", "Sandul", 24));
        personArrayList.add(new Person("Andrii", "Melchenko", 16));
        return personArrayList;
    }
}
