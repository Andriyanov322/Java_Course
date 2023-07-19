package org.example.HomeWorkLesson25;

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

class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Kira");
        Animal a2 = new Lev("Leva");
        Animal a3 = new Pingvin("Rick");
        Fish a4 = new Mechenosec("Kinjal");
        Bird a5 = new Pingvin("Skiper");
        Mammal a6 = new Lev("Leva 2 - NO WAY");
        Mechenosec a7 = new Mechenosec("Lexa");
        Lev a8 = new Lev("Leva 3 - same");
        Pingvin a9 = new Pingvin("Kowalski");
        Speakable b1 = new Pingvin("Ryadovoy");
        Speakable b2 = new Lev("Maksim");

        Animal [] ar1 = {a1, a2, a3, a4, a5, a6, a7, a8, a9};
        Speakable [] ar2 = {b1, b2, a5, a6, a8, a9};

        for (Animal a: ar1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            }
            else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
            else {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }
        }

        for (Speakable a: ar2) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            }
            else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
            else {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }
        }
    }
}
