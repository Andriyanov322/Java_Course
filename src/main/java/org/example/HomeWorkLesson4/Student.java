package org.example.HomeWorkLesson4;
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
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.averageMath = 4.6;
        st1.averageEcon = 3.4;
        st1.averageForeign = 5.0;
        System.out.println("Средняя оценка по математике первого студента: " + st1.averageMath + "\nСредняя оценка по экономике первого студента: " + st1.averageEcon + "\nСредняя оценка по иностранному языку первого студента: " + st1.averageForeign);

        st2.averageMath = 2.4;
        st2.averageEcon = 0.4;
        st2.averageForeign = 4.0;
        System.out.println("\nСредняя оценка по математике второго студента: " + st2.averageMath + "\nСредняя оценка по экономике второго студента: " + st2.averageEcon + "\nСредняя оценка по иностранному языку второго студента: " + st2.averageForeign);

        st3.averageMath = 5.0;
        st3.averageEcon = 5.0;
        st3.averageForeign = 5.0;
        System.out.println("\nСредняя оценка по математике третьего студента: " + st3.averageMath + "\nСредняя оценка по экономике третьего студента: " + st3.averageEcon + "\nСредняя оценка по иностранному языку третьего студента: " + st3.averageForeign);
    }
}
