package algoritmstring;

public class Class4 {
    public static void main(String[] args) {
        //iki stringin bir birinin eksi olub olmadigini yoxlanaq
        String soz1 = "ata";
        String soz2 = "ana";
        boolean beraberlik = true;

        if (soz1.length() == soz2.length()) {
            for (int i = 0; i < soz1.length(); i++) {
                if (soz1.charAt(i) == soz2.charAt(soz1.length() - 1 - i)) {

                } else {
                    beraberlik = false;
                    break;
                }

            }
            if (beraberlik) {
                System.out.println("beraberdir !!");
            } else {
                System.out.println("beraber deyil !!");
            }


        } else {
            System.out.println("setirlerin uzunluqlari  beraber deyil !!");
        }




    }
}
