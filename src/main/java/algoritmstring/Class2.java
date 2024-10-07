package algoritmstring;

import java.util.HashSet;
import java.util.Set;

public class Class2 {
    public static void main(String[] args) {
        //Stringdeki dublicate eleemntleri cap et
        String soz = "aazerbayyyyyyycanb";
        char[] arr = soz.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int count=0;
        for(Character c : set) {
            count=0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == c) {
                    count++;
                }

            }
            if (count>1) {
                System.out.println(c+" elementinden "+count+" defe istifade olunub ");
            }
        }
    }
}
