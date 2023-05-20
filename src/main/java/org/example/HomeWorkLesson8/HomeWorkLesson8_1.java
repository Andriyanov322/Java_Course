package org.example.HomeWorkLesson8;

public class HomeWorkLesson8_1 {
    static double multiPly (double a, double b, double c) {
        return a * b * c;
    }
    static void divided (double a, double b) {
        double z1 = a/b;
        double ostatok = a%b;
        double z = (a - ostatok)/b;
        System.out.println("Целое: " + z + " Частное: " + z1 + " Остаток: " + ostatok);
    }
}

class HomeWorkLesson8_1Test {
    public static void main(String[] args) {
        HomeWorkLesson8_1.divided(26,5);
        HomeWorkLesson8_1.divided(8140,47);

        System.out.println(HomeWorkLesson8_1.multiPly(4.5,7.3,231.3));
        System.out.println(HomeWorkLesson8_1.multiPly(5,4,3));
    }
}