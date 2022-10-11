package lesson11;

import java.util.*;

public class SetsLesson {

    public static void main(String[] args) {
// TreeSet -> [Canada, England, Mexico, USA]
// HashSet -> [Canada, USA, England, Mexico]

//        Set<String> hashSetValue = new HashSet<String>();
//        hashSetValue.add("England");
//        hashSetValue.add("USA");
//        hashSetValue.add("Canada");
//        hashSetValue.add("Canada");
//        hashSetValue.add("Mexico");
//
//        System.out.println( hashSetValue );

//        Set<Integer> hashSet1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
//
//        Set<Integer> hashSet2 = new HashSet<Integer>(Arrays.asList(10, 2, 3, 5, 3));
//
//        Set<Integer> hashSet3 = new HashSet<>(hashSet1);
//        hashSet3.addAll(hashSet2);
//        System.out.println(hashSet3);


//        Set<Integer> hashSet1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
//
//        Set<Integer> hashSet2 = new HashSet<Integer>(Arrays.asList(10, 2, 3, 5, 3));
//
//        Set<Integer> hashSet3 = new HashSet<>(hashSet1);
//        hashSet3.retainAll(hashSet2);
//        System.out.println(hashSet3);

//        Set<Integer> hashSet1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
//
//        Set<Integer> hashSet2 = new HashSet<Integer>(Arrays.asList(10, 2, 3, 5, 3));
//
//        Set<Integer> hashSet3 = new HashSet<>(hashSet1); // (1, 2, 3)
//        hashSet3.removeAll(hashSet2); // (1) -- (10, 2, 3, 5)
//        System.out.println(hashSet3);

//        Set<Integer> hashSet1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
//
//        Set<Integer> hashSet2 = new HashSet<Integer>(Arrays.asList(10, 2, 3, 5));
//
//        Set<Integer> hashSet3 = new HashSet<>(hashSet2);
//        hashSet3.removeAll(hashSet1); // remove hashSet1 from hashSet3
//        System.out.println(hashSet3);

//        Set<Integer> hashSet = new HashSet<Integer>();
//        Set<Integer> removeHashSet = new HashSet<Integer>();
//// to add values in the hashSet
//        for (int i=1; i<=10; i++) {
//            hashSet.add(i);
//        }
//
//        // to get all the values from hashSet
//        for (Integer v : hashSet) {
//            if(v % 2 != 0) {
//                removeHashSet.add(v);
//            }
//        }
//
//        hashSet.removeAll(removeHashSet);
//        System.out.println( hashSet );

//        Set<Integer> hashSet = new TreeSet<Integer>(Arrays.asList(100, 2, 3, 50));
//        System.out.println( hashSet );
//
//        List<Integer> arrayList = new ArrayList<>(Arrays.asList(100, 2, 3, 50));
//        System.out.println( arrayList );

//        System.out.println( contains_blue("blue") );
//            add_element("England");

        // Let's find out the prime number

        System.out.println(isPrime(13));

    }
//    public static boolean isPrime(int number){
//        boolean prime = false;
//
//        // 10 / 2,3,4,5,6
//
//        for(int i=2; i<number; i++) {
//
//            if(number % i != 0) {
//                prime = true;
//            }
//            else {
//                prime = false;
//                break;
//            }
//        }
//        return prime;
//    }

//    public static boolean contains_blue(String arg) {
//        Set<String> hashSet = new HashSet<String>(Arrays.asList("blue", "green", "yellow"));
//        return hashSet.contains(arg);
//    }

//    public static void add_element(String value) {
//        Set<String> hashSet = new HashSet<String>();
//        hashSet.add(value);
//        System.out.println( hashSet );
//    }
//    public static int get_hs_size() {
//         Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(1, 2, 3));
//         return hashSet.size();
//    }

}
