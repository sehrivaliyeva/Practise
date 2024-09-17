package oyun;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int menimXalim = 0;
        int komputerXali = 0;

        while (true) {
            System.out.println("Secimler bunlardir: tas-1, kagit-2, makas-3. Cixmaq ucun 0 ");
            int menSec = scanner.nextInt();
            if (menSec == 0) {
                System.out.println("Oyun sonlandi.");
                break;
            }

            if (menSec < 1 || menSec > 3) {
                System.out.println("Dogru secim edin");
                continue;
            }

            int kompSec = random.nextInt(3) + 1;
            System.out.println("COMPUTER secimi: " + (kompSec == 1 ? "Tas" : kompSec == 2 ? "Kagit" : "Makas"));

            if (kompSec == menSec) {
                System.out.println("hec hece");
            } else if ((menSec == 1 && kompSec == 3) ||
                    (menSec == 2 && kompSec == 1) ||
                    (menSec == 3 && kompSec == 2)) {
                System.out.println("qazandin!");
                menimXalim++;
            } else {
                System.out.println("Computer qazandi!");
                komputerXali++;
            }

            System.out.println("hesab -> Siz: " + menimXalim + ", Computer " + komputerXali);
        }

        scanner.close();
    }
}
