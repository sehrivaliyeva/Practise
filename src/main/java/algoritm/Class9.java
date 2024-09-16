package algoritm;

public class Class9 {
    public static void main(String[] args) {
        //bir eded sirali array verilir ve n eded verilir n ededinin bu arrayde nece defe kecdiyini hesabla

        int arr[] = {1, 1, 4, 4, 4, 5, 5, 5};
        int n = 1;
        int count=0;
         for( int i=0; i<arr.length;i++){
             if(arr[i]==4){
                 count++;
             }
         }
        System.out.println("arrayde "+n+" ededinden "+count +" defe istifade olunub");

    }
}
