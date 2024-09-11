package file;

import java.io.*;
import java.util.Arrays;

public class MyF {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\28 Programmers\\Desktop\\MyFile.txt");
        /*Writer wr = null;
        try {
            wr = new FileWriter(file);
            String word = "salam men yazi yaziram";
            char[] myArray = word.toCharArray();
            wr.write(myArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (wr != null) {
                try {
                    wr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }*/


        Reader reader = null;
        try {
            reader=new FileReader(file);
            char [] array1;
            array1=new char[reader.read()];
           // while(array1.)
           // System.out.println(metn);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            reader.close();
        }

    }
}
