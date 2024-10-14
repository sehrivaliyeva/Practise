package algoritmarray;

import java.util.HashSet;
import java.util.Set;

public class Class19 {
    public static void main(String[] args) {

        //iki massivin kesishmesini tapin

        String arr1[] = {"salam", "hello", "merhaba", "salam"};
        String arr2[] = {"salam1", "merhaba", "merhaba1", "hello", "salam1"};

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (String soz1 : arr1) {
            set1.add(soz1);

        }
        for (String soz2 : arr2) {
            set2.add(soz2);

        }
        Set<String> setOrtaq = new HashSet<>();

        for (String soz3:set2) {
            if (set1.contains(soz3)){
                setOrtaq.add(soz3);
            }
        }

        System.out.println(setOrtaq);

    }
}