package org.example.HomeWorkLesson20;

import java.util.*;

public class AtoZ {
    static ArrayList abc(String ... a) {
    ArrayList <String> all = new ArrayList<>();
    for(String s : a) {
            if(!all.contains(s)) {
                all.add(s);
            }
        }
        Collections.sort(all);
        System.out.println(all);
        return all;
    }

    public static void main(String[] args) {
        abc("privet", "poka", "kak dela", "blin", "list", "vetka", "brick", "roof", "smoke");
    }
}
