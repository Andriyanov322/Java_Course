package org.example.HomeWorkLesson3;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = i2/d1 + d2%i1 - l;
        System.out.println(result);

        int a = 5;
        int a1 = a-- - --a + ++a + a++ + a;
        System.out.println(a1);
        int b = 8;
        int b1 = ++b - b++ + ++b - --b;
        System.out.println(b1);
    }
}
