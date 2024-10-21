package algoritmstring;

public class Class6 {
    public static void main(String[] args) {
        //stringin tekce reqemlerden ibaret olub olmadigini yoxla
        String soz = "12p6";

        try {
            int a=Integer.parseInt(soz);
        }catch(NumberFormatException e) {
            System.out.println("verilmis string tekce reqemlerden ibaret deyil !!");

        }

    }
}
