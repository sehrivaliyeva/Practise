package algoritmstring;

import java.util.HashSet;
import java.util.Set;

public class Class10 {
    public static void main(String[] args) {
        //Stringde ilk tekrar olunmayan elementi nece cap etmek olar

        String soz = "azerbaycan";
        char[] chars = soz.toCharArray();
        int count;


        for (int i = 0; i < chars.length; i++) {
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(chars[i] + "  ilk tekrar olunmayan elementdir");
                break;
            }


        }

    }

}
