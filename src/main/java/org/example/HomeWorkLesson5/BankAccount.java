package org.example.HomeWorkLesson5;

public class BankAccount {
    int schet = 0;
    String name;
    String secondName;
    int popolnenitScheta (int plus) {
        schet += plus;
        return schet;
    }
    int snyatieSoScheta (int minus) {
        schet -= minus;
        return schet;
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.name = "Maksim";
        ba1.secondName = "Andriyanov";
        ba1.popolnenitScheta(5412);
        ba1.snyatieSoScheta(3211);
        System.out.println("Баланс аккаунта персоны: " + ba1.name + " " + ba1.secondName + " = " + ba1.schet);
    }
}
