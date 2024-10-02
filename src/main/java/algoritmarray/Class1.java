package algoritmarray;

import java.util.HashSet;
import java.util.Set;

public class Class1 {
    public static void main(String[] args) {
        //iki eded array var ve hemin arraylerdeki ortaq elemetleri tapib
        //ayrica arrya yigin yalniz unique elementler olsun

        int[] arr1 = {1, 8, 8, 2, 1};
        int[] arr2 = {1, 2, 5, 6};

        Set<Integer> myset = new HashSet<>();

        for (int a : arr1) {
            myset.add(a);

        }
        Set<Integer> myset1 = new HashSet<>();

       for(int a:arr2){
           if(myset.contains(a)){
               myset1.add(a);

           }
       }
        System.out.println(myset1);

    }
}
