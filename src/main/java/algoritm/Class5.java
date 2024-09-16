package algoritm;

public class Class5 {
    public static void main(String[] args) {
        //arrayin en max ve min elemntlerini tapin
        int[] arr = {2, 5, 4, 7, 9, 784, 1};
        int max = arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > max) {
                max = arr[a];
            }
        }

        System.out.println("max element " + max);


        //minimum elementi tapmaq
        int[] arr1 = {2, -8,5, 4,0, 7, 9, 784, 1};
        int min = arr[0];
        for (int a = 0; a < arr1.length; a++) {
            if (arr1[a] <min) {
                min = arr1[a];
            }
        }

        System.out.println("min element " + min);

    }
}



