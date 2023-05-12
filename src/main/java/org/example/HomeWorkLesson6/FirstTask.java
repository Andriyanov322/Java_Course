package org.example.HomeWorkLesson6;
public class FirstTask {
    void sum () {
        System.out.println("Не были введены числа");
    }
    void sum (int i1) {
        System.out.println("Введеное число: " + i1);
    }
    void sum (int i1, int i2) {
        System.out.println("Сумма двух чисел: " + (i1 + i2));
    }
    void sum (int i1, int i2, int i3) {
        System.out.println("Сумма трех чисел: " + (i1 + i2 + i3));
    }
    void sum (int i1, int i2, int i3, int i4) {
        System.out.println("Сумма четырех чисел: " + (i1 + i2 + i3 + i4));
    }

    public static void main(String[] args) {
        FirstTask ft1 = new FirstTask();
        ft1.sum();
        ft1.sum(5);
        ft1.sum(5,3);
        ft1.sum(5,1,78);
        ft1.sum(73,12,5,21);
    }
}
