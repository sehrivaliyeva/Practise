package algoritmarray;

public class Class7 {
    public static void main(String[] args) {
        //arrayi sortlashdir
        int arr[] = {4, 2, 5, 1, 7};
        for (int i = 0; i < arr.length-1; i++) {
          if(arr[i]>arr[i+1]){
              System.out.println(arr[i]);

          }

        }
    }
}
