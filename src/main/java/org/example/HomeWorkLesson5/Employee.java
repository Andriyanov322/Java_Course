package org.example.HomeWorkLesson5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;
    Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    int doubleSalary () {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Andriyanov", 21, 21000, "ASU");
        System.out.println("Текущвя зарплата сотрудника " + e1.surname + " : " + e1.salary);
        e1.doubleSalary();
        System.out.println("Увеличенная зарплата сотрудника " + e1.surname + " : " + e1.salary + "\n");

        Employee e2 = new Employee(2, "Scholtz", 56, 73000, "IT");
        System.out.println("Текущвя зарплата сотрудника " + e2.surname + " : " + e2.salary);
        e2.doubleSalary();
        System.out.println("Увеличенная зарплата сотрудника " + e2.surname + " : " + e2.salary);

    }
}
