package algoritmarray;

public class Class16 {
    public static void main(String[] args) {
        //integer arrayeinde 2ci boyuk elementi tapin
        //ilk novbede max elementi taparam sora bu elemtden her bir elementi cixara
        //hansinda ferq azdirsa demeli 2ci max element odur

        int arr[] = {2, 4, 7, 1, 9, 5};
        int max = arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println("index : "+i+" ferq "+(max-arr[i]));
        }

    }
}
