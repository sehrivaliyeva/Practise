package algoritmstring;

public class Class7 {

        public static void main(String[] args) {

           String soz = "alma";
            String reversed = reverseString(soz, soz.length() - 1);
            System.out.println("Tərs çevrilmiş söz: " + reversed);


        }

        public static String reverseString(String str, int index) {
            if (index < 0) { // Baz vəziyyəti
                return ""; // Boş string qaytar
            } else {
                return str.charAt(index) + reverseString(str, index - 1);
            }
        }



    }



