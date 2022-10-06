package snippets.collecectionApis;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // {key:value, key2:value2 ...}

        // France: Paris
        // Italy: Rome
        // Norway: Oslo
        // US: Washington DC

        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("France","Paris");
        countryCapitals.put("Italy", "Rome");
        countryCapitals.put("Norway", "Oslo");
        countryCapitals.put("US", "Washington DC");
        countryCapitals.remove("Italy");

        HashMap<Integer, String> capitals = new HashMap<>();
        capitals.put(1,"Paris");
        capitals.put(2, "Rome");
        capitals.put(3, "Oslo");
        capitals.put(4, "Washington DC");


        System.out.println(capitals.get(3));



    }
}
