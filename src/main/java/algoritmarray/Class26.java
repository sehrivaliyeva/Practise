package algoritmarray;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Class26 {
    public static void main(String[] args) {
        //arrayde iki element arasindaki mutleq ferqi tapin
        // bunun ucun mutleq array sort olunmalidir bu zaman iki qosu element arasindaki ferq mutleq ferq olaraq
        //bu en kicik ferq olmalidir

        int arr[] = new int[]{3, 11, 8, 5, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int mutleqFerq=arr[1]-arr[0];
        for (int i = 1; i < arr.length; i++) {

            int currentFerq= arr[i] - arr[i - 1];
           if (currentFerq < mutleqFerq) {
               mutleqFerq = currentFerq;
           }


        }
        System.out.println(mutleqFerq);

    }
}
