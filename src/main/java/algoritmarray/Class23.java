package algoritmarray;

public class Class23 {
    public static void main(String[] args) {
        //Arrayde buraxilmis elementdi tapin
        //burada mentiq odur ki  elementler sirali ve ya mueyyen ferq ile duzulurler


        // Arrayde buraxilmis elementi tapin
        int arr[] = {2, 4, 6, 8, 12};

        // length-2 yazdigimiz icin i+2 olanda kod partlamir
        for (int i = 0; i < arr.length - 2; i++) {
            int diff1 = arr[i + 1] - arr[i];     // İlk iki komşu arasındaki fark
            int diff2 = arr[i + 2] - arr[i + 1]; // Sonraki iki komşu arasındaki fark

            // Eğer ardışık iki fark eşit değilse eksik elemanı bul
            if (diff1 != diff2) {
                int missingElement = arr[i] + diff1; // diff2 kullanarak eksik eleman
                System.out.println("Buraxilmis element: " + missingElement);
                break;
            }
        }



    }
}

