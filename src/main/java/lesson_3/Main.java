package lesson_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Test objectTest = new Test();
        ArrayList<Person> People = objectTest.people();

        Company company = new Company("EPAM");
        company.setEmployees(People);
        company.checkAmountOfEmployees();
        company.checkEmployeeName("Oleksandr");
        company.checkEmployeeLastName("Kopytko");
    }
}