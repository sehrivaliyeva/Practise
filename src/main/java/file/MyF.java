package file;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class MyF {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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


      /* Reader reader = null;
        try {
            reader = new FileReader(file);
            char[] array1 = new char[(int) file.length()];
            reader.read(array1);
            System.out.println(array1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }*/

        //Byte tipli melumati yazmaq

      /*  OutputStream outputStream = new FileOutputStream(file);
        String soz = "salam men byte yaziram ";
        byte[] array = soz.getBytes();
        outputStream.write(array);
        outputStream.close();*/

        //byte tipli melumati oxumaq

      /*  InputStream inputStream = new FileInputStream(file);
        byte[] array = new byte[(int) file.length()];
        inputStream.read(array);
        inputStream.close();
        String s=new String(array);
        System.out.println(s);*/


        //Object tipli melumat yazmaq


       /* ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        Melumat melumat = new Melumat("Gunel", "Mammadova");
        Melumat melumat2 = new Melumat("Arzu", "Mammadova");
        outputStream.writeObject(melumat);
        outputStream.close();*/

        //Object tipli melumat oxumaq


        /*ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Melumat melumat = (Melumat) objectInputStream.readObject();
        System.out.println(melumat.getName() + " " + melumat.getSurname());*/


        //Path haqqinda nio-dan gelir interfacedir Paths vasitesile yaradilir new ile olmur
        //Files final classdir path metodlarina komek edir

        Path path = Paths.get(file.toURI());
        Path path2 = Paths.get(file.toURI());

        //Files classi
        boolean isSameFile = Files.isSameFile(path, path2);
        long a = Files.size(path);



        //File ozu bir classdir metodlari var dahah kohne classdir


    }
}
