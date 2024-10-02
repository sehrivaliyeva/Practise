package algoritmarray;

import java.util.HashSet;
import java.util.Set;

public class Class2 {
    public static void main(String[] args) {
        //sozde her elentden nece dene oldugunu tap
        String soz = "azerbbaycan";
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < soz.length(); i++) {
           set.add(soz.charAt(i));
        }

        Object [] array=set.toArray();
        int count;
        for(int i=0;i< array.length;i++){
            count=0;
            for(int j=0;j<soz.length();j++){
                if(array[i].equals(soz.charAt(j))){
                    count++;

                }

            }
            System.out.println(array[i]+" elementi "+count+" defe istifade olunub !!");


        }

    }
}
