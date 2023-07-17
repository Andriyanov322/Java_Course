package org.example.HomeWorkLesson22;
public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public void setname(StringBuilder name) {
        this.name = name;
    }

    public void getname() {
        System.out.println(name);
    }

    public void setcourse(int course) {
        this.course = course;
    }

    public void getcourse() {
        System.out.println(course);
    }

    public void setgrade(int grade) {
        this.grade = grade;
    }

    public void getgrade() {
        System.out.println(grade);
    }


    public void showinfo() {
        getname();
        getcourse();
        getgrade();
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setname(new StringBuilder("Максим"));
        s1.setgrade(4);
        s1.setcourse(4);
        s1.showinfo();
    }
}