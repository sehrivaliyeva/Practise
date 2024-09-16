package algoritm;

public class Class3 {


    public static void main(String[] args) {
        int eded1 = 0;
        int eded2 = 1;
        System.out.print("fibonaci ededleri " + eded1 + " " + eded2);
        for (int i = 0; i < 10; i++) {
            int fibonacci = eded1 + eded2;
            System.out.print(" "+fibonacci  );
            eded1 = eded2;
            eded2 = fibonacci;

        }


    }


}



