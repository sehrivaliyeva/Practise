package algoritmarray;

import java.util.Arrays;

public class Class15 {
    public static void main(String[] args) {
        // sortlasdiririq sonra tek index ile cut indexlilerin yerini deyisirik
        int arr[]={10, 5, 6, 3, 2, 20, 100, 80};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));


        // 2,4,6,8,10,12,14


    }
}
