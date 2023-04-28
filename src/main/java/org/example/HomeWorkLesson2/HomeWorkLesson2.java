package org.example.HomeWorkLesson2;
public class HomeWorkLesson2 {
    public static void main(String[] args) {
        //Запись и вывод числа 12 в различных системах счисления
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0xC;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        //Запись и вывод числа -1300 в различных системах счисления
        short s1 = -1300;
        short s2 = -0b101_0001_0100;
        short s3 = -02424;
        short s4 = -0x514;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        //Запись и вывод числа 0 в различных системах счисления
        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

        //Запись и вывод числа 123456789 в различных системах счисления
        long l1 = 123456789;
        long l2 = 0b111_0101_1011_1100_1101_0001_0101;
        long l3 = 0726746425;
        long l4 = 0x75BCD15;
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

        //Создание переменных типа float, double и boolean и вывод их на экран
        float f1 = 214.5F;
        float f2 = -33.0000005F;
        System.out.println(f1 + " " + f2);

        double d1 = 3333333333333.33333;
        double d2 = 5342342.3424235235423523525;
        System.out.println(d1 + " " + d2);

        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println(boo1 + " " + boo2);

        //Создание переменной типа char тремя способами
        char c1 = 'B';
        char c2 = 423;
        char c3 = '\u01A7';
        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
