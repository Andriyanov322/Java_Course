package org.example.HomeWorkLesson13;

public class Month {
    static void monthShowInfo (int i) {
        switch(i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В " + i + " месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В " + i + " месяце 30 дней");
                break;
            case 2:
                System.out.println("Во " + i + " месяце 28 дней");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }

    public static void main(String[] args) {
        monthShowInfo(5);
        monthShowInfo(2);
        monthShowInfo(11);
        monthShowInfo(41);
    }
}
