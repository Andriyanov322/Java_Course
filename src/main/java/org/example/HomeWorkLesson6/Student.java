package org.example.HomeWorkLesson6;

public class Student {
    int ticketNumber;
    String name;
    String secondName;
    int year;
    double averageMath;
    double averageEcon;
    double averageForeign;
    Student (int ticketNumber, String name, String secondName, int year, double averageMath, double averageEcon, double averageForeign) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.secondName = secondName;
        this.year = year;
        this.averageMath = averageMath;
        this.averageEcon = averageEcon;
        this.averageForeign = averageForeign;
    }
    Student (int ticketNumber, String name, String secondName, int year) {
        this(ticketNumber, name, secondName, year, 0, 0, 0);
    }
    Student () {
        this(0, null, null, 0);
    }
 }

class StudnetTest {
    static void showInfo (Student st) {
        double result = (st.averageMath + st.averageForeign + st.averageEcon)/3;
        System.out.println("Средня оценка студента: " + st.name + " " + st.secondName + " - " + result);
    }
    public static void main(String[] args) {

        Student st1 = new Student(123531,"Ivan", "Ivanov", 21, 4.6, 3.4, 5.0);
        showInfo(st1);

        Student st2 = new Student(313521, "Anya", "Petrova", 23);
        showInfo(st2);

        Student st3 = new Student();
        showInfo(st3);

    }
}