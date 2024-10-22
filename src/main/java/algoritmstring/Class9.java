package algoritmstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class9 {
    public static void main(String[] args) {
        //verilmis setirde sait ve samitleri hesablayin

        char [] saitler = {'a', 'i', 'o', 'u', 'e'};
        String soz = "azerbaycan";
        char[] sozler = soz.toCharArray();
        int sozlength=sozler.length;
        int saitcount=0;

        List<Character> sozlist = new ArrayList<>();

        for (char c:saitler){
            sozlist.add(c);
        }

        for (char c : sozler) {
            if(sozlist.contains(c)){
                saitcount++;
            }

        }

        int samitcount=sozlength-saitcount;

        System.out.println("saitler  "+saitcount+"  samitler  "+samitcount);

    }
}
