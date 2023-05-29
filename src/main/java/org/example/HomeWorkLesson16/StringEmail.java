package org.example.HomeWorkLesson16;

public class StringEmail {
    static void email (String s1) {
        int blockCount = s1.split(" ").length;
        int count = 0;
        for(int i=0;i<blockCount;i++) {
            int beginIndex = s1.indexOf('@',count);
            int endIndex = s1.indexOf('.',count);
            String outputString = s1.substring(beginIndex + 1, endIndex);
            count = endIndex + 1;
            System.out.println(outputString);
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
        email("BombitGame@gmail.com; godomon@mail.ru; prostakprostakov@yandex.ru");
    }
}
