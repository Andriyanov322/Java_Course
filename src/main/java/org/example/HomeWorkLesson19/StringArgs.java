package org.example.HomeWorkLesson19;

public class StringArgs {
    static String[] abc(String [] ... array1) {
        int length = 0;
        for(String [] ar2 : array1) {
            length += ar2.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String [] ar2 : array1) {
            for (String s : ar2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String [] target = abc(new String [] {"Vsem", "Privet", "I"}, new String [] {"Vsem","Poka"});
        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i]=null;
                }
            }
        }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
