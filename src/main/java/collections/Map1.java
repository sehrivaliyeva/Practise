package collections;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        //Key ve Value cutunu almaq ucun
        //getKey ve getValue metodlari entryde isleyir ancaq

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> set1 : set) {
           // System.out.println(set1.getValue());
        }


        for(Integer s:map.keySet()){
            System.out.println(s);
        }


       Set<Integer>  b=map.keySet();
    }


}
