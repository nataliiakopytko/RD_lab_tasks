package lesson_3;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Person> employees;
    private ArrayList<Person> temp = new ArrayList<>();
    private ArrayList<Person> temp1 = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName, ArrayList<Person> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }

    public int checkAmountOfEmployees(){
        System.out.println("Amount of employees: " + employees.size());
        return employees.size();
    }

    public int checkEmployeeName(String name){
        for (Person counter: getEmployees()) {
            if (counter.getFirstName().contains(name)){
                temp.add(new Person(counter.getFirstName(), counter.getLastName(), counter.getAge()));
            }
        }
        System.out.println("Amount of " + name + " is: " + temp.size());
        return temp.size();
    }

    public int checkEmployeeLastName(String lastName){
        for (Person counter: getEmployees()) {
            if (counter.getLastName().contains(lastName)){
                temp1.add(new Person(counter.getFirstName(), counter.getLastName(), counter.getAge()));
            }
        }
        System.out.println("Amount of " + lastName + " is: " + temp1.size());
        return temp1.size();
    }


}
