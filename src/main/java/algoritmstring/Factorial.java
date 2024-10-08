package algoritmstring;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Baza halı
            return 1;
        } else {
            return n * factorial(n - 1); // Rekursiv hal
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println(num + "! = " + result); // Çıxış: 5! = 120
    }

}
