package org.example.HomeWorkLesson18;

public class ArrayManipulations {
    static void showArray (String [][] ar1) {
        System.out.print("{ ");
        for (int i=0;i<ar1.length;i++) {
            System.out.print("{");
            for (int j=0;j<ar1[i].length;j++) {
                System.out.print(ar1[i][j] + "");
                if (j != ar1[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i != ar1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        String [][] ar1 = {{"Привет"},{"Всем","И","Как"},{"У вас", "Дела"}};
        showArray(ar1);
    }
}
