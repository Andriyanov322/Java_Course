package org.example.HomeWorkLesson22;

public class Animal {
    Animal () {
        System.out.println("I am animal");
    }

    int eyes;

    void eat() {
        System.out.println("Animal eats");
    }

    void drink () {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet () {
        System.out.println("I am Pet");
        eyes = 2;
    }

    int tail = 1;
    int paw = 4;
    String name;
    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }

}

class Dog extends Pet {
    Dog (String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    void play () {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat (String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    void sleep () {
        System.out.println(name + " sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Kiko");
        System.out.println(d1.name + " has a " + d1.paw + " paws");
        Cat c1 = new Cat("Barsik");
        c1.sleep();
    }
}
