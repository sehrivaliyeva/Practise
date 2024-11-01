package algoritmarray;

public class Class25 {
    public static void main(String[] args) {

        //Arrayibasqa array istifade etmeden reverse et
        //ona gore length/2 yazdiq ki cunki qarsin qarsiya duran elementleri evez edirik

        int arr[] = new int[]{2, 4, 6, 8, 10, 12};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = temp;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
