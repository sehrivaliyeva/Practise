package algoritmarray;

public class Class21 {
    public static void main(String[] args) {
        //inetegr arrayini daxilinde 0-lar hemin 0-lari arrayin sonuna yig
        int k = 0;
        int arr[] = {2, 0, 1, 3, 0, 0, 8, 0, 7, 0, 0, 9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                arr[k++] = arr[i];
            }
        }

        while (k < arr.length) {
            arr[k++] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
