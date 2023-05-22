package org.example.HomeWorkLesson12;

public class Student {
    String name;
    String surname;
    int id;
    int course;
    Student (int id, String name, String surname, int course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
}

class StudentTest {
    static void studentsComparison (Student st1, Student st2) {
        if (st1.equals(st2)) {
            System.out.println("Данные студентов равны");
        }
        else {
            System.out.println("Данные студентов не равны");
        }
    }

    static void studentsComparison2 (Student st1, Student st2) {
        if(st1.id==st2.id) {
            if (st1.name.equals(st2.name)) {
                if (st1.surname.equals(st2.surname)) {
                    if (st1.course == st2.course) {
                        System.out.println("Данные студентов одинаковы");
                    }
                    else {
                        System.out.println("У студентов разные курсы");
                    }
                }
                else {
                    System.out.println("У студентов разные фамилии");
                }
            }
            else {
                System.out.println("У студентов разные имена");
            }
        }
        else {
            System.out.println("У студентов разные id");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student(1,"Максим", "Андриянов" , 4);
        Student st2 = new Student(1,"Максим", "Андриянов" , 4);
        studentsComparison(st1,st2);
        Student st3 = new Student(2,"Антон", "Андропов" , 2);
        Student st4 = new Student(2,"Антон", "Андриянов" , 2);
        studentsComparison2(st3,st4);
        st3.surname = "Андриянов";
        studentsComparison2(st3,st4);
    }
}
