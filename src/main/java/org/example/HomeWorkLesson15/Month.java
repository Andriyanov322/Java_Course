package org.example.HomeWorkLesson15;

public class Month {
    static void showTime () {
        int hours = 0;
        UPPER:
        while (hours<6) {
            int minute=-1;
            MIDDLE:
            do {
                minute++;
                int seconds=0;
                if (hours>1 && minute % 10 == 0) {
                    break UPPER;
                }
                INNER:
                while (seconds<60) {
                    if (seconds*hours > minute) {
                        continue MIDDLE;
                    }
                    System.out.println("Время: " + hours + ":" + minute + ":" + seconds + ".");
                    seconds++;
                }
            }
            while (minute<59);
            hours++;
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
