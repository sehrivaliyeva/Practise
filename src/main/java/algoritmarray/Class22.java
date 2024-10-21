package algoritmarray;

public class Class22 {
    public static void main(String[] args) {
        //bir dene eded verilib ve verilmis arrayin subarrayinin elementlerinin cemi hemin edece beraberidr/
        //hemin subarrayi tapin

        int eded = 1;
        int eded1=0;
        boolean found=false;
        int[] arr = new int[]{2, 3, 6, 8};

        for (int i=0; i<arr.length; i++){
            eded1+=arr[i];
            if (eded1==eded){
               for(int j=0; j<=i; j++){
                   System.out.println(arr[j]);
                   found=true;

               }
            }


        }
       if (found){

       }else {
           System.out.println("bele array tapilmadi !!");
       }
    }
}
