package org.example.HomeWorkLesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private int salary;
    String department;
    Employee(int id) {
        this.id = id;
    }
    private Employee(String surname) {
        this.surname = surname;
    }
    public Employee(int salary, int id) {
        this.id = id;
        this.salary = salary;
    }
    int doubleSalary () {
        salary *= 2;
        return salary;
    }
    public void showSalary() {
        System.out.print(salary);
    }
    public void showId() {
        System.out.println(id);
    }
    public void showSurName() {
        System.out.println(surname);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(23000,2);
        Employee e3 = new Employee("Andriyanov");
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(23000,2);
        //Employee e3 = new Employee("Andriyanov");
    }
}
