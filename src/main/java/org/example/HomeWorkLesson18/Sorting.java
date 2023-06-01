package org.example.HomeWorkLesson18;

public class Sorting {
    static void sortirovka (int [] ar1) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int i = 0;i< ar1.length-1;i++) {
                if (ar1[i]>ar1[i+1]) {
                    int temp = ar1[i];
                    ar1[i] = ar1[i+1];
                    ar1[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a1 = {5,3,6,1,2};
        for (int i = 0; i< a1.length;i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println(" ");
        sortirovka(a1);
        for (int i = 0; i< a1.length;i++) {
            System.out.print(a1[i] + " ");
        }
    }
}
