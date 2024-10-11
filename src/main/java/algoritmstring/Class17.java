package algoritmstring;

import java.util.HashSet;
import java.util.Set;

public class Class17 {
    public static void main(String[] args) {
        //stringden dublicate elementleri nece sile bilerem?

        String soz = "anatazxydz";
        char arr[] = soz.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character c : arr) {
            set.add(c);
        }


        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        System.out.println(sb);

    }
}
