package lesson13;

import java.util.HashMap;
import java.util.Map;

public class Homework13 {

    public static void main(String[] args) {

        HashMap<Integer, String> streetNumberAndNames = new HashMap<>();

        streetNumberAndNames.put(1000, "Liam");
        streetNumberAndNames.put(1001, "Noah");
        streetNumberAndNames.put(1002, "Olivia");
        streetNumberAndNames.put(1003, "Emma");
        streetNumberAndNames.put(1004, "Benjamin");
        streetNumberAndNames.put(1005, "Evelyn");
        streetNumberAndNames.put(1006, "Lucas");

//        Find the name of the person who lives at 1004 based on the street number
        System.out.println(streetNumberAndNames.get(1004));

//        Print out all the odd number streets and its corresponding names

//        first approach
        for (Map.Entry<Integer, String> oddNumberKeys : streetNumberAndNames.entrySet()) {
            if (oddNumberKeys.getKey() % 2 != 0){
                System.out.println(oddNumberKeys.getKey()+" "+oddNumberKeys.getValue());
            }
        }

//        another approach
        for(Integer i: streetNumberAndNames.keySet()){
            if (i % 2 != 0){
                System.out.println(i+" " +streetNumberAndNames.get(i));
            }
        }
    }
}