package algoritmarray;

public class Class12 {
    public static void main(String[] args) {
        //2d array verilib her bir elentin ozu de arraydr yeni.
        //elementleri 0 ve 1 lerden ibaretdir
        //hansi elementde daha cox 1 oldugunu tap

        int[][] arr = {{0, 1, 1}, {1, 1, 1}, {0, 0, 1}};
        int countArraySirasi = 0;
        int count1sayi = 0;


        for (int[] arr1 : arr) {
            countArraySirasi++;
            count1sayi = 0;//burda bunu mutleq yaziriq cunki count sayi her
            // dovrde yenilenmese lap cox olacaq
            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] == 1) {
                    count1sayi++;
                }
            }
            System.out.println(countArraySirasi + " elementde " + count1sayi + " eded 1 var ");
        }
    }
}
