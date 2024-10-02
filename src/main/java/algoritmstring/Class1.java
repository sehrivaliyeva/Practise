package algoritmstring;

public class Class1 {


        public static String longestCommonPrefix(String[] arr) {
            // Eğer dizi boşsa, hiçbir şey yok demektir, "-1" döndür
            if (arr == null || arr.length == 0) {
                return "-1";
            }

            // İlk string'i referans olarak alıyoruz
            String prefix = arr[0];

            // Diğer stringlerle bu referansı kıyaslamaya başlıyoruz
            for (int i = 1; i < arr.length; i++) {
                // Eğer mevcut string bu prefix ile başlamıyorsa
                // Prefix'i küçült ve tekrar dene
                while (arr[i].indexOf(prefix) != 0) {
                    // Prefix'in son karakterini kırp
                    prefix = prefix.substring(0, prefix.length() - 1);

                    // Eğer prefix tamamen silindiyse, ortak bir başlangıç yoktur
                    if (prefix.isEmpty()) {
                        return "-1";
                    }
                }
            }

            // Ortak prefix bulunduysa, onu döndür
            return prefix;
        }

        public static void main(String[] args) {
            String[] arr = {"flower", "flow", "flight"};
            String result = longestCommonPrefix(arr);

            // Eğer "-1" dönerse, ortak prefix olmadığını yazdır
            if (result.equals("-1")) {
                System.out.println("No common prefix");
            } else {
                System.out.println("Longest common prefix: " + result);
            }
        }
    }
