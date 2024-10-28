package algoritmarray;

public class Class24 {
    public static void main(String[] args) {
        //iki arrayin birlesmesini yazin
        int arr[] = {2, 4, 5};
        int arr1[] = {3, 7, 8};

        int[] newArray = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            newArray[arr.length+i] = arr1[i];
        }


        for (int i: newArray) {
            System.out.println(i);
        }

    }
}
