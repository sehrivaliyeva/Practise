package exceptions;

public class Mycalss {
    public static void main(String[] args) {

        //mesajlarin cap olunma sekli


        try {
            int a = 50 / 0;
        } catch (Exception e) {
            System.out.println(e);
            //java.lang.ArithmeticException: / by zero  ------ bu sekilde cap olunur
        }

       try {
            int a = 50 / 0;
        } catch (Exception e) {
           // e.printStackTrace();
            // java.lang.ArithmeticException: / by zero
            //	at exceptions.Mycalss.main(Mycalss.java:17)-------------bu sekilde cap olunur
        }

        try {
            throw new CustomException("KODUNUZDA XETA VAR !!!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            //KODUNUZDA XETA VAR FORMASINDA CAP OLUNUR

        }

        //eger catch-de hecbir mesaj gosterme funksiyasi istifade etmesek mesaj gorsenmeyecek
        //program sanki exception olmamis kimi run olacaq


    }
}
