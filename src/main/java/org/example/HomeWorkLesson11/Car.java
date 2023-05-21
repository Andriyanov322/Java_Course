package org.example.HomeWorkLesson11;


public class Car {
    String color;
    String engine;
    int doorAmount;
    Car(String color, String engine, int doorAmount) {
        this.color = color;
        this.engine = engine;
        this.doorAmount = doorAmount;
    }
    void changeAmountDoor (int doors) {
        doorAmount = doors;
    }
    static void carSwap (Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Red","V6",4);
        c1.changeAmountDoor(5);
        System.out.println(c1.doorAmount);
        Car c2 = new Car("Black","V8", 6);
        carSwap(c1,c2);
        System.out.println(c1.color);
        System.out.println(c2.color);
    }
}
