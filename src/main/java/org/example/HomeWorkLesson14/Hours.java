package org.example.HomeWorkLesson14;

public class Hours {
    static void showTime () {
        UPPER: for (int hours=0;hours<=6;hours++) {
            MIDDLE: for (int minute=0;minute<=60;minute++) {
                if (hours>1 && minute>0 && minute % 10 == 0) {
                    break UPPER;
                }
                for (int seconds=0;seconds<=60;seconds++) {
                    if (seconds*hours > minute) {
                        continue MIDDLE;
                    }
                    System.out.println("Время: " + hours + ":" + minute + ":" + seconds + ".");
                }

            }
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
