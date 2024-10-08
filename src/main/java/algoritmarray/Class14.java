package algoritmarray;

import java.util.HashSet;
import java.util.Set;

public class Class14 {
    public static void main(String[] args) {
        //sozdeki tekrar olunmayan elementlerden ibaret substringi tapmaq
        String soz = "axafbcda";
        char [] arr= soz.toCharArray();
        for (int i = 0; i < arr.length; i++){
            int a=0;
         String soz2=soz.substring(i,arr.length-1);

            char [] arr2= soz2.toCharArray();
            Set<Character> set2 = new HashSet<>();
            for(Character c:arr2){
                set2.add(c);
            }
            if(soz2.length()==set2.size()){
                System.out.println(soz2);
            }

        }




    }
}
