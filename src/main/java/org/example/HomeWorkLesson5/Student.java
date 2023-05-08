package org.example.HomeWorkLesson5;

public class Student {
    int ticketNumber;
    String name;
    String secondName;
    int year;
    double averageMath;
    double averageEcon;
    double averageForeign;

}

class StudnetTest {
    static void showInfo (Student st) {
        double result = (st.averageMath + st.averageForeign + st.averageEcon)/3;
        System.out.println("Средня оценка студента: " + st.name + " " + st.secondName + " - " + result);
    }
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "Ivan";
        st1.secondName = "Ivanov";
        st1.ticketNumber = 123531;
        st1.year = 21;
        st1.averageMath = 4.6;
        st1.averageEcon = 3.4;
        st1.averageForeign = 5.0;
        showInfo(st1);

        Student st2 = new Student();
        st2.name = "Anya";
        st2.secondName = "Petrova";
        st2.ticketNumber = 313521;
        st2.year = 23;
        st2.averageMath = 2.4;
        st2.averageEcon = 0.4;
        st2.averageForeign = 4.0;
        showInfo(st2);

        Student st3 = new Student();
        st3.name = "Oleg";
        st3.secondName = "Kinochnov";
        st3.ticketNumber = 526123;
        st3.year = 18;
        st3.averageMath = 5.0;
        st3.averageEcon = 5.0;
        st3.averageForeign = 5.0;
        showInfo(st3);

    }
}
