package algoritmarray;

public class Class10 {
    public static void main(String[] args) {
        //qarisiq sekilde array verilib 0,1,2-den ibaret hemin arrayi
        //0s 1s ve2s seklinde yigmaliyam

        int arr[] = {1, 2, 0, 1, 1, 2, 0, 2, 2, 1, 0, 0};
        int arr2[] = new int[arr.length];


        int counta = 0;
        int countb = 0;
        int countc = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counta++;
            }
            if (arr[i] == 1) {
                countb++;
            }
            if (arr[i] == 2) {
                countc++;
            }
        }

        for (int i = 0; i < counta; i++) {
            arr2[i] = 0;

        }
        for (int i = counta; i < countb + counta; i++) {
            arr2[i] = 1;

        }
        for (int i = countb + counta; i < countb + countc + counta; i++) {
            arr2[i] = 2;

        }

        for (int element : arr2) {
            System.out.println(element);
        }



    }
}
