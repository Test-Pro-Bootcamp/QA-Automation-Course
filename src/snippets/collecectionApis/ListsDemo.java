package snippets.collecectionApis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsDemo {

    public static void main(String[] args) {


        List<String> koelPages = new ArrayList<>();

        koelPages.add("LoginPage");
        koelPages.set(0, "RegistrationPage");
        koelPages.add("HomePage");
        koelPages.add("ProfilePage");
        koelPages.add("APage");
        koelPages.add("ZPage");
        Collections.sort(koelPages);
        Collections.reverse(koelPages);

        for(String i: koelPages) {
            System.out.println(i);
        }

//        System.out.println(koelPages);

    }



}
