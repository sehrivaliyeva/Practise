package algoritmarray;

import java.util.HashSet;
import java.util.Set;

public class Class13 {
    public static void main(String[] args) {
        //majorty elemnti tapim
        //yeni arrayin  arr.size() / 2 times islenen elementi

        int arr[] = {3, 3, 3, 5, 6, 1};
        int shert=(arr.length)/2;


        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
            set.add(a);
        }
        int count = 0;
        for (int a : set) {
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == a) {
                    count++;
                }


            }
            if(count>=shert){
                System.out.println("major element "+a);
            }
        }
    }
}
