package algoritmarray;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Class8 {
    public static void main(String[] args) {
       /* Bu sualda sizə fərqli elementlərdən ibarət olan bir array (arr[]) verilir
       və həmçinin bir rəqəm K verilir. K rəqəmi array-in ölçüsündən
        kiçikdir. Məqsədiniz, bu array-dakı K-cı ən kiçik elementi tapmaqdır.

        Sualların tələbləri:
        Array: Verilən array-da bütün elementlər bir-birindən fərqlidir.
                K: K array-dəki ən kiçik elementlərin sıralamasında neçəinci element olduğunu bildirir. Məsələn, K=3 olarsa, array-in sıralanmış vəziyyətindəki üçüncü ən kiçik elementi tapmaq lazımdır.
        Çıxış: K-cı ən kiçik element çıxışda göstərilməlidir.
                Misal 1:
        Input:

        arr[] = {7, 10, 4, 3, 20, 15}
        K = 3
        emeliyyat

        Array-i sıralayırıq: {3, 4, 7, 10, 15, 20}
        Sıralanmış array-də 3-cü ən kiçik element 7-dir.*/

        int arr[] = {2, 5, 7, 4, 1, 9};
        int k = 4;
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==k){
                System.out.println(arr[k]);;
            }

        }
    }
}