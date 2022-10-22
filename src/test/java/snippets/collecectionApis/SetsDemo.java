package java.snippets.collecectionApis;

import java.util.*;

public class SetsDemo {

    public static void main(String[] args) {

        Set<String> uniqueKoelPages = new TreeSet<>();

        uniqueKoelPages.add("LoginPage");
        uniqueKoelPages.add("HomePage");
        uniqueKoelPages.add("HomePage");
        uniqueKoelPages.add("ProfilePage");
        uniqueKoelPages.add("AProfilePage");

        System.out.println(uniqueKoelPages);

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(4);
        set1.add(8);
        set1.add(9);
        set1.add(0);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(7);
        set2.add(5);
        set2.add(4);
        set2.add(0);
        set2.add(7);
        set2.add(5);

        // Union
        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println(set3);

        // intersection
        Set<Integer> setIntersection = new HashSet<>(set1);
        setIntersection.retainAll(set2);
        System.out.println(setIntersection);

        // Differences
        Set<Integer> setDifference = new HashSet<>(set1);
        setDifference.removeAll(set2);
        System.out.println(setDifference);

    }
}
