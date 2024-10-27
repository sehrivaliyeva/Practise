package algoritmstring;

public class Class11 {
    public static void main(String[] args) {
        //Cumledeki sozleri her hansi library istiFADE etmeden tersine cevirin

        String cumle = "salam gozel dunya";
        String words[] = cumle.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
