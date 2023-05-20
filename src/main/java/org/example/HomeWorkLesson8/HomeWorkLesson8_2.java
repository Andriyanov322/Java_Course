package org.example.HomeWorkLesson8;

public class HomeWorkLesson8_2 {
    static final double PI = 3.14;
    void circleArea (int r) {
        System.out.println("Площадь круга: " + PI * r * r);
    }
    static void circleLength (int r) {
        System.out.println("Длина окружности круга: " + 2 * PI * r);
    }
    void showInfo (int r) {
        circleArea(r);
        circleLength(r);
        System.out.println("Радиус окружности: " + r);
    }

}

class HomeWorkLesson8_2Test {
    public static void main(String[] args) {
        HomeWorkLesson8_2 krug1 = new HomeWorkLesson8_2();
        krug1.circleArea(4);
        System.out.println();
        HomeWorkLesson8_2.circleLength(87);
        System.out.println();
        krug1.showInfo(321);
    }
}
