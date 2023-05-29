package org.example.HomeWorkLesson17;

public class StringBuilderEqualance {
    static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2) {
        return sb1 == sb2;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello everyone");
        StringBuilder sb2 = new StringBuilder("Hello everyone");
        System.out.println(ravenstvo(sb1,sb2));
        StringBuilder sb3 = new StringBuilder("Bye everyone");
        StringBuilder sb4 = sb3;
        System.out.println(ravenstvo(sb3,sb4));
    }
}
