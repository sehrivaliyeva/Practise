package algoritmarray;

import java.util.HashSet;
import java.util.Set;

public class Class18 {
    public static void main(String[] args) {
        //bir dene eded verilib melesen 10 araydeki hasni 2 elemtin ceminin
        // bu edede beraber oldugunu tapin
        int arr[] = {2, 8, 3, 1, 5, 7};
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();

        for (int a : arr) {
            set.add(a);
        }
        for (int a : arr) {
            set1.add(a);
        }

        for (int a : set) {
           for (int b : set1) {
               if (a!=b && (a+b)==10){
                   System.out.println(a+" ve "+b+" elementlerinin cemi 10 dur");
               }
           }
        }

        //HELLINE MUTLEQ BAXX GOOGLEDE VAR ELE KODLARIN OLDUGU YERDE

    }
}
