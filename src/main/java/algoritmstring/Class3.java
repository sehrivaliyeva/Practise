package algoritmstring;

import java.util.*;

public class Class3 {
    public static void main(String[] args) {
        //iki stringin bir biri ile anagram olub olmamasidir
        //yeni strigdeki herflerin yerini deyisende menali bir soz alinmadir

        String soz1 = "ki";
        String soz2 = "ik";

        //her herfden nece dene oldugunu tapiram


        boolean anagram = true;
        char[] chars1 = soz2.toCharArray();
        char[] chars = soz1.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);
        boolean beraberlik= Arrays.equals(chars1, chars);

        if(chars.length!=chars1.length)   {
            System.out.println("anagram deyil !!");


        }else if(!beraberlik){
            System.out.println("anagram deyil");

        }else {
            System.out.println("anagram");
        }


    }


    }

