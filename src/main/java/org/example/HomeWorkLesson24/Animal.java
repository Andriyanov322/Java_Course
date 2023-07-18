package org.example.HomeWorkLesson24;

public abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{
    Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name) {
        super(name);
    }
    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
    }
    void swim() {
        System.out.println("Меченосец красивая рыба, которая красиво плавает!");
    }
    void eat() {
        System.out.println("Меченосец не хищная рыба, и она ест обычный корм!");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
    }
    void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }
    @Override
    public void speak() {
        System.out.println("Пингвины не умеют спать как соловьи");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
    }
    void eat() {
        System.out.println("Лев, как любой охотник, любит мясо!");
    }
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев - это не самая быстрая кошка!");
    }
}

class Lesson24 {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Алексей");
        m1.eat();
        m1.swim();
        m1.sleep();

        System.out.println();

        Speakable p1 = new Pingvin("Ахаха");
        p1.speak();

        System.out.println();

        Animal l1 = new Lev("Лева");
        System.out.println(l1.name);
        l1.eat();
        l1.sleep();

        System.out.println();

        Mammal l2 = new Lev("Лева 2 - NO WAY");
        System.out.println(l2.name);
        l2.eat();
        l2.run();
        l2.sleep();
        l2.speak();
    }
}