package algoritmarray;

import java.util.ArrayList;
import java.util.List;

public class Class11 {
    public static void main(String[] args) {
        //menfi ve musbet ededlerden ibaret array verilib
        //arraydeki musbet elementleri bir terefe mefileri diger terefe yigin
        int arr[] = {-1, 2, 25, -8, 0, 7, -12};
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {

                list.add(arr[i]);
            }
        }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {

                    list2.add( arr[i]);
                }

            }

        for(int a:list){
            list3.add(a);
        }
        for(int a:list2){
            list3.add(a);
        }
        System.out.println(list3);

    }
}
